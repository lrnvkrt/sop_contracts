package com.example.sop_contracts.enumerations;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description = "Represents the employment status of a client.")
public enum EmploymentStatus {

    @Schema(description = "Client is employed by a company.", example = "0")
    EMPLOYED(0),

    @Schema(description = "Client is self-employed or owns a business.", example = "10")
    SELF_EMPLOYED(10),

    @Schema(description = "Client is currently not employed.", example = "20")
    UNEMPLOYED(20);

    private final int num;

    EmploymentStatus(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}