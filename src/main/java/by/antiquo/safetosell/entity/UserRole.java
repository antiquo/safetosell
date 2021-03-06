package by.antiquo.safetosell.entity;

public enum UserRole {
    GUEST("guest"),
    USER("user"),
    ADMIN("admin"),
    MODERATOR("moderator"),
    BLOCKED("blocked");

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
