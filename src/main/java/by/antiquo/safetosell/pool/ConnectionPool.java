package by.antiquo.safetosell.pool;


import by.antiquo.safetosell.dao.DaoException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ConnectionPool {
    private static Logger logger = LogManager.getLogger(ConnectionPool.class);

    private static Lock lock = new ReentrantLock();
    private volatile static boolean instanceCreated = false;
    private static ConnectionPool instance = null;
    private static final String DB_PROPERTIES_FILE = "db";
    private static final String CONNECTION_COUNT = "db.connection_count";
    private static final int MINIMAL_CONNECTION_COUNT = 5;
    private BlockingQueue<ConnectionShell> freeConnections;
    private BlockingQueue<ConnectionShell> givenConnections;

    private ConnectionPool() {
    }

    public static ConnectionPool getInstance() {
        if (!instanceCreated) {
            lock.lock();
            try {
                if (!instanceCreated) {
                    instance = new ConnectionPool();
                    instanceCreated = true;
                }
            } finally {
                lock.unlock();
            }
        }
        return instance;
    }

    public void init() throws ConnectionPoolException {
        ResourceBundle resourceBundle = ResourceBundle.getBundle(DB_PROPERTIES_FILE);
        int connectionCount = 0;
        try {
            connectionCount = Integer.parseInt(resourceBundle.getString(CONNECTION_COUNT));
        } catch (NumberFormatException e) {
            logger.log(Level.ERROR, "Exception while reading connection number, minimal connection count was set");
            connectionCount = MINIMAL_CONNECTION_COUNT;
        }

        freeConnections = new ArrayBlockingQueue<>(connectionCount);
        givenConnections = new ArrayBlockingQueue<>(connectionCount);

        for (int i = 0; i < connectionCount; i++) {
            try {
                ConnectionShell connection = new ConnectionShell();
                if (!connection.getAutoCommit()) {
                    connection.setAutoCommit(true);
                }
                freeConnections.put(connection);
            } catch (DaoException e) {
                throw new ConnectionPoolException("Fatal error, not obtained connection ", e);
            } catch (SQLException e) {
                throw new ConnectionPoolException("Connection SetAutoCommitException", e);
            } catch (InterruptedException e) {
                throw new ConnectionPoolException("pool error", e);
            }
        }
    }

    public ConnectionShell takeConnection() throws ConnectionPoolException {
        ConnectionShell connection;
        try {
            connection = freeConnections.take();
            givenConnections.put(connection);
        } catch (InterruptedException e) {
            throw new ConnectionPoolException("taking connection error", e);
        }
        return connection;
    }


    public void returnConnection(ConnectionShell connection) throws ConnectionPoolException {
        try {
            if (connection.isNull() || connection.isClosed()) {
                throw new ConnectionPoolException("ConnectionWasLostWhileReturning Error");
            }
            try {
                if (!connection.getAutoCommit()) {
                    connection.setAutoCommit(true);
                }
                givenConnections.remove(connection);
                freeConnections.put(connection);
            } catch (SQLException e) {
                logger.log(Level.ERROR, "Connection SetAutoCommitException", e);
            } catch (InterruptedException e) {
                logger.log(Level.ERROR, "Interrupted exception while putting connection into freeConnectionPool", e);
            }
        } catch (SQLException e) {
            logger.log(Level.ERROR, "ConnectionIsClosed Error", e);
        }
    }

    public void destroyPool() {
        for (int i = 0; i < freeConnections.size(); i++) {
            try {
                ConnectionShell connection = freeConnections.take();
                connection.closeConnection();
            } catch (SQLException e) {
                logger.log(Level.ERROR, "DestroyPoolException in freeConnections", e);
            } catch (InterruptedException e) {
                logger.log(Level.ERROR, "Interrupted exception while taking connection from freeConnections for close connection and destroying pool", e);
            }
        }
        for (int i = 0; i < givenConnections.size(); i++) {
            try {
                ConnectionShell connection = givenConnections.take();
                connection.closeConnection();
            } catch (SQLException e) {
                logger.log(Level.ERROR, "DestroyPoolException in givenConnections", e);
            } catch (InterruptedException e) {
                logger.log(Level.ERROR, "Interrupted exception while taking connection from freeConnections for close connection and destroying pool", e);
            }
        }
        try {
            DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
        } catch (SQLException e) {
            logger.log(Level.ERROR, e + " DriverManager wasn't found");
        }
    }
}

