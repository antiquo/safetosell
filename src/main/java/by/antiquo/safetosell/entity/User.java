package by.antiquo.safetosell.entity;

/**
 * Created by Antiquo on 03.07.2017.
 */
public class User {
    private int userId;
    private String userLogin;
    private String userMail;
    private String userNumber;
    private String userPassword;
    private String userCity;
    private String userRole;
    private String userPic;

    public User(int userId, String userLogin, String userMail, String userNumber, String userPassword,
                String userCity, String userRole, String userPic){
       this.userId = userId;
       this.userLogin = userLogin;
       this.userMail = userMail;
       this.userNumber = userNumber;
       this.userPassword = userPassword;
       this.userCity = userCity;
       this.userRole = userRole;
       this.userPic = userPic;
    }

    public User (String userLogin, String userMail, String userNumber, String userPassword){
        this.userLogin = userLogin;
        this.userMail = userMail;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
        this.userRole = "user";
    }

    public User (String userMail, String userNumber, String userPassword){
        this.userLogin = userMail;
        this.userMail = userMail;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
        this.userRole = "user";
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (userId != user.userId) return false;
        if (userLogin != null ? !userLogin.equals(user.userLogin) : user.userLogin != null) return false;
        if (userMail != null ? !userMail.equals(user.userMail) : user.userMail != null) return false;
        if (userNumber != null ? !userNumber.equals(user.userNumber) : user.userNumber != null) return false;
        if (userPassword != null ? !userPassword.equals(user.userPassword) : user.userPassword != null) return false;
        if (userCity != null ? !userCity.equals(user.userCity) : user.userCity != null) return false;
        if (userRole != null ? !userRole.equals(user.userRole) : user.userRole != null) return false;
        return userPic != null ? userPic.equals(user.userPic) : user.userPic == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userMail != null ? userMail.hashCode() : 0);
        result = 31 * result + (userNumber != null ? userNumber.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userCity != null ? userCity.hashCode() : 0);
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        result = 31 * result + (userPic != null ? userPic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userLogin='" + userLogin + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userCity='" + userCity + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}
