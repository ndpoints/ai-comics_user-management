# User Management API

## Overview

The User Management API is a microservice designed to handle user registration, authentication, and profile management. This API provides endpoints to create, retrieve, update, and delete user information. It is built using the OpenAPI 3.0.0 specification, ensuring a standardized approach to API design and documentation.

### Features
- **User Registration**: Create new user accounts.
- **User Authentication**: Authenticate users and manage sessions.
- **Profile Management**: Retrieve and update user profiles.

### API Endpoints

- `GET /users`: Retrieve a list of all users.
- `POST /users`: Create a new user.
- `GET /users/{userId}`: Retrieve a user by their ID.
- `PUT /users/{userId}`: Update a user's information by their ID.
- `DELETE /users/{userId}`: Delete a user by their ID.

### User Schema

The User object is defined as follows:

```yaml
User:
  type: object
  properties:
    user_id:
      type: integer
    username:
      type: string
    email:
      type: string
    password_hash:
      type: string
    created_at:
      type: string
      format: date-time
    updated_at:
      type: string
      format: date-time
```

## Build Instructions

### Spring Boot Application

To build and run the application, follow these steps:

1. Ensure you have Java and Maven installed on your system.
2. Clone the repository and navigate to the project directory.
3. Run the following command to build the application:
   ```bash
   mvn clean install
   ```
4. Once the build is successful, you can run the application using:
   ```bash
   java -jar target/your-application.jar
   ```

### Flyway DB Integration

To set up the database, follow these steps:

1. Ensure Docker is installed on your system.
2. Use the following script to create the database:
   ```sql
   CREATE DATABASE IF NOT EXISTS `user_db`;
   ```
3. To avoid errors with reserved keywords, execute:
   ```sql
   SET sql_mode = 'ANSI_QUOTES';
   ```

## Running Locally

To run the application locally using Docker, follow these steps:

1. Ensure Docker and Docker Compose are installed on your system.
2. Use the provided `docker-compose.yml` file to set up the environment:
   - The file will create a MySQL container.
   - It will run `mvn clean install` to build the application and generate a `.jar` file.
   - It will build the service image using the Dockerfile.
3. Run the following command to start the services:
   ```bash
   docker-compose up
   ```

### Note

- No pre-existing MySQL instance is required as the `docker-compose` setup will handle the database creation and management.