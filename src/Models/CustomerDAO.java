package Models;

import java.util.List;

interface CustomerDAO {
    void addCustomer(CustomerInfo customerInfo);
    void updateCustomer(CustomerInfo customerInfo);
    void deleteCustomer(CustomerInfo customerInfo);

    CustomerInfo getCustomerByID(int customerId);
    List<CustomerInfo> getAllCustomer();

    CustomerInfo getCustomerById(boolean customerId);
}
