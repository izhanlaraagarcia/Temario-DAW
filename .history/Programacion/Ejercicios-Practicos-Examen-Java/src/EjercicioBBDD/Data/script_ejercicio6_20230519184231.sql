-- Creación de la base de datos
DROP DATABASE IF EXISTS empresaDB;
CREATE DATABASE empresaDB;

-- Indicamos que usamos la BBDD de EmpresaDB
USE empresaDB;

-- Creación de la tabla empleados
CREATE TABLE empleados (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(50) NULL,
    apellidos VARCHAR(50) NULL,
    apellido VARCHAR(50) NULL,
    salario INTEGER NULL
);


-- Seleccionaremos la tabla para más adelante poder trabajar en ella
SELECT * FROM EmpresaDB.empleados;
