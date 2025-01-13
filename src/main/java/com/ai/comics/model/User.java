package com.ai.comics.model;

import java.time.LocalDateTime;

public class User {
    private Integer userId;
    private String username;
    private String email;
    private String passwordHash;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // Getters and Setters
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + toIndentedString(userId) + ", " +
                "username='" + toIndentedString(username) + '\'' + ", " +
                "email='" + toIndentedString(email) + '\'' + ", " +
                "passwordHash='" + toIndentedString(passwordHash) + '\'' + ", " +
                "createdAt=" + toIndentedString(createdAt) + ", " +
                "updatedAt=" + toIndentedString(updatedAt) +
                '}';
    }

    private String toIndentedString(Object value) {
        if (value == null) {
            return "null";
        }
        return value.toString().replace("\n", "\n    ");
    }
}