package com.example.sop_contracts.requests;

import com.example.sop_contracts.enumerations.Purpose;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;
import java.util.UUID;

@Schema(description = "Request object for creating a new application, containing all necessary information.")
public class ApplicationCreationRequest extends BaseEntityRequest {

    @Schema(description = "The amount of the application", example = "10000.00")
    @NotNull
    private BigDecimal amount;

    @Schema(description = "The purpose of the application")
    @NotNull
    private Purpose purpose;

    @Schema(description = "The term (duration) of the application in months", example = "12")
    @NotNull
    private Integer term;

    @Schema(description = "The UUID of the client making the application")
    @NotNull
    private UUID client;

    // Default constructor
    protected ApplicationCreationRequest() {}

    // Constructor with all fields
    public ApplicationCreationRequest(BigDecimal amount, Purpose purpose, Integer term, UUID client) {
        this.amount = amount;
        this.purpose = purpose;
        this.term = term;
        this.client = client;
    }

    // Getter and Setter methods

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
