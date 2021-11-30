
CREATE TABLE Manager (
name VARCHAR(100), 
shift VARCHAR(100), 
salary DOUBLE, 
mid INT NOT NULL PRIMARY KEY
);

CREATE TABLE CORDER (
orderid int NOT NULL PRIMARY KEY AUTO_INCREMENT,
cname VARCHAR(100), 
phone VARCHAR(100), 
address VARCHAR(100), 
itemid VARCHAR(100) ,
qty int, 
total double, 
date varchar(100),
FOREIGN KEY(itemid) REFERENCES ITEM(itemid)
);
CREATE TABLE ITEM (
itemid  VARCHAR(100) NOT NULL PRIMARY KEY, 
dish VARCHAR(100), 
price DOUBLE, 
category VARCHAR(100)

);