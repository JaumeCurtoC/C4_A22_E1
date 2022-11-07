DROP DATABASE IF EXISTS clientesVideo;
CREATE DATABASE clientesVideo;

USE clientesVideo;

CREATE TABLE cliente (
	id int(11) NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(250) DEFAULT NULL,
    apellido VARCHAR(250) DEFAULT NULL,
    direccion VARCHAR(250) DEFAULT NULL,
    dni int(11) DEFAULT NULL,
    fecha date DEFAULT NULL,
    PRIMARY KEY (id)
);