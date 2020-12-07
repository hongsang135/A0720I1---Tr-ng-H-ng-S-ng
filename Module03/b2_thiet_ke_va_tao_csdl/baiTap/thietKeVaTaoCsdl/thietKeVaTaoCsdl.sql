create database b2_thiet_ke_va_tao_csdl;

CREATE TABLE `b2_thiet_ke_va_tao_csdl`.`customer` (
  `customerNumber` INT NOT NULL,
  `customerName` VARCHAR(45) NOT NULL,
  `contactLastName` VARCHAR(45) NOT NULL,
  `contactFirstName` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `addressLine1` VARCHAR(45) NOT NULL,
  `addressLine2` VARCHAR(45) NOT NULL,
  `city` VARCHAR(45) NOT NULL,
  `state` VARCHAR(45) NOT NULL,
  `postalCode` VARCHAR(45) NOT NULL,
  `country` VARCHAR(45) NOT NULL,
  `creditLimit` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`customerNumber`));
 