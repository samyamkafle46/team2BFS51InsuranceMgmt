package Models;

public class Category {
    private int categoryId;
    private String categoryName;
    private String categoryType;
    private String categoryDescription;
// This constructor should be used when creating a new category
// The categoryId should be auto-generated or assigned by the database
    public Category( String categoryName, String categoryType, String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.categoryDescription = categoryDescription;
    }
    //// This constructor can be used when retrieving an existing category from the database
    public Category(int categoryId, String categoryName, String categoryType, String categoryDescription) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryType = categoryType;
        this.categoryDescription = categoryDescription;

    }
    public Category(){

    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(String categoryType) {
        this.categoryType = categoryType;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }
    public String toString() {
        return "Category: " +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryType='" + categoryType + '\'' +
                ", categoryDescription='" + categoryDescription + '\''
                ;
    }

}
