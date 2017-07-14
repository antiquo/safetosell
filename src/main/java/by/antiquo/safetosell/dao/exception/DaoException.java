package by.antiquo.safetosell.dao.exception;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DaoException extends Exception {

    public DaoException(String message) {
        super(message);
    }

    public DaoException(String message, Exception exception) {
        super(message, exception);
    }

}
