package Category;

public class CategoryDAO {
	
	public interface categoryDAO {
	    void saveCategory(Category category);
	    Category getCategoryByName(String categoryName);
	    void updateCategory(Category category);
	    void deleteCategory(String categoryName);
	}


}
