
drop table Account;
CREATE TABLE Account (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    customer_id INT NOT NULL,
    savings_account DOUBLE DEFAULT 0,
    deposit_account DOUBLE DEFAULT 0,
    FOREIGN KEY (customer_id)
        REFERENCES customer (customer_id)
);
ALTER TABLE Account AUTO_INCREMENT = 12000;