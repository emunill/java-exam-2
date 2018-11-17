package com.privalia.springbootexam.restcontrollers;

import com.privalia.springbootexam.domain.Policy;
import com.privalia.springbootexam.services.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/policy")
public class PolicyRestController {
    @Autowired
    private PolicyService policyService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Policy> findAll() {
        return policyService.getAll();
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
    public Policy findById(@PathVariable String id) {
        return policyService.getPolicyById(id);
    }

}
