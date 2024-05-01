package Models;

import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImp implements CategoryDAO {

    private List<Category> categoryList;

    public CategoryDAOImp() {
        this.categoryList = new ArrayList<>();
    }

    public void saveCategory(Category category) {
        categoryList.add(category);
        System.out.println("Category saved: " + category);
    }

    public Category getCategoryByName(String categoryName) {
        for (Category category : categoryList) {
            if (category.getCategoryName().equals(categoryName)) {
                return category;
            }
        }
        return null;
    }

    public void updateCategory(Category category) {
        Category existingCategory = getCategoryByName(category.getCategoryName());
        if (existingCategory != null) {
            existingCategory.setCategoryType(category.getCategoryType());
            existingCategory.setCategoryDescription(category.getCategoryDescription());
            System.out.println("Category updated: " + existingCategory);
        } else {
            System.out.println("Category not found for update: " + category.getCategoryName());
        }
    }

    public void deleteCategory(String categoryName) {
        Category categoryToDelete = getCategoryByName(categoryName);
        if (categoryToDelete != null) {
            categoryList.remove(categoryToDelete);
            System.out.println("Category deleted: " + categoryName);
        } else {
            System.out.println("Category not found for deletion: " + categoryName);
        }
    }
}
