package Models;

public class CustomerInfo {
    private int customerID;
    private String customerName;
    private String customerPoneNum;
    private String customerEmailAddress;

    public CustomerInfo(int customerID, String customerName, String customerPoneNum, String customerEmailAddress) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPoneNum = customerPoneNum;
        this.customerEmailAddress = customerEmailAddress;
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
}
