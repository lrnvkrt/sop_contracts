package com.example.sop_contracts.requests;

import com.example.sop_contracts.enumerations.Purpose;

import java.math.BigDecimal;
import java.util.UUID;

public class ApplicationCreationRequest extends BaseEntityRequest {

    private BigDecimal amount;

    private Purpose purpose;

    private Integer term;

    private UUID client;

    protected ApplicationCreationRequest() {}

    public ApplicationCreationRequest(BigDecimal amount,
                                      Purpose purpose,
                                      Integer term,
                                      UUID client) {
        this.amount = amount;
        this.purpose = purpose;
        this.term = term;
        this.client = client;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public UUID getClient() {
        return client;
    }

    public void setClient(UUID client) {
        this.client = client;
    }
}
