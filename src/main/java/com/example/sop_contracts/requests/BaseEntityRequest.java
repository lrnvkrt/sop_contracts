package com.example.sop_contracts.requests;

import java.util.UUID;

public abstract class BaseEntityRequest {
    private UUID id;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }
}
