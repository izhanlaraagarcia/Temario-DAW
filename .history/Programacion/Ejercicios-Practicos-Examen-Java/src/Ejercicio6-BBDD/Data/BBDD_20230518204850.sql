DROP DATABASE BBDD;

CREATE DATABASE BBDD;

CREATE TABLE persona( id bigint (10) NOT NULL auto_increment, Nombre varchar(32) not null, appPaterno varchar (32) not null, appMaterno varchar (32), mail varchar (32) default '@gmail.com', PRIMARY KEY (id) )