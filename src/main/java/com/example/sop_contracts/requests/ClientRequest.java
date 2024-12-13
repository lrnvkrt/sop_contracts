package com.example.sop_contracts.requests;

import com.example.sop_contracts.enumerations.EmploymentStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

@Schema(description = "Request object for creating or updating a client with necessary details.")
public class ClientRequest extends BaseEntityRequest {

    @Schema(description = "The CIF (Client Identification Number) of the client", example = "CIF123456")
    @NotNull
    private String cif;

    @Schema(description = "The full name of the client", example = "Ivanov Ivan Ivanovich")
    @NotNull
    private String fullName;

    @Schema(description = "The age of the client", example = "18")
    @NotNull
    private Integer age;

    @Schema(description = "The email address of the client", example = "ivan@example.com")
    @NotNull
    @Email
    private String email;

    @Schema(description = "The annual income of the client", example = "100000.00")
    @NotNull
    private BigDecimal annualIncome;

    @Schema(description = "The total monthly debt payment of the client", example = "1000.00")
    @NotNull
    private BigDecimal totalMonthlyDebtPayment;

    @Schema(description = "The employment status of the client")
    @NotNull
    private EmploymentStatus employmentStatus;

    public ClientRequest() {
    }

    public ClientRequest(String cif,
                         String fullName,
                         Integer age,
                         String email,
                         BigDecimal annualIncome,
                         BigDecimal totalMonthlyDebtPayment,
                         EmploymentStatus employmentStatus) {
        this.cif = cif;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.annualIncome = annualIncome;
        this.totalMonthlyDebtPayment = totalMonthlyDebtPayment;
        this.employmentStatus = employmentStatus;
    }

    // Getter and Setter methods

    public String getCif() {
        return cif;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    public BigDecimal getTotalMonthlyDebtPayment() {
        return totalMonthlyDebtPayment;
    }

    public void setTotalMonthlyDebtPayment(BigDecimal totalMonthlyDebtPayment) {
        this.totalMonthlyDebtPayment = totalMonthlyDebtPayment;
    }

    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}
