package by.antiquo.safetosell.entity;

public enum OfferState {
    SENT("sent"),
    PROCESSED("processed"),
    MODERATED("moderated"),
    PUBLISHED("published");

    private String state;

    OfferState (String state) {
        this.state = state;
    }

    public String getOfferState() {
        return this.state;
    }

    public static OfferState getOfferStateFromValue(String value) {
        for (OfferState state: OfferState.values()) {
            if (state.state.equalsIgnoreCase(value)) {
                return state;
            }
        }
        throw new IllegalArgumentException("wrong state");
    }

}
