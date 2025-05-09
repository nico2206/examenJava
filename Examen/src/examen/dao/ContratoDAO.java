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
import examen.model.Contrato;


/**
 *
 * @author camper
 */
public class ContratoDAO {
    public void agregarContrato(Contrato contrato) {
       
        String sql = "INSERT INTO cliente (id_cliente, id_servicio, fechaInicio, fechaFin, costoTotal, estado) VALUES (?, ?, ?, ?,?,?  )";

        try {
            
            Connection conexion = Conexion.getConexion();

            
            PreparedStatement statement = conexion.prepareStatement(sql);

            
            statement.setInt(1, contrato.getId_cliente());
            statement.setInt(1, contrato.getId_servicio());
            statement.setString(2, contrato.getFechaInicio());
            statement.setString(3, contrato.getFechaFin());
            statement.setString(4, contrato.getCostoTotal());
            statement.setString(4, contrato.getEstado());
       
            

            
            statement.executeUpdate();

            
            statement.close();
            conexion.close();

        } catch (SQLException e) {
            
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }
    }
}
 