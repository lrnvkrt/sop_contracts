package com.example.sop_contracts.messages;

import com.example.sop_contracts.enumerations.ApplicationStatus;

public record CreditCheckVerificationMessage(
        String referenceId,
        ApplicationStatus applicationStatus
) {}
