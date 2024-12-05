package com.example.sop_contracts.controllers;

import com.example.sop_contracts.models.ClientModel;
import com.example.sop_contracts.requests.ClientRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.hateoas.CollectionModel;

import java.util.UUID;

public interface ClientController {

    @Operation(
            summary = "Add a new client",
            description = "Adds a new client based on the provided request details.",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Details of the client to be added",
                    required = true,
                    content = @Content(schema = @Schema(implementation = ClientRequest.class))
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Client successfully added."
                    ),
                    @ApiResponse(
                            responseCode = "400",
                            description = "Invalid input provided.",
                            content = @Content
                    )
            }
    )
    void addClient(ClientRequest clientRequest);

    @Operation(
            summary = "Update an existing client",
            description = "Updates the details of an existing client based on the provided request.",
            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Updated client details",
                    required = true,
                    content = @Content(schema = @Schema(implementation = ClientRequest.class))
            ),
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Client successfully updated.",
                            content = @Content(schema = @Schema(implementation = ClientModel.class))
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Client not found.",
                            content = @Content
                    )
            }
    )
    ClientModel updateClient(ClientRequest clientRequest);

    @Operation(
            summary = "Get all clients",
            description = "Retrieves a collection of all clients.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "List of clients retrieved successfully.",
                            content = @Content(schema = @Schema(implementation = CollectionModel.class))
                    )
            }
    )
    CollectionModel<ClientModel> getAllClients();

    @Operation(
            summary = "Get a client by ID",
            description = "Retrieves details of a client by their unique identifier.",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Client details retrieved successfully.",
                            content = @Content(schema = @Schema(implementation = ClientModel.class))
                    ),
                    @ApiResponse(
                            responseCode = "404",
                            description = "Client not found.",
                            content = @Content
                    )
            }
    )
    ClientModel getClientById(UUID id);
}
