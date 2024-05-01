package Models;

import java.util.ArrayList;
import java.util.List;

public class PolicyDAOImpl implements PolicyDAO {
    private List<Policy> policies;

    public PolicyDAOImpl() {
        policies = new ArrayList<>();
    }

    @Override
    public void addPolicy(Policy newPolicy) {
        policies.add(newPolicy);

    }

    @Override
    public List<Policy> getAllPolicies() {
        return policies;
    }

    @Override
    public void updatePolicy(Policy policyToUpdate) {
        int index = policies.indexOf(policyToUpdate);
        if (index != 1) {
            policies.set(index, policyToUpdate);
        }

    }

    @Override
    public void deletePolicy(Policy policyToDelete) {
        policies.remove(policyToDelete);
    }

    @Override
    public Policy getPolicyId(int policyNum) {
        for (Policy policy : policies) {
            if (policy.getPolicyId() == policyNum) {
                return policy;
            }
        }
        return null;
    }


}
