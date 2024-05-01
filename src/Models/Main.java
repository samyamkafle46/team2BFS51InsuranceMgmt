package Models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // An instances of DAO implementations
        CategoryDAO categoryDAO = new CategoryDAOImpl();
        SubCategoryDAO subCategoryDAO = new SubcategoryDAOImpl();
        PolicyDAO policyDAO = new PolicyDAOImpl();
        CustomerDAO customerDAO = new CustomerDAOImpl();
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
                    customerInterface(admin);
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


    private static void adminInterface(AdminDAOImpl admin){
        System.out.println("Welcome to the Admin Application.");
        System.out.println("1. View Users");
        System.out.println("2. Manage Categories");
        System.out.println("3. Manage Sub -Categories");
        System.out.println("4. Manage Polices");
        System.out.println("Enter your choice: ");
        Scanner scanner = new Scanner(System.in);
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
        }
    }
    private static void customerInterface(AdminDAOImpl admin) {
        CustomerInfo customerInfo = new CustomerInfo();
        System.out.println("Customer Application");
        System.out.println("1. View Categories");
        System.out.println("2. View SubCategories");
        System.out.println("3. Apply for policy");
        System.out.println("4. View Policies");
        Scanner scanner = new Scanner(System.in);
        int customerChoice = scanner.nextInt();
        switch (customerChoice) {
            case 1:
                customerInfo.viewCategories();
                break;
            case 2:
                customerInfo.viewSubCategories();
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
                customerInfo.viewPolicies();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}





