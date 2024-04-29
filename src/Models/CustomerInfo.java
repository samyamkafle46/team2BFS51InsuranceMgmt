package Models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerInfo {
    private int customerID;
    private String customerName;
    private String customerPoneNum;
    private String customerEmailAddress;
    private Set <Category> availableCategory;
    private Set <SubCategory> availableSubCategory;
    private List<Policy>availablePolicies;



    public CustomerInfo(int customerID, String customerName, String customerPoneNum, String customerEmailAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPoneNum = customerPoneNum;
        this.customerEmailAddress = customerEmailAddress;
    }
public CustomerInfo(){

}
    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPoneNum() {
        return customerPoneNum;
    }

    public void setCustomerPoneNum(String customerPoneNum) {
        this.customerPoneNum = customerPoneNum;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public void viewCategories() {
        Set<String> categories = new HashSet<>();

        if(availableCategory == null || availableCategory.isEmpty()) {
            System.out.println("No category available");
        }else{
            for (Category category : availableCategory) {
                int categoryId = category.getCategoryId();
                String categoryName = category.getCategoryName(categoryId);
                if (categoryName != null) {
                    categories.add(categoryName);

                }
            }
            System.out.println("Available Policy Categories: ");
            for(String categoryName : categories){
                System.out.println("-"+ categoryName);
            }
        }

    }

    public void viewSubCategories() {
        Set<String> subCategories = new HashSet<>();
        if (availableSubCategory == null || availableSubCategory.isEmpty()) {
            System.out.println("No Subcategory available");

        } else {
            for (SubCategory subcategory : availableSubCategory) {
                int subcategoryId = subcategory.getSubCategoryId();
                String subcategoryName = subcategory.getSubCategoryName(subcategoryId);
                if (subcategoryName != null) {
                    subCategories.add(subcategoryName);
                }
            }
            System.out.println("Available  sub categories: ");
            for (String subcategoryName : subCategories) {
                System.out.println("-" + subcategoryName);

            }
        }
    }
    public void viewPolicies() {
        if(availablePolicies == null || availablePolicies.isEmpty()){
            System.out.println("No policies available");
        }else{
            System.out.println("Available Polices:");
            for(Policy policy : availablePolicies){
                System.out.println("-"+policy.getPolicyName());
            }
        }
    }

    public void applyForPolicy(Policy policy) {
        if(availablePolicies == null || availablePolicies.isEmpty()){
            System.out.println("No policies available to apply for.");
            return;
        }
        if(availablePolicies.contains(policy)){
            System.out.println("Applying for policy: ");
            boolean applicationSubmitted = submitPolicyApplication(policy);
            if(applicationSubmitted){
                System.out.println("Policy application submitted successfully.");
            }else {
                System.out.println("An error occurred while submitting the policy application.");
            }

        }else{
            System.out.println("The selected policy is not available.");
        }
    }
    private boolean submitPolicyApplication(Policy policy) {
        return true;

    }
}

