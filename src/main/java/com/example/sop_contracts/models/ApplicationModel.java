package com.example.sop_contracts.models;

import com.example.sop_contracts.enumerations.ApplicationStatus;
import com.example.sop_contracts.enumerations.Purpose;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;

@Schema(description = "Represents a credit application with financial and purpose details.")
public class ApplicationModel extends RepresentationModel<ApplicationModel> {

    @Schema(description = "Credit amount requested by the applicant.", example = "10000.00")
    private BigDecimal amount;

    @Schema(description = "Purpose of the credit application.", example = "MORTGAGE")
    private Purpose purpose;

    @Schema(description = "Term of the credit in months.", example = "12")
    private Integer term;

    @Schema(description = "Current status of the credit application.", example = "APPROVED")
    private ApplicationStatus applicationStatus;

    protected ApplicationModel() {}

    public ApplicationModel(BigDecimal amount, Purpose purpose, Integer term, ApplicationStatus applicationStatus) {
        this.amount = amount;
        this.purpose = purpose;
        this.term = term;
        this.applicationStatus = applicationStatus;
    }

    @NotNull(message = "Amount must not be null.")
    @DecimalMin(value = "0.01", inclusive = true, message = "Amount must be greater than 0.")
    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @NotNull(message = "Purpose must not be null.")
    public Purpose getPurpose() {
        return purpose;
    }

    public void setPurpose(Purpose purpose) {
        this.purpose = purpose;
    }

    @NotNull(message = "Term must not be null.")
    @Min(value = 1, message = "Term must be at least 1 month.")
    @Max(value = 360, message = "Term must not exceed 360 months.")
    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    @NotNull(message = "Application status must not be null.")
    public ApplicationStatus getApplicationStatus() {
        return applicationStatus;
    }

    public void setApplicationStatus(ApplicationStatus applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}
