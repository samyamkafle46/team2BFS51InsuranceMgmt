package Category;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CategoryDAOImp{
	

	    private List<Category> categoryList; // Simulating database storage

	    public CategoryDAOImp() {
	        this.categoryList = new ArrayList<>();
	    }

	   
	    public void Category(Scanner scanner) {
	        System.out.println("Enter category name:");
	        String categoryName = scanner.nextLine();
	        System.out.println("Enter category type:");
	        String categoryType = scanner.nextLine();
	        System.out.println("Enter category description:");
	        String categoryDescription = scanner.nextLine();

	        Category category = new Category(categoryName, categoryType, categoryDescription);
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

	
	    public void updateCategory(Scanner scanner) {
	        System.out.println("Enter category name to update:");
	        String categoryNameToUpdate = scanner.nextLine();
	        Category existingCategory = getCategoryByName(categoryNameToUpdate);
	        if (existingCategory != null) {
	            System.out.println("Enter updated category name:");
	            String updatedCategoryName = scanner.nextLine();
	            System.out.println("Enter updated category type:");
	            String updatedCategoryType = scanner.nextLine();
	            System.out.println("Enter updated category description:");
	            String updatedCategoryDescription = scanner.nextLine();

	            existingCategory.setCategoryName(updatedCategoryName);
	            existingCategory.setCategoryType(updatedCategoryType);
	            existingCategory.setCategoryDescription(updatedCategoryDescription);
	            System.out.println("Category updated: " + existingCategory);
	        } else {
	            System.out.println("Category not found for update: " + categoryNameToUpdate);
	        }
	    }

	    public void deleteCategory(Scanner scanner) {
	        System.out.println("Enter category name to delete:");
	        String categoryNameToDelete = scanner.nextLine();
	        Category categoryToDelete = getCategoryByName(categoryNameToDelete);
	        if (categoryToDelete != null) {
	            categoryList.remove(categoryToDelete);
	            System.out.println("Category deleted: " + categoryNameToDelete);
	        } else {
	            System.out.println("Category not found for deletion: " + categoryNameToDelete);
	        }
	    }
	}



