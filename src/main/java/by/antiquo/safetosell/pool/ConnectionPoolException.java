package by.antiquo.safetosell.pool;

public class ConnectionPoolException extends Exception {

    public ConnectionPoolException(String message) {
        super(message);
    }

    public ConnectionPoolException(String message, Exception exception) {
        super(message, exception);
    }
}
