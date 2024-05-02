package Models;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerDAOImpl implements CustomerDAO {
    private List<CustomerInfo>customerInfoList = new ArrayList<>();
    private static Map<String, String> customerCredentials = new HashMap<>();
    public CustomerDAOImpl() {
        customerCredentials.put("customer1", "pass1");
        customerCredentials.put("customer2", "pass2");

    }


    @Override
    public void addCustomer(CustomerInfo customerInfo) {
        customerInfoList.add(customerInfo);
    }

    @Override
    public void updateCustomer(CustomerInfo customerInfo) {
        int index = getCustomerIndexById(customerInfo.getCustomerID());
        if(index != -1){
            customerInfoList.set(index, customerInfo);
        }else{
            System.out.println("Customer not found");
        }

        }



    @Override
    public void deleteCustomer(CustomerInfo customerInfo) {
        int index = getCustomerIndexById(customerInfo.getCustomerID());
        if(index != -1){
            customerInfoList.remove(index);
        }else{
            System.out.println("Customer not found");
        }

    }
    @Override
    public List<CustomerInfo> getAllCustomer() {
        return new ArrayList<>(customerInfoList);

    }

    @Override
    public CustomerInfo getCustomerById(boolean customerId) {
        return null;
    }

    @Override
    public CustomerInfo getCustomerByID(int customerId) {
        int index = getCustomerIndexById(customerId);
        if (index != -1) {
                return customerInfoList.get(index);
            }
        return null;
    }
    private int getCustomerIndexById(int customerId) {
        for (int i = 0; i < customerInfoList.size(); i++) {
            if (customerInfoList.get(i).getCustomerID() == customerId) {
                return i;
            }
        }
        return -1;
    }

    public boolean authenticate(String username, String password) {
        String storedPassword = customerCredentials.get(username);
        if (storedPassword != null && storedPassword.equals(password)) {
            return true;
        } else {
            return false;
        }
    }


}


