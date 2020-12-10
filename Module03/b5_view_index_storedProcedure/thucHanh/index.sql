use classicmodels;

SELECT count(1) FROM customers;

ALTER TABLE customers DROP INDEX idx_full_name;
ALTER TABLE customers ADD INDEX idx_customer_number(customerNumber);
EXPLAIN SELECT * FROM customers WHERE customerNumber = 175;


ALTER TABLE customers ADD INDEX idx_city(city);
EXPLAIN SELECT * FROM customers WHERE city = 'Nantes';