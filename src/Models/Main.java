package Models;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // An instances of DAO implementations
        CategoryDAO categoryDAO = new CategoryDAOImpl();
        SubCategoryDAO subCategoryDAO = new SubcategoryDAOImpl();
        PolicyDAO policyDAO = new PolicyDAOImpl();
        CustomerDAOImpl customerDAO = new CustomerDAOImpl();

        Scanner scanner1 = new Scanner(System.in);
        // An instance of AdminImpl and pass the DAO instances
        AdminDAOImpl admin = new AdminDAOImpl(categoryDAO, subCategoryDAO, policyDAO, customerDAO, scanner1);
        boolean exit = false;


        while (!exit) {
            System.out.println("1. Admin Interface");
            System.out.println("2. Customer Interface");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    adminInterface(admin);

                    break;
                case 2:
                    customerLogin(admin,customerDAO);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");

            }
        }
    }



    private static void adminLogin(AdminDAOImpl adminDAO) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin Login");
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        if (adminDAO.authenticate(username, password)) {
            System.out.println("Login successful!");
            adminInterface(adminDAO);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void customerLogin(AdminDAOImpl admin, CustomerDAOImpl customerDAO) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Customer Login");
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();
        if (customerDAO.authenticate(username, password)) {
            System.out.println("Login successful!");
            customerInterface(admin,customerDAO);
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    private static void adminInterface(AdminDAOImpl admin) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Admin Login");
        System.out.println("Enter Username:");
        String username = scanner.nextLine();
        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        if (admin.authenticate(username, password)) {
            System.out.println("Login successful!");
            System.out.println("Welcome to the Admin Application.");
            System.out.println("1. View Users");
            System.out.println("2. Manage Categories");
            System.out.println("3. Manage Sub -Categories");
            System.out.println("4. Manage Polices");
            System.out.println("Enter your choice: ");
            int adminChoice = scanner.nextInt();
            switch (adminChoice) {
                case 1:
                    admin.viewUsers();
                    break;
                case 2:
                    admin.manageCategories();
                    break;
                case 3:
                    admin.manageSubCategories();
                    break;
                case 4:
                    admin.managePolices();
                    break;
                default:
                    System.out.println("Invalid admin choice");
                    adminInterface(admin);
            }
        }
    }

    private static void customerInterface(AdminDAOImpl admin, CustomerDAOImpl customerDAO) {
        CustomerInfo customerInfo = new CustomerInfo();
        System.out.println("Welcome to the Customer Application");
        System.out.println("1. View Categories");
        System.out.println("2. View SubCategories");
        System.out.println("3. Apply for policy");
        System.out.println("4. View Policies");
        Scanner scanner = new Scanner(System.in);
        int customerChoice = scanner.nextInt();
        int displayIndex;
        switch (customerChoice) {
            case 1:
                displayIndex = 1;
                List<Category> categories = admin.categoryDAO.getAllCategories();
                if (categories.isEmpty()) {
                    System.out.println("No categories available.");
                } else {
                    System.out.println("Categories:");
                    for (Category category1 : categories) {
                        System.out.println(category1.getCategoryId() + ". Category: categoryId=" + category1.getCategoryId() + ", categoryName='" + category1.getCategoryName() + "', categoryType='" +
                                category1.getCategoryType() + "', categoryDescription='" + category1.getCategoryDescription() + "'");

                    }
                }


                break;
            case 2:
                displayIndex = 1;
                List<SubCategory> subCategories = admin.subCategoryDAO.getAllSubCategories();
                if (subCategories.isEmpty()) {
                    System.out.println("No subCategories available.");
                } else {
                    System.out.println("SubCategories:");
                    for (SubCategory subCategory1 : subCategories) {
                        System.out.println(displayIndex + ". " + subCategory1.toString());
                        displayIndex++;
                    }
                }

                break;
            case 3:
                System.out.println("Enter Policy Number:");
                int policyNum = scanner.nextInt();
                Policy policy = admin.policyDAO.getPolicyId(policyNum);
                if (policy != null) {
                    customerInfo.applyForPolicy(policy);
                    System.out.println("Policy applied successfully!");
                } else {
                    System.out.println("Policy not found!");
                }
                break;
            case 4:
                displayIndex = 1;
                List<Policy> policies = admin.policyDAO.getAllPolicies();
                if (policies.isEmpty()) {
                    System.out.println("No policies available.");
                } else {
                    System.out.println("Policies:");
                    for (Policy policy1 : policies) {
                        System.out.println(policy1.toString());
                    }
                }
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}





