package Models;

import java.util.List;

public interface CategoryDAO {

    void addCategory(Category category);

    List<Category> getAllCategories();

    void updatedCategory(Category categoryToUpdate);

    void deleteCategory(Category categoryToDelete);

    void updateCategory(Category categoryToUpdate);
}
