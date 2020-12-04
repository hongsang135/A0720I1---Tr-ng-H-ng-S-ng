create database taikhoannganhang;

use taikhoannganhang;

create table customer(
	customer_number int auto_increment primary key,
    fullname varchar(100) not null,
    address varchar(100) not null,
    email varchar(100) not null,
    phone int(10) not null
);

create table accounts(
	account_number int primary key,
    account_type varchar(50) not null,
    date_open date not null,
    balance float not null,
    customer_number int not null,
    foreign key (customer_number) references customer (customer_number)
);

create table transactions(
	tran_number int primary key,
    account_number int not null,
    date_trans date not null,
    amount float not null,
    descriptions text,
    foreign key (account_number) references accounts (account_number)
);