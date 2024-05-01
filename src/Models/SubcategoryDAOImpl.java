package Models;

package Models;

public class SubcategoryDAOImpl {
	
	
	public class SubCategoryDAOImpl implements SubCategoryDAO {
	    private List<SubCategory> subCategories;

	    public SubCategoryDAOImpl() {
	        subCategories = new ArrayList<>();
	    }

	    
	    public List<SubCategory> getAllSubCategories() {
	        return subCategories;
	    }

	  
	    public SubCategory getSubCategoryById(int subCategoryId) {
	        for (SubCategory subCategory : subCategories) {
	            if (subCategory.getSubCategoryId() == subCategoryId) {
	                return subCategory;
	            }
	        }
	        return null;
	    }

	     
	    public void addSubCategory(SubCategory subCategory) {
	        subCategories.add(subCategory);
	    }

	    
	    public void updateSubCategory(SubCategory subCategory) {
	        for (int i = 0; i < subCategories.size(); i++) {
	            if (subCategories.get(i).getSubCategoryId() == subCategory.getSubCategoryId()) {
	                subCategories.set(i, subCategory);
	                break;
	            }
	        }
	    }

	    
	    public void deleteSubCategory(int subCategoryId) {
	        subCategories.removeIf(subCategory -> subCategory.getSubCategoryId() == subCategoryId);
	    }
	}

}


