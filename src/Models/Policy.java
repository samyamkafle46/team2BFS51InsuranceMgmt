package Models;

public class Policy {
    private int policyTypeId;
    private String policyName;
    private String policyDescription;
    private int amount;
    private int policyCoverageAmount;
    private int categoryId;

    public Policy(int policyTypeId, String policyName, String policyDescription, int amount, int policyCoverageAmount) {
        this.policyTypeId = policyTypeId;
        this.policyName = policyName;
        this.policyDescription = policyDescription;
        this.amount = amount;
        this.policyCoverageAmount = policyCoverageAmount;
        this.categoryId = categoryId;
    }
    public Policy(){

    }

    public int getPolicyTypeId() {
        return policyTypeId;
    }

    public void setPolicyTypeId(int policyTypeId) {
        this.policyTypeId = policyTypeId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getPolicyDescription() {
        return policyDescription;
    }

    public void setPolicyDescription(String policyDescription) {
        this.policyDescription = policyDescription;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getPolicyCoverageAmount() {
        return policyCoverageAmount;
    }

    public void setPolicyCoverageAmount(int policyCoverageAmount) {
        this.policyCoverageAmount = policyCoverageAmount;
    }


}
