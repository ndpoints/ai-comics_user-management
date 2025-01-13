CREATE TABLE user_management (
    user_id INTEGER NOT NULL UNIQUE,
    username VARCHAR(255) NOT NULL UNIQUE,
    email VARCHAR(255) NOT NULL UNIQUE,
    password_hash VARCHAR(255) NOT NULL,
    created_at DATETIME NOT NULL,
    updated_at DATETIME,
    PRIMARY KEY (user_id)
);

CREATE INDEX idx_user_email ON user_management(email);

INSERT INTO user_management (user_id, username, email, password_hash, created_at) VALUES
(1, 'john_doe', 'john@example.com', 'hashed_password_1', NOW()),
(2, 'jane_doe', 'jane@example.com', 'hashed_password_2', NOW()),
(3, 'alice_smith', 'alice@example.com', 'hashed_password_3', NOW());