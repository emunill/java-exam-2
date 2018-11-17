package com.privalia.springbootexam.services;

import com.privalia.springbootexam.domain.Policy;
import com.privalia.springbootexam.repositories.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PolicyService {
    @Autowired
    private PolicyRepository policyRepository;

    public Iterable<Policy> getAll() {
        return policyRepository.findAll();
    }

    public Policy getPolicyById(String id) {
        return policyRepository.findById(id).get();
    }
}
