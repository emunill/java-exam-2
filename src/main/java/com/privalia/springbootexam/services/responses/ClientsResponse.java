package com.privalia.springbootexam.services.responses;

import java.util.List;


public class ClientsResponse {

    private List<ClientResponse> clients;

    public void setClients(List<ClientResponse> clients) {
        this.clients = clients;
    }

    public List<ClientResponse> getClients()
    {
        return clients;
    }
}
