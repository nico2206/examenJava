# examenJava

## 📁 Descripción de Paquetes

### 1. `model`
Contiene las entidades que representan el dominio del sistema:

- `Cliente`, `Vehiculo`, `Servicio`, `Tecnico`, `Factura`, `Repuesto`, `Proveedor`, `Lote`, `Campana`, `Inspeccion`, `OrdenCompra`, `Order`, `OrderDetail`

### 2. `dao`
Contiene las clases encargadas del acceso a datos:

- Cada entidad tiene su respectiva clase DAO: `ClienteDAO`, `VehiculoDAO`, `ServicioDAO`, etc.
- Realizan operaciones: `insertar`, `listar`, `actualizar`, `eliminar`.

### 3. `controlador`
Define la lógica de negocio y se comunica entre DAO y vistas:

- Ejemplos: `ClientController`, `ServiceController`, `InventoryController`, etc.
- Controla las acciones del usuario en las vistas.

### 4. `vista`
Componentes Swing como `JFrame`, uno por cada módulo:

- `ClientView`, `ServiceView`, `FacturaView`, `InventoryView`, `ProveedorFrame`, `MainFrame`, etc.
- Cada vista implementa funciones como: `mostrarFormulario()`, `refrescarLista()`, `cargarDatos()`.

### 5. `DatabaseConnection`
Clase utilitaria para la conexión a la base de datos usando JDBC.

