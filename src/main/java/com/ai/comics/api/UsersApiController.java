package com.ai.comics.api;

import com.ai.comics.model.User;
import com.ai.comics.model.UserResponse;
import com.ai.comics.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@Validated
@RestController
@Tag(name = "users", description = "the users API")
public class UsersApiController implements UsersApi {

    private final UserService userService;

    @Autowired
    public UsersApiController(UserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<List<UserResponse>> usersGet() throws Exception {
        List<UserResponse> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> usersPost(@Parameter(name = "User", description = "", required = true) @Valid @RequestBody User user) throws Exception {
        userService.createUser(user);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<Void> usersUserIdDelete(@Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") Integer userId) throws Exception {
        userService.deleteUserById(userId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @Override
    public ResponseEntity<UserResponse> usersUserIdGet(@Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") Integer userId) throws Exception {
        UserResponse user = userService.getUserById(userId);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Void> usersUserIdPut(@Parameter(name = "userId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("userId") Integer userId,
                                               @Parameter(name = "User", description = "", required = true) @Valid @RequestBody User user) throws Exception {
        userService.updateUserById(userId, user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}