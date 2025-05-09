/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import examen.model.Cliente;          
import examen.conexion.Conexion; 

/**
 *
 * @author camper
 */
public class ClienteDAO {
    public void agregarCliente(Cliente cliente) {
       
        String sql = "INSERT INTO cliente (nombre, representante, correo, telefono, direccion, sector) VALUES (?, ?, ?, ?, ?, ? )";

        try {
            
            Connection conexion = Conexion.getConexion();

            
            PreparedStatement statement = conexion.prepareStatement(sql);

            
            statement.setString(1, cliente.getNombre());
            statement.setString(2, cliente.getRepresentante());
            statement.setString(3, cliente.getCorreo());
            statement.setString(4, cliente.getTelefono());
            statement.setString(5, cliente.getDireccion());
            statement.setString(6, cliente.getSector());

            
            statement.executeUpdate();

            
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            // Si hay error al insertar, lo mostramos
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
    }
}

