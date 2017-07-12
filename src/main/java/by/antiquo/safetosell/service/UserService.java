package by.antiquo.safetosell.service;

import by.antiquo.safetosell.container.Container;
import by.antiquo.safetosell.entity.User;

public interface UserService {
    void registerUser(String userMail, String userNumber, String userPassword) throws ServiceException;

    User userAuthorization(String userMail, String userPassword) throws ServiceException;

    Container<User> getUsers();

    void blockUserById(int userId);

    void blockUserByMail(String userMail);

    void unblockUserById(int userId);

    void unblockUserByMail(String userMail);
}
