package Models;

import java.util.List;

public interface PolicyDAO {
    void addPolicy(Policy newPolicy);

    List<Policy> getAllPolicies();

    void updatePolicy(Policy policyToUpdate);

    void deletePolicy(Policy policyToDelete);


    Policy getPolicyId(int policyNum);
}
