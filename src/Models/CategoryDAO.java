package Models;

public interface CategoryDAO {
    void saveCategory(Category category);
    Category getCategoryByName(String categoryName);
    void updateCategory(Category category);
    void deleteCategory(String categoryName);
}
