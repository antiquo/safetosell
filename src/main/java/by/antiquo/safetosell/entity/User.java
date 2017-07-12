package by.antiquo.safetosell.entity;

public class User extends CutUser {
    private String userMail;
    private String userNumber;
    private String userPassword;
    private String userCity;
    private int userDiscount;

    public User(int userId, String userLogin, String userMail, String userNumber, String userPassword,
                String userCity, UserRole userRole, String userPic, int userDiscount) {
        super(userId, userRole, userLogin, userPic);
        this.userMail = userMail;
        this.userNumber = userNumber;
        this.userPassword = userPassword;
        this.userCity = userCity;
        this.userDiscount = userDiscount;
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

    public int getUserDiscount() {
        return userDiscount;
    }

    public void setUserDiscount(int userDiscount) {
        this.userDiscount = userDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        if (userDiscount != user.userDiscount) return false;
        if (!userMail.equals(user.userMail)) return false;
        if (!userNumber.equals(user.userNumber)) return false;
        if (!userPassword.equals(user.userPassword)) return false;
        return userCity != null ? userCity.equals(user.userCity) : user.userCity == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + userMail.hashCode();
        result = 31 * result + userNumber.hashCode();
        result = 31 * result + userPassword.hashCode();
        result = 31 * result + (userCity != null ? userCity.hashCode() : 0);
        result = 31 * result + userDiscount;
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
