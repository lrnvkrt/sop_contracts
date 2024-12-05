package com.example.sop_contracts.models;

import com.example.sop_contracts.enumerations.EmploymentStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import org.springframework.hateoas.RepresentationModel;

import java.math.BigDecimal;

@Schema(description = "Represents a client with personal, financial and employment details.")
public class ClientModel extends RepresentationModel<ClientModel> {

    @Schema(description = "Full name of the client, including surname, first name and patronymic.",
            example = "Ivanov Ivan Ivanovich")
    private String fullName;

    @Schema(description = "Age of the client, must be 18 or older.",
            example = "25")
    private Integer age;

    @Schema(description = "Email address of the client.",
            example = "ivan@example.com")
    private String email;

    @Schema(description = "Annual income of the client in USD.",
            example = "10000.00")
    private BigDecimal annualIncome;

    @Schema(description = "Total monthly debt payment of the client in USD.",
            example = "1000.00")
    private BigDecimal totalMonthlyDebtPayment;

    @Schema(description = "Current employment status of the client.",
            example = "EMPLOYED")
    private EmploymentStatus employmentStatus;

    protected ClientModel() {}

    public ClientModel(String fullName,
                       Integer age,
                       String email,
                       BigDecimal annualIncome,
                       BigDecimal totalMonthlyDebtPayment,
                       EmploymentStatus employmentStatus) {
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.annualIncome = annualIncome;
        this.totalMonthlyDebtPayment = totalMonthlyDebtPayment;
        this.employmentStatus = employmentStatus;
    }

    @NotBlank(message = "Full name must not be blank.")
    @Size(max = 255, message = "Full name must not exceed 255 characters.")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @NotNull(message = "Age must not be null.")
    @Min(value = 18, message = "Age must be 18 or older.")
    @Max(value = 150, message = "Age must not exceed 150.")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @NotBlank(message = "Email must not be blank.")
    @Email(message = "Email must be a valid email address.")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotNull(message = "Annual income must not be null.")
    @DecimalMin(value = "0.0", inclusive = false, message = "Annual income must be greater than 0.")
    public BigDecimal getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(BigDecimal annualIncome) {
        this.annualIncome = annualIncome;
    }

    @NotNull(message = "Total monthly debt payment must not be null.")
    @DecimalMin(value = "0.0", inclusive = true, message = "Total monthly debt payment must not be negative.")
    public BigDecimal getTotalMonthlyDebtPayment() {
        return totalMonthlyDebtPayment;
    }

    public void setTotalMonthlyDebtPayment(BigDecimal totalMonthlyDebtPayment) {
        this.totalMonthlyDebtPayment = totalMonthlyDebtPayment;
    }

    @NotNull(message = "Employment status must not be null.")
    public EmploymentStatus getEmploymentStatus() {
        return employmentStatus;
    }

    public void setEmploymentStatus(EmploymentStatus employmentStatus) {
        this.employmentStatus = employmentStatus;
    }
}
