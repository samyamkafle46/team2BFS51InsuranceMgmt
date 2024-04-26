package Models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AdminImpl admin = new AdminImpl();
        boolean exit = false;

        while (!exit){
            System.out.println("1. Admin Interface");
            System.out.println("2. Customer Interface");
            System.out.println("3. Exit");
            System.out.println("Enter your Choice");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Welcome to the Admin Application.");
                    System.out.println("1. View Users");
                    System.out.println("2. Manage Categories");
                    System.out.println("3. Manage Sub -Categories");
                    System.out.println("4. Manage Polices");
                    System.out.println("5. Manage Buyers Policies");
                    System.out.println("Enter your choice: ");
                    int adminChoice = scanner.nextInt();
                    switch (adminChoice){
                        case 1:
                            admin.viewUsers();
                            break;
                        case 2 :
                            admin.manageCategories();
                            break;

                        case 3:
                            admin.manageSubCategories();
                            break;
                        case 4:
                            admin.managePolices();
                            break;
                        case 5:
                            admin.manageBuyerPolices();
                            break;
                        default:
                            System.out.println("Invalid admin choice");
                    }
                case 2:
                    System.out.println("Enter your ID Number:");
                    int customerID = scanner.nextInt();
                    CustomerInfo customerInfo = new CustomerInfo(customerID);
                    System.out.println("Customer Application");
                    System.out.println("1. View Categories");
                    System.out.println("2. View SubCategories");
                    System.out.println("3. Apply for policy");
                    System.out.println("4. View Policies");
                    int customerChoice = scanner.nextInt();
                    switch (customerChoice){
                        case 1:
                            customerInfo.viewCategories();
                            break;
                        case 2:
                            customerInfo.viewSubCategories();
                        case 3:
                            System.out.println("Enter Policy Number:");
                            int policyNum = scanner.nextInt();
                            Policy policy = admin.policyDAO.getPolicyById(policyNum);
                            if(policy != null){
                                customerInfo.applyForPolicy(policy);
                                System.out.println("Policy applied successfully!")
                            }else {
                                System.out.println("Policy not found!");
                            }
                            break;
                        case 4:
                            customerInfo.viewPolicies();
                            break;
                        default:
                            System.out.println("Invalid choice");

                    }
                    break;
                case 3:

                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");

            }


        }
    }
}