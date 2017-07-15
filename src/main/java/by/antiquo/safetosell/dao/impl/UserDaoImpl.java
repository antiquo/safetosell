package by.antiquo.safetosell.dao.impl;

import by.antiquo.safetosell.dao.abstr.AbstractDao;
import by.antiquo.safetosell.dao.abstr.UserDao;
import by.antiquo.safetosell.dao.exception.DaoException;
import by.antiquo.safetosell.pool.ConnectionPool;
import by.antiquo.safetosell.pool.ConnectionPoolException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDaoImpl extends AbstractDao implements UserDao {
    private static final Logger logger = LogManager.getLogger(UserDaoImpl.class);
    private static final String REGISTER_NEW_USER_QUERY = "INSERT INTO USER " + "('userMail', 'userNumber', 'userPassword') " +
            "values (?,?,?)";

    @Override
    public void registerNewUser(String userMail, String userNumber, String userPassword) throws DaoException {
        PreparedStatement st = null;
        try {
            connection = ConnectionPool.getInstance().takeConnection();
            st = connection.prepareStatement(REGISTER_NEW_USER_QUERY);
            st.setString(1, userMail);
            st.setString(2, userNumber);
            st.setString(3, userPassword);
            st.executeUpdate();
        } catch (SQLException e) {
            logger.log(Level.ERROR, "SQL Exception", e);
        } catch (ConnectionPoolException e) {
            logger.log(Level.ERROR, "Connection exception", e);
        } finally {
            connection.closeStatement(st);
        }
    }
}
