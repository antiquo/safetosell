package by.antiquo.safetosell.dao.abstr;

import by.antiquo.safetosell.pool.ConnectionShell;

public class AbstractDao {
    protected ConnectionShell connection;

    public void setConnection(ConnectionShell connection){
        this.connection = connection;
    }
}
