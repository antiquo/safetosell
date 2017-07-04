package by.antiquo.safetosell.entity;

public class Category {
    private int categoryId;
    private String categoryNameRU;
    private String categoryNameEN;
    private String categoryDesc;
    private CategoryStatus categoryStatus;
    private String categoryPic;

    public Category() {}

    public Category(int categoryId, String categoryNameRU, String categoryNameEN,
                    String categoryDesc, CategoryStatus categoryStatus, String categoryPic) {
        this.categoryId = categoryId;
        this.categoryNameRU = categoryNameRU;
        this.categoryNameEN = categoryNameEN;
        this.categoryDesc = categoryDesc;
        this.categoryStatus = categoryStatus;
        this.categoryPic = categoryPic;
    }

    public Category(String categoryNameRU, String categoryNameEN,
                    String categoryDesc, CategoryStatus categoryStatus) {
        this.categoryNameRU = categoryNameRU;
        this.categoryNameEN = categoryNameEN;
        this.categoryDesc = categoryDesc;
        this.categoryStatus = categoryStatus;
        this.categoryPic = categoryPic;
    }

    public Category(String categoryNameRU, CategoryStatus categoryStatus) {
        this.categoryNameRU = categoryNameRU;
        this.categoryStatus = categoryStatus;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryNameRU() {
        return categoryNameRU;
    }

    public void setCategoryNameRU(String categoryNameRU) {
        this.categoryNameRU = categoryNameRU;
    }

    public String getCategoryNameEN() {
        return categoryNameEN;
    }

    public void setCategoryNameEN(String categoryNameEN) {
        this.categoryNameEN = categoryNameEN;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public CategoryStatus getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(CategoryStatus categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public String getCategoryPic() {
        return categoryPic;
    }

    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != category.categoryId) return false;
        if (categoryNameRU != null ? !categoryNameRU.equals(category.categoryNameRU) : category.categoryNameRU != null)
            return false;
        if (categoryNameEN != null ? !categoryNameEN.equals(category.categoryNameEN) : category.categoryNameEN != null)
            return false;
        if (categoryDesc != null ? !categoryDesc.equals(category.categoryDesc) : category.categoryDesc != null)
            return false;
        if (categoryStatus != category.categoryStatus) return false;
        return categoryPic != null ? categoryPic.equals(category.categoryPic) : category.categoryPic == null;
    }

    @Override
    public int hashCode() {
        int result = categoryId;
        result = 31 * result + (categoryNameRU != null ? categoryNameRU.hashCode() : 0);
        result = 31 * result + (categoryNameEN != null ? categoryNameEN.hashCode() : 0);
        result = 31 * result + (categoryDesc != null ? categoryDesc.hashCode() : 0);
        result = 31 * result + (categoryStatus != null ? categoryStatus.hashCode() : 0);
        result = 31 * result + (categoryPic != null ? categoryPic.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Category{ " +
                "categoryId=" + categoryId +
                ", categoryNameRU='" + categoryNameRU + '\'' +
                ", categoryNameEN='" + categoryNameEN + '\'' +
                ", categoryDesc='" + categoryDesc + '\'' +
                ", categoryStatus=" + categoryStatus +
                " }";
    }
}
