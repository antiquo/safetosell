package by.antiquo.safetosell.dao.impl;

import by.antiquo.safetosell.dao.abstr.AbstractDao;
import by.antiquo.safetosell.dao.abstr.UserDao;
import by.antiquo.safetosell.entity.User;

import java.sql.PreparedStatement;

public class UserDaoImpl extends AbstractDao implements UserDao {
    private static final String REGISTER_NEW_USER_QUERY = "INSERT INTO USER " + "('userMail', 'userNumber', 'userPassword') " +
            "values (?,?,?)";

    @Override
    public void registerNewUser(String userMail, String userNumber, String userPassword) {
        PreparedStatement = null;


    }
}
