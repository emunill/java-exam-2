package com.privalia.springbootexam.services.responses;

import java.math.BigDecimal;
import java.util.Date;


public class PolicyResponse {

    private String id;
    private BigDecimal amountInsured;
    private String email;
    private Date inceptionDate;
    private Boolean installmentPayment;
    private String clientId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
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
}
