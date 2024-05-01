package Models;

public class SubCategoryDAO {
	
	List<SubCategory> getAllSubCategories();
    SubCategory getSubCategoryById(int subCategoryId);
    void addSubCategory(SubCategory subCategory);
    void updateSubCategory(SubCategory subCategory);
    void deleteSubCategory(int subCategoryId);
}
