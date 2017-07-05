package by.antiquo.safetosell.entity;

public class Offer extends Entity {
    private int offerId;
    private OfferReason offerReason;
    private OfferState offerState;
    private User offerUser;
    private Product offerProduct;


    public Offer() {
    }

    public Offer(int offerId, OfferReason offerReason, OfferState offerState, User offerUser, Product offerProduct) {
        this.offerId = offerId;
        this.offerReason = offerReason;
        this.offerState = offerState;
        this.offerUser = offerUser;
        this.offerProduct = offerProduct;
    }

    public Offer(OfferReason offerReason, OfferState offerState, User offerUser, Product offerProduct) {
        this.offerReason = offerReason;
        this.offerState = offerState;
        this.offerUser = offerUser;
        this.offerProduct = offerProduct;
    }

    public int getOfferId() {
        return offerId;
    }

    public void setOfferId(int offerId) {
        this.offerId = offerId;
    }

    public OfferReason getOfferReason() {
        return offerReason;
    }

    public void setOfferReason(OfferReason offerReason) {
        this.offerReason = offerReason;
    }

    public OfferState getOfferState() {
        return offerState;
    }

    public void setOfferState(OfferState offerState) {
        this.offerState = offerState;
    }

    public User getOfferUser() {
        return offerUser;
    }

    public void setOfferUser(User offerUser) {
        this.offerUser = offerUser;
    }

    public Product getOfferProduct() {
        return offerProduct;
    }

    public void setOfferProduct(Product offerProduct) {
        this.offerProduct = offerProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Offer offer = (Offer) o;

        if (offerId != offer.offerId) return false;
        if (offerReason != offer.offerReason) return false;
        if (offerState != offer.offerState) return false;
        if (!offerUser.equals(offer.offerUser)) return false;
        return offerProduct.equals(offer.offerProduct);
    }

    @Override
    public int hashCode() {
        int result = offerId;
        result = 31 * result + offerReason.hashCode();
        result = 31 * result + offerState.hashCode();
        result = 31 * result + offerUser.hashCode();
        result = 31 * result + offerProduct.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Offer{ " +
                "offerId=" + offerId +
                ", offerReason=" + offerReason +
                ", offerState=" + offerState +
                ", offerUser=" + offerUser.toString() +
                ", offerProduct=" + offerProduct.toString() +
                " }";
    }
}
