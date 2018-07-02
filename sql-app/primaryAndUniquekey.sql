CREATE TABLE Person (
    ID int NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

INSERT INTO Person VALUES (7839,'Chaurasia','Pratik',21);
INSERT INTO Person VALUES (7840,'Beulah','Alexander',21);
INSERT INTO Person VALUES (7841,'Ankit','Agarwal',21);
INSERT INTO Person VALUES (7842,'Yesha','Desai',21);

CREATE TABLE Student (
    StudID int primary key,
    FirstName varchar(255),
    LastName varchar(255) NOT NULL,
    MobileNo bigint Unique
);


INSERT INTO student VALUES (100,'Shreya','Bangera',84861561);
INSERT INTO student VALUES (101,'Prasad','Patil',8481358);
INSERT INTO student VALUES (102,'Vievek','Jaiswal',null);
INSERT INTO student VALUES (103,'Pratik','Chaurasia',849418);

select * from person
select * from student