package Models;

import java.util.List;

public class SubCategory {
    private int subCategoryId;
    private String subCategoryName;
    private String subCategoryCoverageDetails;
    private Category parentCategory;

    public SubCategory(String subCategoryName, String subCategoryCoverageDetails) {
        this.subCategoryName = subCategoryName;
        this.subCategoryCoverageDetails = subCategoryCoverageDetails;
    }
    public SubCategory(int subCategoryId, String subCategoryName, String subCategoryCoverageDetails) {
        this.subCategoryId = subCategoryId;
        this.subCategoryName = subCategoryName;
        this.subCategoryCoverageDetails = subCategoryCoverageDetails;
    }
    public SubCategory(){

    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    public String getSubCategoryName() {
        return subCategoryName;
    }

    public void setSubCategoryName(String subCategoryName) {
        this.subCategoryName = subCategoryName;
    }

    public String getSubCategoryCoverageDetails() {
        return subCategoryCoverageDetails;
    }

    public void setSubCategoryCoverageDetails(String subCategoryCoverageDetails) {
        this.subCategoryCoverageDetails = subCategoryCoverageDetails;
    }




    }

