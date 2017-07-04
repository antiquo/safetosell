package by.antiquo.safetosell.entity;

/**
 * Created by Antiquo on 03.07.2017.
 */
public class CutUser extends Entity {
    private int userId;
    private UserRole userRole;
    private String userLogin;
    private String userPic;

    public CutUser(int userId, UserRole userRole, String userLogin, String userPic){
        this.userId = userId;
        this.userRole = userRole;
        this.userLogin = userLogin;
        this.userPic = userPic;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserRole getUserRole() {
        return userRole;
    }

    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
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

        CutUser cutUser = (CutUser) o;

        if (userId != cutUser.userId) return false;
        if (userRole != cutUser.userRole) return false;
        if (userLogin != null ? !userLogin.equals(cutUser.userLogin) : cutUser.userLogin != null) return false;
        return userPic != null ? userPic.equals(cutUser.userPic) : cutUser.userPic == null;
    }

    @Override
    public int hashCode() {
        int result = userId;
        result = 31 * result + (userRole != null ? userRole.hashCode() : 0);
        result = 31 * result + (userLogin != null ? userLogin.hashCode() : 0);
        result = 31 * result + (userPic != null ? userPic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CutUser{ " +
                "userId=" + userId +
                ", userRole=" + userRole +
                ", userLogin='" + userLogin  +
                " }";
    }
}
