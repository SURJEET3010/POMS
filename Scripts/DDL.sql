
 USE POMS; # Using database

# Creating customer table with cusomer_id as primary key

CREATE TABLE Customer(
customer_id INT AUTO_INCREMENT,
Customer_name varchar(50), 
email VARCHAR(50), 
phone BIGINT,
address TEXT, 
date_of_birth DATE, 
age TINYINT,
password varchar(15),
identity_proof varchar(25),
preferred_login_id varchar(50),

constraint primary key (customer_id)
);

Drop table orders;

CREATE TABLE  orders(
	Order_id int primary key,
    description text,
    order_date date,
    amount int,
    payment_mode varchar(50),
    card_no varchar(30),
    Address text,
    customer_id int references customer(customer_id)
);
