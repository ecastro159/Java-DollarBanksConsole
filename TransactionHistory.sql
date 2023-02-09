CREATE TABLE TransactionHistory (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    transaction_type VARCHAR(10),
    access_time DATETIME DEFAULT CURRENT_TIMESTAMP
);
alter TABLE TransactionHistory AUTO_INCREMENT = 3000;