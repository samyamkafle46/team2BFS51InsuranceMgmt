package Models;

import java.util.List;
import java.util.Scanner;

public class AdminDAOImpl implements AdminDAO {
    private CategoryDAO categoryDAO;
    private SubCategoryDAO subCategoryDAO;
    PolicyDAO policyDAO;

    private CustomerDAO customerDAO;
    private Scanner scanner1;

    public AdminDAOImpl(CategoryDAO categoryDAO, SubCategoryDAO subCategoryDAO, PolicyDAO policyDAO,
                        CustomerDAO customerDAO,Scanner scanner1) {
        this.categoryDAO = categoryDAO;
        this.subCategoryDAO = subCategoryDAO;
        this.policyDAO = policyDAO;
        this.customerDAO = customerDAO;
        this.scanner1 =scanner1;


    }

    @Override
    public void viewUsers() {
        List<CustomerInfo> customerInfoList = customerDAO.getAllCustomer();
        System.out.println("Customer Information:");
        for (CustomerInfo customerInfo : customerInfoList) {
            System.out.println("ID: " + customerInfo.getCustomerID());
            System.out.println("Name: " + customerInfo.getCustomerName());
            System.out.println("Email: " + customerInfo.getCustomerEmailAddress());
            System.out.println("Phone: " + customerInfo.getCustomerPoneNum());
            System.out.println("Enter your choice: ");
        }

    }

    @Override
    public void manageCategories() {
        List<Category> categories = categoryDAO.getAllCategories();
        boolean categoriesExit = categories != null && !categories.isEmpty();
        if (!categoriesExit) {
            System.out.println("No categories found. Do you want to add a new category? (y/n)");
            String choice = scanner1.nextLine().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("Enter Category Name: ");
                String categoryName = scanner1.nextLine();
                System.out.println("Enter Category Type: ");
                String categoryType = scanner1.nextLine();
                System.out.println("Enter Category Description: ");
                String categoryDescription = scanner1.nextLine();
                Category category = new Category(categoryName, categoryType, categoryDescription);
                categoryDAO.addCategory(category);
                System.out.println("New category added successfully!");
                System.out.println("Do you want to add more categories? (y/n)");
                String addMoreCategoriesChoice = scanner1.nextLine().toLowerCase();
                if (addMoreCategoriesChoice.equals("y")) {// Repeat the process to add another categor
                    manageCategories();

                } else {
                    System.out.println("No category added.");
                }
            } else {
                for (Category category1 : categories) {
                    System.out.println(category1.getCategoryName());
                }

                if (!categories.isEmpty()) {
                    Category categoryToUpdate = categories.get(0);
                    categoryToUpdate.setCategoryName("Updated Category Name");
                    categoryDAO.updateCategory(categoryToUpdate);
                } else {
                    System.out.println("No categories found to update.");
                }

                if (categories.size() > 1) {
                    Category categoryToDelete = categories.get(1);
                    categoryDAO.deleteCategory(categoryToDelete);
                } else {
                    System.out.println("Not enough categories to delete.");
                }
            }
        }
    }
    @Override
    public void manageSubCategories() {
        List<SubCategory> subCategories = subCategoryDAO.getAllSubCategories();
        boolean subCategoriesExist = subCategories != null && !subCategories.isEmpty();

        if (!subCategoriesExist) {
            System.out.println("No sub-categories found. Do you want to add a new sub-category? (y/n)");
            String choice = scanner1.nextLine().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("Enter Sub-Category Name: ");
                String subCategoryName = scanner1.nextLine();
                System.out.println("Enter Sub-Category Description: ");
                String subCategoryDescription = scanner1.nextLine();

                SubCategory subCategory = new SubCategory(subCategoryName, subCategoryDescription);
                subCategoryDAO.addSubCategory(subCategory);
                System.out.println("New sub-category added successfully!");
            } else {
                System.out.println("No sub-category added.");
            }
        } else {
            for (SubCategory subCategory : subCategories) {
                System.out.println(subCategory.getSubCategoryName());
            }

            if (!subCategories.isEmpty()) {
                SubCategory subCategoryToUpdate = subCategories.get(0);
                subCategoryToUpdate.setSubCategoryName("Updated Sub-Category Name");
                subCategoryDAO.updateSubCategory(subCategoryToUpdate);
            } else {
                System.out.println("No sub-categories found to update.");
            }

            if (subCategories.size() > 1) {
                SubCategory subCategoryToDelete = subCategories.get(1);
                subCategoryDAO.deleteSubCategory(subCategoryToDelete);
            } else {
                System.out.println("Not enough sub-categories to delete.");
            }
        }
    }

    @Override
    public void managePolices() {
        List<Policy> policies = policyDAO.getAllPolicies();
        boolean policiesExist = policies != null && !policies.isEmpty();

        if (!policiesExist) {
            System.out.println("No policies found. Do you want to add a new policy? (y/n)");
            String choice = scanner1.nextLine().toLowerCase();
            if (choice.equals("y")) {
                System.out.println("Enter Policy Name: ");
                String policyName = scanner1.nextLine();
                System.out.println("Enter Policy Description: ");
                String policyDescription = scanner1.nextLine();
                System.out.println("Enter Policy Amount: ");
                int policyAmount = scanner1.nextInt();
                scanner1.nextLine();
                System.out.println("Enter Policy Coverage Amount: ");
                int policyCoverageAmount = scanner1.nextInt();
                scanner1.nextLine();

                Policy policy = new Policy(1, policyName, policyDescription, policyAmount, policyCoverageAmount);
                policyDAO.addPolicy(policy);
                System.out.println("New policy added successfully!");
            } else {
                System.out.println("No policy added.");
            }
        } else {
            for (Policy policy : policies) {
                System.out.println("Policy Id: " + policy.getPolicyId());
                System.out.println("Policy Name: " + policy.getPolicyName());
                System.out.println("Amount: " + policy.getAmount());
                System.out.println("Coverage Amount: " + policy.getPolicyCoverageAmount());
                System.out.println("==============================");
            }

            if (!policies.isEmpty()) {
                Policy policyToUpdate = policies.get(1);
                policyToUpdate.setPolicyDescription("Updated Policy Description");
                policyDAO.updatePolicy(policyToUpdate);
            } else {
                System.out.println("No policies found to update.");
            }

            if (policies.size() > 1) {
                Policy policyToDelete = policies.get(1);
                policyDAO.deletePolicy(policyToDelete);
            } else {
                System.out.println("Not enough policies to delete.");
            }
        }
    }
}

