package com.privalia.springbootexam.domain;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.DynamicUpdate;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


@Entity
@DynamicUpdate(value = true)
@Table(name="policies")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Policy {
    @Id
    private String id;

    private BigDecimal amountInsured;

    private String email;

    private Date inceptionDate;

    private Boolean installmentPayment;


    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmountInsured() {
        return amountInsured;
    }

    public void setAmountInsured(BigDecimal amountInsured) {
        this.amountInsured = amountInsured;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getInceptionDate() {
        return inceptionDate;
    }

    public void setInceptionDate(Date inceptionDate) {
        this.inceptionDate = inceptionDate;
    }

    public Boolean getInstallmentPayment() {
        return installmentPayment;
    }

    public void setInstallmentPayment(Boolean installmentPayment) {
        this.installmentPayment = installmentPayment;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
