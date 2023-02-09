drop TABLE TransactionHistory;

CREATE TABLE TransactionHistory (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT,
    transaction_type VARCHAR(20),
    amount DOUBLE,
    access_time DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
);
alter TABLE TransactionHistory AUTO_INCREMENT = 3000;
alter table TransactionHistory MODIFY COLUMN transaction_type varchar(50);