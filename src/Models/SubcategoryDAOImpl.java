package Models;

import java.util.ArrayList;
import java.util.List;

public class SubcategoryDAOImpl implements SubCategoryDAO {
    private List <SubCategory> subCategories;
    public SubcategoryDAOImpl(){
        subCategories = new ArrayList<>();

    }

    @Override
    public void addSubCategory(SubCategory newSubCategory) {
        subCategories.add(newSubCategory);

    }

    @Override
    public List<SubCategory> getAllSubCategories() {
        return new ArrayList<>(subCategories);
    }

    @Override
    public void updateSubCategory(SubCategory subCategoryToUpdate) {
        int index = subCategories.indexOf(subCategoryToUpdate);
        if(index != -1){
            subCategories.set(index,subCategoryToUpdate);
        }

    }
    @Override
    public void deleteSubCategory(SubCategory subCategoryToDelete) {
        subCategories.remove(subCategoryToDelete);

    }
}
