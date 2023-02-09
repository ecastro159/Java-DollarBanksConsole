drop TABLE TransactionHistory;

CREATE TABLE TransactionHistory (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    transaction_type VARCHAR(10),
    amount DOUBLE,
    access_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
);
alter TABLE TransactionHistory AUTO_INCREMENT = 3000;