package com.ai.comics.service;

import com.ai.comics.model.User;
import com.ai.comics.model.UserResponse;
import java.util.List;

/**
 * Service interface for managing users.
 */
public interface UserService {

    /**
     * Get all users.
     *
     * @return A list of users.
     * @throws Exception if an error occurs while fetching users.
     */
    List<UserResponse> getAllUsers() throws Exception;

    /**
     * Create a new user.
     *
     * @param user The user to create.
     * @throws Exception if an error occurs while creating the user.
     */
    void createUser(User user) throws Exception;

    /**
     * Delete a user by ID.
     *
     * @param userId The ID of the user to delete.
     * @throws Exception if an error occurs while deleting the user.
     */
    void deleteUserById(Integer userId) throws Exception;

    /**
     * Get a user by ID.
     *
     * @param userId The ID of the user to retrieve.
     * @return The user with the specified ID.
     * @throws Exception if an error occurs while fetching the user.
     */
    UserResponse getUserById(Integer userId) throws Exception;

    /**
     * Update a user by ID.
     *
     * @param userId The ID of the user to update.
     * @param user The user data to update.
     * @throws Exception if an error occurs while updating the user.
     */
    void updateUserById(Integer userId, User user) throws Exception;
}
