package com.privalia.springbootexam.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@DynamicUpdate(value = true)
@Table(name="clients")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Client {
    @Id
    private String id;

    private String name;

    private String email;

    private String role;


    @OneToMany(mappedBy = "client")
    private List<Policy> policies;

    public Client() {
        policies = new ArrayList<>();
    }
    public Client(String id) {
        super();
        this.setId(id);
        policies = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Policy> getPolicies() {
        return policies;
    }

    public void setPolicies(List<Policy> policies) {
        this.policies = policies;
    }
}
