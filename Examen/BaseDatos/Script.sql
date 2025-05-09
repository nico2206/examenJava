DROP DATABASE soluciones;
CREATE DATABASE soluciones;
USE soluciones;

CREATE TABLE cliente (
  id_cliente INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  representante VARCHAR(100),
  correo VARCHAR(100),
  telefono VARCHAR(20),
  direccion varchar(100),
  sector ENUM('tecnologia','salud','educacion','comercio','manufactura') DEFAULT 'salud'
);
CREATE TABLE servicio (
  id_servicio INT AUTO_INCREMENT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  descripcion VARCHAR(100),
  precioPorHora VARCHAR(100),
  categoria ENUM('ti','limpieza','seguridad','administracion') DEFAULT 'ti'
); 
CREATE TABLE contrato (
  id_contrato INT AUTO_INCREMENT PRIMARY KEY,	
  id_cliente int,
  id_servicio int,
  fechaInicio date,
  fechaFin date,
  costoTotal varchar(100),
  estado ENUM('activo', 'espera',' finalizado') DEFAULT 'activo',
  FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente) ON DELETE CASCADE,
  FOREIGN KEY (id_servicio) REFERENCES servicio(id_servicio) ON DELETE CASCADE
);
CREATE TABLE proyecto (
  id_proyecto INT AUTO_INCREMENT PRIMARY KEY,
  id_cliente int,
  nombre VARCHAR(100),
  fechaInicio date,
  fechaFin date,
  estado ENUM('curso','completado','cancelado') DEFAULT 'cancelado',
  FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente) ON DELETE CASCADE
);
CREATE TABLE empleado(
 id_empleado INT AUTO_INCREMENT PRIMARY KEY,
 nombre VARCHAR(100) NOT NULL,
 cargo VARCHAR(100),
 salario VARCHAR(20),
 especialidad ENUM('ti','administracion','limpieza','seguridad') DEFAULT 'ti',
 id_proyecto int,
 FOREIGN KEY (id_proyecto) REFERENCES proyecto(id_proyecto) ON DELETE CASCADE
);

CREATE TABLE asignacion(
 id_empleado INT ,
 id_proyecto INT,
 horasTrabajadas DECIMAL(5,2),
 fechaAsignacion DATE,
 FOREIGN KEY (id_proyecto) REFERENCES proyecto(id_proyecto) ON DELETE CASCADE,
 FOREIGN KEY (id_empleado) REFERENCES empleado(id_empleado) ON DELETE CASCADE
);

select *
from cliente;


















