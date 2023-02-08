create database Project1Java;
use Project1Java;
drop table customer;
CREATE TABLE customer (
    customer_id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    contact_number VARCHAR(50) NOT NULL,
    user_password VARCHAR(50) NOT NULL
);
ALTER TABLE customer AUTO_INCREMENT = 1000;