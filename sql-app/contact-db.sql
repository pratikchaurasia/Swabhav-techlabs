CREATE TABLE contact(
 id               varchar(40) NOT NULL,
 name             varchar(14),
 email            varchar(20),
 number           varchar(10),
 CONSTRAINT DEPT_PRIMARY_KEY PRIMARY KEY (id));

 
INSERT INTO contact VALUES ('bsabxuncdsdaavafvanscn','pratik','pratik@gmail.com','7507587701');


create table loginCredentials(
username				varchar(20) NOT NULL,
password 			varchar(20) NOT NULL);

INSERT INTO loginCredentials VALUES ('pratik','123');