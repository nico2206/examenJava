# examenJava

## 📁 Descripción de Paquetes

### 1. `model`
Contiene las entidades que representan el dominio del sistema:

### 2. `dao`
Contiene las clases encargadas del acceso a datos:


### 3. `controlador`
Define la lógica de negocio y se comunica entre DAO y vistas:


### 4. `vista`
Componentes Swing como `JFrame`, uno por cada módulo:

### 5. `DatabaseConnection`
Clase utilitaria para la conexión a la base de datos usando JDBC.

Gestión de Clientes:
Registrar un nuevo cliente.
Listar todos los clientes con su sector y contratos activos.
Gestión de Servicios:
Registrar un nuevo servicio.
Consultar servicios por categoría.
Gestión de Contratos:
Registrar un nuevo contrato.
Consultar contratos activos para un cliente.
Finalizar un contrato.
Gestión de Proyectos:
Crear un nuevo proyecto para un cliente.
Asignar empleados a un proyecto.
Consultar proyectos activos y su estado.
Gestión de Empleados:
Registrar un nuevo empleado.
Consultar empleados asignados a un proyecto.
Registrar horas trabajadas por empleado.
Reportes:
Ver ingresos totales generados por los contratos activos.
Listar los servicios más contratados.
Listar los empleados con más horas trabajadas.
