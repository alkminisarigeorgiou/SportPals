CREATE database sportpals;
use sportpals;
show databases;
show tables;


CREATE TABLE USERS (
	UserID int auto_increment,
    Name varchar(20) NOT NULL,
    Surname varchar(20) NOT NULL,
    Username varchar(20) NOT NULL UNIQUE,
    Email varchar(30) NOT NULL UNIQUE,
    City varchar(20) NOT NULL,
    Sport varchar(20) NOT NULL,
    Password varchar(20) NOT NULL,
    PRIMARY KEY (UserID)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

Drop table USERS;


SELECT *
FROM USERS;