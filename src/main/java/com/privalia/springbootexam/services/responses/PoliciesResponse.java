package com.privalia.springbootexam.services.responses;

import java.util.List;


public class PoliciesResponse {

    private List<PolicyResponse> policies;

    public List<PolicyResponse> getPolicies() {
        return policies;
    }

    public void setPolicies(List<PolicyResponse> policies) {
        this.policies = policies;
    }
}
