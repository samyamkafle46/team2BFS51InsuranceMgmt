package org.takeo.models;
import java.util.List;

public interface SubCategoryDAO{
    void addSubCategory(SubCategory subCategory);
    void updateSubCategory(SubCategory subCategory);
    void deleteSubCategory(int subCategoryId);
    SubCategory getSubCategoryById(int subCategoryId);
    List<SubCategory> getAllSubCategories();
}