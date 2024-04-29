package Models;

import java.util.List;

public class AdminImpl implements AdminDAO {
    private CategoryDAO categoryDAO;
    private SubCategoryDAO subCategoryDAO;
    PolicyDAO policyDAO;

    private  CustomerDAO customerDAO;

    public AdminImpl (){
        //categoryDAO = new CategoryDAOImpl();
        //subCategoryDAO = new SubcategoryDAOImpl();
        //policyDAO = new PolicyDAOImpl();
        //categoryDAO = new CustomerDAOImpl();
        customerDAO = new CustomerDAOImpl();


    }
    @Override
    public void viewUsers() {
        List<CustomerInfo>customerInfoList = customerDAO.getAllCustomer();
        System.out.println("Customer Information:");
        for(CustomerInfo customerInfo: customerInfoList){
            System.out.println("ID: "+ customerInfo.getCustomerID());
            System.out.println("Name: " + customerInfo.getCustomerName());
            System.out.println("Email: " + customerInfo.getCustomerEmailAddress());
            System.out.println("Phone: " + customerInfo.getCustomerPoneNum());
            System.out.println("---------------");
        }


    }

    @Override
    public void manageCategories() {
        // Add a new category
        Category category = new Category();
        categoryDAO.addCategory(category);
        // View all category

        List<Category>categories = categoryDAO.getAllCategories();
        for (Category category1: categories){
            System.out.println(category1.getName());
        }
        // Update a category

        Category categoryToUpdate = categories.get(0);
        categoryToUpdate.setName();
        categoryDAO.updatedCategory(categoryToUpdate);

        // Delete a category
        Category categoryToDelete = categories.get(1);
        categoryDAO.deleteCategory(categoryToDelete);

    }

    @Override
    public void manageSubCategories() {
        // Add a new sub-category
        SubCategory newSubCategory = new SubCategory();
        subCategoryDAO.addSubCategory(newSubCategory);

        // View all sub-categories
        List<SubCategory> subCategories = subCategoryDAO.getAllSubCategories();
        for (SubCategory subCategory : subCategories) {
            System.out.println(subCategory.getName());
        }

        // Update a sub-category
        SubCategory subCategoryToUpdate = subCategories.get(0);
        subCategoryToUpdate.setName();
        subCategoryDAO.updateSubCategory(subCategoryToUpdate);

        // Delete a sub-category
        SubCategory subCategoryToDelete = subCategories.get(1);
        subCategoryDAO.deleteSubCategory(subCategoryToDelete);
    }

    @Override
    public void managePolices() {
        // Add a new policy
        Policy newPolicy = new Policy();
        policyDAO.addPolicy(newPolicy);

        // View all policies
        List<Policy> policies = policyDAO.getAllPolicies();
        for (Policy policy : policies) {
            System.out.println(policy.getName());
        }

        // Update a policy
        Policy policyToUpdate = policies.get(0);
        policyToUpdate.setDescription();
        policyDAO.updatePolicy(policyToUpdate);

        // Delete a policy
        Policy policyToDelete = policies.get(1);
        policyDAO.deletePolicy(policyToDelete);
    }


    @Override
    public void manageBuyerPolices() {
        // View buyer policy requests
        List<Policy> buyerPolicyRequests = policyDAO.getAllBuyerPolicyRequests();
        for (Policy request : buyerPolicyRequests) {
            System.out.println(request.getCustomerId() + ": " + request.getPolicyId());
        }

        // Activate a buyer policy request
        Policy requestToActivate = buyerPolicyRequests.get(0);
        CustomerInfo customer = customerDAO.getCustomerById(requestToActivate.getCustomerId());
        Policy policy = policyDAO.getPolicyById(requestToActivate.getPolicyId());
        policyDAO.activateBuyerPolicy(customer, policy);

        // Cancel a buyer policy request
        Policy requestToCancel = buyerPolicyRequests.get(1);
        policyDAO.cancelBuyerPolicyRequest(requestToCancel);


    }
}
