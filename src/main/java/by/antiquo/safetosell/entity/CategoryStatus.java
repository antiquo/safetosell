package by.antiquo.safetosell.entity;

public enum CategoryStatus {
    NEW("new"),
    OLD("old"),
    TOP("top"),
    CLOSED("closed");

    private String categoryStatus;

    CategoryStatus(String categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public String getCategoryStatus() {
        return this.categoryStatus;
    }

    public static CategoryStatus getCategoryStatusFromValue(String value) {
        for (CategoryStatus status : CategoryStatus.values()) {
            if (status.categoryStatus.equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("wrong status");
    }
}
