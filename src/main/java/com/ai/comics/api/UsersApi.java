package com.ai.comics.api;

import com.ai.comics.model.User;
import com.ai.comics.model.UserResponse;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-01-13T12:45:49.109084Z[Etc/UTC]", comments = "Generator version: 7.10.0")
@Validated
@Tag(name = "users", description = "the users API")
public interface UsersApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /users : Get all users
     *
     * @return A list of users (status code 200)
     */
    @Operation(
        operationId = "usersGet",
        summary = "Get all users",
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of users", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserResponse.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users",
        produces = { "application/json" }
    )
    
    default ResponseEntity<List<UserResponse>> usersGet(
        
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"user_id\" : 0, \"password_hash\" : \"password_hash\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\", \"username\" : \"username\" }, { \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"user_id\" : 0, \"password_hash\" : \"password_hash\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\", \"username\" : \"username\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /users : Create a new user
     *
     * @param user  (required)
     * @return User created successfully (status code 201)
     */
    @Operation(
        operationId = "usersPost",
        summary = "Create a new user",
        responses = {
            @ApiResponse(responseCode = "201", description = "User created successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/users",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> usersPost(
        @Parameter(name = "User", description = "", required = true) @Valid @RequestBody User user
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * DELETE /users/{userId} : Delete a user by ID
     *
     * @param userId  (required)
     * @return User deleted successfully (status code 204)
     */
    @Operation(
        operationId = "usersUserIdDelete",
        summary = "Delete a user by ID",
        responses = {
            @ApiResponse(responseCode = "204", description = "User deleted successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/users/{userId}"
    )
    
    default ResponseEntity<Void> usersUserIdDelete(
        @Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") Integer userId
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /users/{userId} : Get a user by ID
     *
     * @param userId  (required)
     * @return A single user (status code 200)
     */
    @Operation(
        operationId = "usersUserIdGet",
        summary = "Get a user by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "A single user", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserResponse.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/users/{userId}",
        produces = { "application/json" }
    )
    
    default ResponseEntity<UserResponse> usersUserIdGet(
        @Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") Integer userId
    ) throws Exception {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"updated_at\" : \"2000-01-23T04:56:07.000+00:00\", \"user_id\" : 0, \"password_hash\" : \"password_hash\", \"created_at\" : \"2000-01-23T04:56:07.000+00:00\", \"email\" : \"email\", \"username\" : \"username\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /users/{userId} : Update a user by ID
     *
     * @param userId  (required)
     * @param user  (required)
     * @return User updated successfully (status code 200)
     */
    @Operation(
        operationId = "usersUserIdPut",
        summary = "Update a user by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "User updated successfully")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/users/{userId}",
        consumes = { "application/json" }
    )
    
    default ResponseEntity<Void> usersUserIdPut(
        @Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") Integer userId,
        @Parameter(name = "User", description = "", required = true) @Valid @RequestBody User user
    ) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}