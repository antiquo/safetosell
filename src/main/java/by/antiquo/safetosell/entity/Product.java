package by.antiquo.safetosell.entity;

public class Product extends Entity {
    private int productId;
    private String productName;
    private String productDesc;
    private int productState;
    private int productPrice;
    private String productPic;
    private String productAudio;
    private String productVideo;

    public Product() {
    }

    public Product(int productId, String productName, String productDesc, int productState, int productPrice,
                   String productPic, String productAudio, String productVideo) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
        this.productState = productState;
        this.productPrice = productPrice;
        this.productPic = productPic;
        this.productAudio = productAudio;
        this.productVideo = productVideo;
    }

    public Product(String productName, int productState, int productPrice) {
        this.productName = productName;
        this.productState = productState;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public int getProductState() {
        return productState;
    }

    public void setProductState(int productState) {
        this.productState = productState;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductAudio() {
        return productAudio;
    }

    public void setProductAudio(String productAudio) {
        this.productAudio = productAudio;
    }

    public String getProductVideo() {
        return productVideo;
    }

    public void setProductVideo(String productVideo) {
        this.productVideo = productVideo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != product.productId) return false;
        if (productState != product.productState) return false;
        if (productPrice != product.productPrice) return false;
        if (productName != null ? !productName.equals(product.productName) : product.productName != null) return false;
        if (productDesc != null ? !productDesc.equals(product.productDesc) : product.productDesc != null) return false;
        if (productPic != null ? !productPic.equals(product.productPic) : product.productPic != null) return false;
        if (productAudio != null ? !productAudio.equals(product.productAudio) : product.productAudio != null)
            return false;
        return productVideo != null ? productVideo.equals(product.productVideo) : product.productVideo == null;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (productDesc != null ? productDesc.hashCode() : 0);
        result = 31 * result + productState;
        result = 31 * result + productPrice;
        result = 31 * result + (productPic != null ? productPic.hashCode() : 0);
        result = 31 * result + (productAudio != null ? productAudio.hashCode() : 0);
        result = 31 * result + (productVideo != null ? productVideo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Product{ " +
                "productId=" + productId +
                ", productName='" + productName +
                ", productDesc='" + productDesc +
                ", productState=" + productState +
                ", productPrice=" + productPrice +
                " }";
    }
}
