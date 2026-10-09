/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.kinal.reclutamiento.recursos.humanos.repositorio;

import main.java.com.kinal.reclutamiento.recursos.humanos.config.DataBaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author informatica
 */
public class AspiranteRepository {

    public boolean validarLogin(String correo, String contrasena) {
        String query = "SELECT * FROM aspirantes WHERE correo = ? AND contrasena = ?";
        
        try (Connection connection = DataBaseConnection.getDataBaseConnection();
             PreparedStatement pstmt = connection.prepareStatement(query)) {
            
            pstmt.setString(1, correo);
            pstmt.setString(2, contrasena);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                return rs.next();
            }
            
        } catch (SQLException e) {
            System.err.println("Error en el login: " + e.getMessage());
            e.printStackTrace();
        }
        
        return false;
    }
}
