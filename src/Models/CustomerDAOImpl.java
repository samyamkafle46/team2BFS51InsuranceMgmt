package Models;

import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    private List<CustomerInfo>customerInfoList = new ArrayList<>();


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
    }


