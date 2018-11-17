package com.privalia.springbootexam.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class RestService {
    private RestTemplate restTemplate;

    public RestService() {
        restTemplate = new RestTemplate();
    }

    public <T> T getRequest(String url,  Class<T> clazz) {
        ResponseEntity<T> responseEntity = restTemplate.exchange(url, HttpMethod.GET, null, clazz);
        return responseEntity.getBody();
    }

}
