/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.vista;

/**
 *
 * @author camper
 */
import examen.dao.ClienteDAO;        
import examen.model.Cliente;         
import java.util.Scanner;        

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ClienteDAO dao = new ClienteDAO();  

        
        System.out.println("=== Registro de clientes ===");
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Representante: ");
        String representante = scanner.nextLine();

        System.out.print("Correo: ");
        String correo = scanner.nextLine();
        
        System.out.print("Telefono: ");
        String telefono = scanner.nextLine();
        
        System.out.print("Direccion: ");
        String direccion = scanner.nextLine();
        
        System.out.print("Sector: ");
        String sector  = scanner.nextLine();

        Cliente cliente = new Cliente(0, nombre, representante, correo, telefono, direccion, sector);

        
        dao.agregarCliente(cliente);

        System.out.println("✅ Estudiante registrado con éxito.");
    }
}
