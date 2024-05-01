package Models;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Policy {
    private int policyId;
    private String policyName;
    private String policyDescription;
    private int amount;
    private int policyCoverageAmount;



    public Policy(int policyTypeId, String policyName, String policyDescription, int amount, int policyCoverageAmount) {
        this.policyId = policyTypeId;
        this.policyName = policyName;
        this.policyDescription = policyDescription;
        this.amount = amount;
        this.policyCoverageAmount = policyCoverageAmount;

    }
    public Policy(){

    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyTypeId(int policyId) {
        this.policyId = policyId;
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

