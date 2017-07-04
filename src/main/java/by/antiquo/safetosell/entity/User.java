package by.antiquo.safetosell.entity;

/**
 * Created by Antiquo on 03.07.2017.
 */
public class User extends CutUser {
    private String userMail;
    private String userNumber;
    private String userPassword;
    private String userCity;

    public User(int userId, String userLogin, String userMail, String userNumber, String userPassword,
                String userCity, UserRole userRole, String userPic) {
        super(userId, userRole, userLogin, userPic);
        this.userMail = userMail;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
        this.userCity = userCity;
    }

    public User(String userLogin, String userMail, String userNumber, String userPassword) {
        this.setUserLogin(userLogin);
        this.userMail = userMail;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
    }

    public User(String userMail, String userNumber, String userPassword) {
        this.setUserLogin(userMail);
        this.userMail = userMail;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (userMail != null ? !userMail.equals(user.userMail) : user.userMail != null) return false;
        if (userNumber != null ? !userNumber.equals(user.userNumber) : user.userNumber != null) return false;
        if (userPassword != null ? !userPassword.equals(user.userPassword) : user.userPassword != null) return false;
        return userCity != null ? userCity.equals(user.userCity) : user.userCity == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (userMail != null ? userMail.hashCode() : 0);
        result = 31 * result + (userNumber != null ? userNumber.hashCode() : 0);
        result = 31 * result + (userPassword != null ? userPassword.hashCode() : 0);
        result = 31 * result + (userCity != null ? userCity.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{ " +
                "userId= " + this.getUserId() +
                ", userRole=" + this.getUserRole() +
                ", userLogin='" + this.getUserLogin() +
                ", userMail='" + userMail +
                ", userNumber='" + userNumber +
                ", userPassword='" + userPassword +
                ", userCity='" + userCity +
                " }";
    }
}
