package by.antiquo.safetosell.entity;

public enum Role {
    ADMIN("admin"),
    USER("user"),
    MODERATOR("moderator"),
    BLOCKED("blocked");

    /**
     * Created by ${Antiquo} on 03.07.2017.
     */
    private String value;

    Role(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static Role getRole(String value) {
        for (Role role : Role.values()) {
            if (role.value.equalsIgnoreCase(value)) {
                return role;
            }
        }
        throw new IllegalArgumentException("wrong role");
    }
}
