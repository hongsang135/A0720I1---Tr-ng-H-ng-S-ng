create database taokhoangoai;

use taokhoangoai;

CREATE TABLE customers(
   id INT AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(40),
   address VARCHAR(255),
   email VARCHAR(255)
);

-- CREATE TABLE orders(
--    id INT AUTO_INCREMENT,
--    staff VARCHAR(50),
--    PRIMARY KEY(id),
--    customer_id INT,
--    FOREIGN KEY (customer_id) REFERENCES customers(id)
-- );

drop table orders;

CREATE TABLE orders(
   id INT AUTO_INCREMENT,
   staff VARCHAR(50),
   PRIMARY KEY(id),
   customer_id INT,
   FOREIGN KEY (customer_id) REFERENCES customers(id)
);