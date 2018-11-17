package com.privalia.springbootexam.repositories;

import com.privalia.springbootexam.domain.Client;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface ClientRepository extends CrudRepository<Client, String> {
    List<Client> findByName(String name);
}
