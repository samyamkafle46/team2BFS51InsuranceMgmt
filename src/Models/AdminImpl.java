package Models;

import java.util.List;

public class AdminImpl implements AdminDAO {
    private CategoryDAO categoryDAO;
    private SubCategoryDAO subCategoryDAO;
    private  PolicyDAO policyDAO;

    private  CustomerDAO customerDAO;

    public AdminImpl (){
        categoryDAO = new CategoryDAOImpl();
        subCategoryDAO = new SubcategoryDAOImpl();
        policyDAO = new PolicyDAOImpl();
        categoryDAO = new CustomerDAOImpl();


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

    }

    @Override
    public void manageSubCategories() {

    }

    @Override
    public void managePolices() {

    }

    @Override
    public void manageBuyerPolices() {

    }
}
