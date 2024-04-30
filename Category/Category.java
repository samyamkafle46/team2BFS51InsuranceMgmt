package Category;

public class Category {
	private String categoryName;
	private String categoryType;
	private String categoryDescription;
	
	public Category (String categoryName, String categoryType, String categoryDescription) {
		
		this.categoryName = categoryName;
		this.categoryType = categoryType;
		this.categoryDescription = categoryDescription;
		
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
	                "categoryName='" + categoryName + '\'' +
	                ", categoryType='" + categoryType + '\'' +
	                ", categoryDescription='" + categoryDescription + '\'' +
	                '}';
	    }


}
