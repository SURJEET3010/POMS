USE `poms`;     # name of database to be used


# Inserting values in the customer table

INSERT INTO `poms`.`Customer`
(
`Customer_name`, 
`email` , 
`phone` ,
`address` , 
`date_of_birth`, 
`age` ,
`password`,
`identity_proof`,
`preferred_login_id`)
VALUES
("Alexa","al9090@hmail.com", 9090787856, "Street 12, green tower, Jordan", 
    "10-09-1999", 32, "xxxxxxx", "visa card", "al9090@hmail.com"),
    
    ("Alexander","polo90@hmail.com", 9898990908, "Street 3, twin tower, tordan", 
    "10-02-1992", 43, "xxxxxxx", "visa card", "polo90@hmail.com"),
    
    ("Marie","al9090@hmail.com", 98989, "Street 3, twin tower, Jordan", 
    "10-09-1997", 12, "xxxxxxx", "visa card", "al9090@hmail.com"),
    
    ("Jacky","loki0@hmail.com", 98989, "Street 2,quad tower, london", 
    "10-09-1992", 44, "xxxxxxx", "visa card", "loki@hmail.com"),
    
    ("Bob","bob@hmail.com", 98989, "Street 3, twin tower, Jordan", 
    "10-09-19992", "xxxxxxx", "visa card", "bob@hmail.com"),
    
    ("Alexa","al9090@hmail.com", 98989, "Street 3, twin tower, Jordan", 
    "10-09-19992", "xxxxxxx", "visa card", "alexa_9090"),
    
    ("Sonail","sonail@hmail.com", 98989, "Street 3, twin tower, Jordan", 
    "10-09-19992", "xxxxxxx", "visa card", "sonail_675");
