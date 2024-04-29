package Models;

import java.util.List;

public interface PolicyDAO {
    void addPolicy(Policy newPolicy);

    List<Policy> getAllPolicies();

    void updatePolicy(Policy policyToUpdate);

    void deletePolicy(Policy policyToDelete);

    List<Policy> getAllBuyerPolicyRequests();

    Policy getPolicyById(Object policyId);

    void activateBuyerPolicy(CustomerInfo customer, Policy policy);

    void cancelBuyerPolicyRequest(Policy requestToCancel);
}
