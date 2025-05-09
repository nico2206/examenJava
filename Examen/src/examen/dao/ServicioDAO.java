/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.dao;

/**
 *
 * @author camper
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;     
import examen.conexion.Conexion;
import examen.model.Servicio;

/**
 *
 * @author camper
 */
public class ServicioDAO {
    public void agregarServicio(Servicio servicio) {
       
        String sql = "INSERT INTO cliente (nombre, descripcion, precioPorHora, categoria) VALUES (?, ?, ?, ?,  )";

        try {
            
            Connection conexion = Conexion.getConexion();

            
            PreparedStatement statement = conexion.prepareStatement(sql);

            
            statement.setString(1, servicio.getNombre());
            statement.setString(2, servicio.getDescripcion());
            statement.setString(3, servicio.getPrecioPorHora());
            statement.setString(4, servicio.getCategoria());
       
            

            
            statement.executeUpdate();

            
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            // Si hay error al insertar, lo mostramos
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
    }
}
 