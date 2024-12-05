package com.example.sop_contracts.enumerations;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents the status of a credit application.
 */
@Schema(description = "Enumeration of possible application statuses.")
public enum ApplicationStatus {

    @Schema(description = "The application is under review.", example = "REVIEWING")
    REVIEWING(0),

    @Schema(description = "The application has been approved.", example = "APPROVED")
    APPROVED(10),

    @Schema(description = "The application has been rejected.", example = "REJECTED")
    REJECTED(20);

    private final int num;

    ApplicationStatus(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
