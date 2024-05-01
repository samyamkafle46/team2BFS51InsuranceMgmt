package org.takeo.models;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubCategoryDAOImpl implements SubCategoryDAO {
    private Map<Integer, SubCategory> subCategoryMap;

    public SubCategoryDAOImpl() {
        this.subCategoryMap = new HashMap<>();
    }

    @Override
    public void addSubCategory(SubCategory subCategory) {
        subCategoryMap.put(subCategory.getSubCategoryId(), subCategory);
    }

    @Override
    public void updateSubCategory(SubCategory subCategory) {
        subCategoryMap.put(subCategory.getSubCategoryId(), subCategory);
    }

    @Override
    public void deleteSubCategory(int subCategoryId) {
        subCategoryMap.remove(subCategoryId);
    }

    @Override
    public SubCategory getSubCategoryById(int subCategoryId) {
        return subCategoryMap.get(subCategoryId);
    }

    @Override
    public List<SubCategory> getAllSubCategories() {
        return new ArrayList<>(subCategoryMap.values());
    }
}
