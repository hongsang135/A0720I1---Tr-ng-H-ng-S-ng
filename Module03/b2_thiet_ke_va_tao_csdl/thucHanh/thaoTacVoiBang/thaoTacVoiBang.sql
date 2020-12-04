create database thaotacbang;

use thaotacbang;

CREATE TABLE contacts
( contact_id INT(11) NOT NULL AUTO_INCREMENT,
  last_name VARCHAR(30) NOT NULL,
  first_name VARCHAR(25),
  birthday DATE,
  CONSTRAINT contacts_pk PRIMARY KEY (contact_id)
);

CREATE TABLE suppliers
( supplier_id INT(11) NOT NULL AUTO_INCREMENT,
  supplier_name VARCHAR(50) NOT NULL,
  account_rep VARCHAR(30) NOT NULL DEFAULT 'TBD',
  CONSTRAINT suppliers_pk PRIMARY KEY (supplier_id)
);

DROP TABLE suppliers;

ALTER TABLE contacts
  ADD age varchar(40) NOT NULL
    AFTER birthday;

ALTER TABLE contacts
  MODIFY last_name varchar(50) NULL;


ALTER TABLE contacts
  DROP COLUMN age;
  
ALTER TABLE contacts
  CHANGE COLUMN last_name name
    varchar(20) NOT NULL;
    
    ALTER TABLE contacts
  RENAME TO people;
  
