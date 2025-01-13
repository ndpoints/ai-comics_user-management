package com.ai.comics.service;

import com.ai.comics.entity.UserEntity;
import com.ai.comics.model.User;
import com.ai.comics.model.UserResponse;
import com.ai.comics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Implementation of the UserService interface for managing users.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UserResponse> getAllUsers() throws Exception {
        return userRepository.findAll().stream()
                .map(this::convertEntityToModel)
                .collect(Collectors.toList());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void createUser(User user) throws Exception {
        UserEntity userEntity = convertModelToEntity(user);
        userRepository.save(userEntity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteUserById(Integer userId) throws Exception {
        userRepository.deleteById(userId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserResponse getUserById(Integer userId) throws Exception {
        UserEntity userEntity = userRepository.findById(userId)
                .orElseThrow(() -> new Exception("User not found"));
        return convertEntityToModel(userEntity);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateUserById(Integer userId, User user) throws Exception {
        UserEntity existingUserEntity = userRepository.findById(userId)
                .orElseThrow(() -> new Exception("User not found"));
        UserEntity updatedUserEntity = convertModelToEntity(user);
        updatedUserEntity.setUserId(existingUserEntity.getUserId());
        userRepository.save(updatedUserEntity);
    }

    /**
     * Converts a UserEntity to a UserResponse.
     *
     * @param userEntity The UserEntity to convert.
     * @return The converted UserResponse.
     */
    private UserResponse convertEntityToModel(UserEntity userEntity) {
        UserResponse userResponse = new UserResponse();
        userResponse.setUserId(userEntity.getUserId());
        userResponse.setUsername(userEntity.getUsername());
        userResponse.setEmail(userEntity.getEmail());
        userResponse.setCreatedAt(userEntity.getCreatedAt());
        userResponse.setUpdatedAt(userEntity.getUpdatedAt());
        return userResponse;
    }

    /**
     * Converts a User to a UserEntity.
     *
     * @param user The User to convert.
     * @return The converted UserEntity.
     */
    private UserEntity convertModelToEntity(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(user.getUsername());
        userEntity.setEmail(user.getEmail());
        userEntity.setPasswordHash(user.getPasswordHash());
        userEntity.setCreatedAt(user.getCreatedAt());
        userEntity.setUpdatedAt(user.getUpdatedAt());
        return userEntity;
    }
}