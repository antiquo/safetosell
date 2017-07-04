package by.antiquo.safetosell.entity;

public enum UserRole {
    ADMIN("admin"),
    USER("user"),
    MODERATOR("moderator"),
    BLOCKED("blocked");

    /**
     * Created by Antiquo on 03.07.2017.
     */
    private String role;

    UserRole(String value) {
        this.role = value;
    }

    public String getUserRole() {
        return this.role;
    }

    public static UserRole getUserRoleFromValue(String value) {
        for (UserRole userRole : UserRole.values()) {
            if (userRole.role.equalsIgnoreCase(value)) {
                return userRole;
            }
        }
        throw new IllegalArgumentException("wrong role");
    }
}
