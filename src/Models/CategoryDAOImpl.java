package Models;

import java.util.ArrayList;
import java.util.List;

public class CategoryDAOImpl implements CategoryDAO {
    private List<Category> categories;
    public CategoryDAOImpl(){
        categories = new ArrayList<>();
    }
    @Override
    public void addCategory(Category category) {
        categories.add(category);

    }

    @Override
    public List<Category> getAllCategories() {
        return new ArrayList<>(categories);
    }

    @Override
    public void updatedCategory(Category categoryToUpdate) {
        int index = categories.indexOf(categoryToUpdate);
        if (index != -1) {
            categories.set(index, categoryToUpdate);
        }
    }


    @Override
    public void deleteCategory(Category categoryToDelete) {
        categories.remove(categoryToDelete);
    }


    @Override
    public void updateCategory(Category categoryToUpdate) {
        int index = categories.indexOf(categoryToUpdate);
        if (index != -1) {
            categories.set(index, categoryToUpdate);
        }
    }

    }
