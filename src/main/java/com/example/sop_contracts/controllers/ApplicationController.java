package com.example.sop_contracts.controllers;

import com.example.sop_contracts.models.ApplicationModel;
import com.example.sop_contracts.requests.ApplicationCreationRequest;
import org.springframework.hateoas.CollectionModel;

import java.util.UUID;

public interface ApplicationController {
    void addApplication(ApplicationCreationRequest applicationCreationRequest);
    ApplicationModel getApplication(UUID id);
    CollectionModel<ApplicationModel> getAllApplicationsByClient(UUID id);
    CollectionModel<ApplicationModel> getAllApplications();

}
