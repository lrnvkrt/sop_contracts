package com.example.sop_contracts.enumerations;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents the purpose of a credit application.
 */
@Schema(description = "Enumeration of possible purposes for a credit application.")
public enum Purpose {

    @Schema(description = "Consumer credit.", example = "CONSUMER")
    CONSUMER(0), // Потребительский кредит

    @Schema(description = "Mortgage credit.", example = "MORTGAGE")
    MORTGAGE(10), // Ипотечный кредит

    @Schema(description = "Auto loan.", example = "AUTO")
    AUTO(20), // Автокредит

    @Schema(description = "Business loan.", example = "BUSINESS")
    BUSINESS(30), // Кредит для бизнеса

    @Schema(description = "Education loan.", example = "EDUCATION")
    EDUCATION(40), // Кредит на образование

    @Schema(description = "Medical loan.", example = "MEDICAL")
    MEDICAL(50), // Кредит на медицинские нужды

    @Schema(description = "Loan refinancing.", example = "REFINANCE")
    REFINANCE(60), // Рефинансирование

    @Schema(description = "Secured loan.", example = "SECURED")
    SECURED(70), // Кредит под залог

    @Schema(description = "Unsecured loan.", example = "UNSECURED")
    UNSECURED(80), // Беззалоговый кредит

    @Schema(description = "Overdraft credit.", example = "OVERDRAFT")
    OVERDRAFT(90); // Овердрафт

    @Schema(description = "Numeric representation of the purpose.")
    private final int num;

    Purpose(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
