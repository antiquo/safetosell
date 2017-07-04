package by.antiquo.safetosell.entity;

public enum OfferReason {
    SALE("sale"),
    EXCHANGE("exchange");

    /**
     * Created by Antiquo on 04.07.2017.
     */
    private String reason;

    OfferReason (String reason) {
        this.reason = reason;
    }

    public String getOfferReason() {
        return this.reason;
    }

    public static OfferReason getOfferReasonfromvalue(String value) {
        for (OfferReason reason: OfferReason.values()) {
            if (reason.reason.equalsIgnoreCase(value)) {
                return reason;
            }
        }
        throw new IllegalArgumentException("wrong reason");
    }
}
