package com.example.sop_contracts.controllers;

import com.example.sop_contracts.models.ApplicationModel;
import com.example.sop_contracts.requests.ApplicationCreationRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.hateoas.CollectionModel;

import java.util.UUID;

public interface ApplicationController {

    @Operation(
            summary = "Add a new credit application",
            description = "Creates a new credit application with the details provided in the request body.",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Application to be added",
                    required = true,
                    content = @Content(schema = @Schema(implementation = ApplicationCreationRequest.class))
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Application successfully created",
                            content = @Content(mediaType = "application/json")
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Invalid input data",
                            content = @Content(mediaType = "application/json")
                    )
            }
    )
    void addApplication(ApplicationCreationRequest applicationCreationRequest);

    @Operation(
            summary = "Get credit application by ID",
            description = "Retrieves a specific credit application by its unique ID.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Application retrieved successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApplicationModel.class))
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Application not found",
                            content = @Content(mediaType = "application/json")
                    )
            }
    )
    ApplicationModel getApplication(
            @Parameter(description = "ID of the application to retrieve") UUID id
    );

    @Operation(
            summary = "Get all applications by client ID",
            description = "Retrieves all credit applications made by a specific client.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Applications retrieved successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApplicationModel.class))
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Client not found",
                            content = @Content(mediaType = "application/json")
                    )
            }
    )
    CollectionModel<ApplicationModel> getAllApplicationsByClient(
            @Parameter(description = "ID of the client to retrieve applications for") UUID id
    );

    @Operation(
            summary = "Get all applications",
            description = "Retrieves all credit applications in the system.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Applications retrieved successfully",
                            content = @Content(mediaType = "application/json", schema = @Schema(implementation = ApplicationModel.class))
                    )
            }
    )
    CollectionModel<ApplicationModel> getAllApplications();
}
