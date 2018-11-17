package com.privalia.springbootexam.restcontrollers;

import com.privalia.springbootexam.domain.Client;
import com.privalia.springbootexam.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/client")
public class ClientRestController {
    @Autowired
    private ClientService clientService;

    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Client> findAll() {
        return clientService.getAll();
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Client> findByName(@PathVariable String name) {
        return clientService.getClientByName(name);
    }

    @RequestMapping(value = "/id/{id}", method = RequestMethod.GET, produces = "application/json")
    public Client findById(@PathVariable String id) {
        return clientService.getClientById(id);
    }
}

