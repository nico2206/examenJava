/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.conexion;

/**
 *
 * @author camper
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Datos de conexión a MySQL
    private static final String URL = "jdbc:mysql://localhost:3306/soluciones"; // Cambia 'escuela' por tu base de datos
    private static final String USER = "campus2023"; // Tu usuario MySQL
    private static final String PASSWORD = "campus2023"; // Tu contraseña (si tiene)

    // Método que intenta conectarse y devuelve la conexión
    public static Connection getConexion() {
        Connection conexion = null;

        try {
            conexion = DriverManager.getConnection(URL, USER, PASSWORD); // Conexión con la base
            System.out.println("✅ Conexión exitosa");
        } catch (SQLException e) {
            System.out.println("❌ Error al conectar: " + e.getMessage());
        }

        return conexion;
    }
}

