package Models;

import java.util.List;

public interface SubCategoryDAO {
    void addSubCategory(SubCategory SubCategory);

    public List<SubCategory> getAllSubCategories();

    public void updateSubCategory(SubCategory subCategoryToUpdate);

    public void deleteSubCategory(SubCategory subCategoryToDelete);
}
