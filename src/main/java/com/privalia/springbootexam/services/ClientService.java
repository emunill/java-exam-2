package com.privalia.springbootexam.services;

import com.privalia.springbootexam.domain.Client;
import com.privalia.springbootexam.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client getClientById(String id) {
        return clientRepository.findById(id).get();
    }

    public Iterable<Client> getClientByName(String name) {
        return clientRepository.findByName(name);
    }

    public Iterable<Client> getAll() {
        return clientRepository.findAll();
    }

}
