package by.antiquo.safetosell.dao.abstr;

import by.antiquo.safetosell.entity.User;

import java.util.List;


public interface UserDao {
    void registerNewUser(String userMail, String userNumber, String userPassword);
   /* User autorizeUser(String userMail, String password);
    void blockUserById(String userId);
    void blockUser(String userNumberOrMail);
    void unblockUserById(String userId);
    void unblockUser(String userNumberOrMail);
    User showUserInfo(String userId);
    User updateUserInfo(String userId, String userLogin, String userMail, String userNumber, String userPassword,
                        String userCity, String userPic, String userDiscount);
    boolean updateUserPassword(String userId, String oldPassword, String newPassword);
    boolean updateUserPic(String userId, String userPic);
    List<User> showAllUsers();
    List<User> showBlockedUsers();**/
}
