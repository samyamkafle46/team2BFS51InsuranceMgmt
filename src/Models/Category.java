package Models;

public class Category {

	private String categoryID;
	private String categoryName;
	private String categoryType;
	private String categoryDescription;
	
	public Category (String categoryID,  String categoryName, String categoryType, String categoryDescription) {
		
		this.categoryID = categoryID;
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.categoryDescription = categoryDescription;
		
	}
	
	 public String getCategoryID() {
	        return categoryID;
	    }

	    public void setCategoryID(String categoryID) {
	        this.categoryID = categoryID;
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
	        return "Category{" +
	        		"categoryID='" + categoryID + '\'' +
	                "categoryName='" + categoryName + '\'' +
	                ", categoryType='" + categoryType + '\'' +
	                ", categoryDescription='" + categoryDescription + '\'' +
	                '}';
	    }


}
