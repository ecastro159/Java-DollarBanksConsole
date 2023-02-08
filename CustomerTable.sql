create database Project1Java;
use Project1Java;
CREATE TABLE customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    contact_number VARCHAR(50) NOT NULL,
    user_password VARCHAR(50) NOT NULL
)
