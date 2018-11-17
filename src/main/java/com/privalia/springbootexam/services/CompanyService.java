package com.privalia.springbootexam.services;

import com.privalia.springbootexam.domain.Client;
import com.privalia.springbootexam.domain.Policy;
import com.privalia.springbootexam.repositories.ClientRepository;
import com.privalia.springbootexam.repositories.PolicyRepository;
import com.privalia.springbootexam.services.responses.ClientResponse;
import com.privalia.springbootexam.services.responses.ClientsResponse;
import com.privalia.springbootexam.services.responses.PoliciesResponse;
import com.privalia.springbootexam.services.responses.PolicyResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;


@Service
public class CompanyService {

    @Autowired
    private RestService restService;

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private Environment env;

    public CompanyService() {
    }

    private void loadAndSaveClients() {
        String url = env.getProperty("company.service.clients.url");
        ClientsResponse response = restService.getRequest(url, ClientsResponse.class);

        for(ClientResponse clientResponse : response.getClients()) {
            Client client = new Client();
            client.setId(clientResponse.getId());
            client.setName(clientResponse.getName());
            client.setEmail(clientResponse.getEmail());
            client.setRole(clientResponse.getRole());

            clientRepository.save(client);
        }
    }

    private void loadAndSavePolicies() {
        String url = env.getProperty("company.service.policies.url");
        PoliciesResponse response = restService.getRequest(url, PoliciesResponse.class);

        for(PolicyResponse policyResponse : response.getPolicies()) {
            Policy policy = new Policy();
            policy.setId(policyResponse.getId());
            policy.setAmountInsured(policyResponse.getAmountInsured());
            policy.setEmail(policyResponse.getEmail());
            policy.setInceptionDate(policyResponse.getInceptionDate());
            policy.setInstallmentPayment(policyResponse.getInstallmentPayment());
            policy.setClient(new Client(policyResponse.getClientId()));

            policyRepository.save(policy);
        }
    }

    public void loadData() {
        this.loadAndSaveClients();
        this.loadAndSavePolicies();
    }
}
