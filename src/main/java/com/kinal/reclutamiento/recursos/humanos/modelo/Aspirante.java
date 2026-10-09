/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.kinal.reclutamiento.recursos.humanos.modelo;

/**
 *
 * @author informatica
 */
public class Aspirante {
    
    private String idAspirante;
    private String correo;
    private String contrasena;
    private String idUsuario;
    
    public void Aspirante(String idAspirante, String correo,String contrasena, String idUsuario ){
    this.idAspirante = idAspirante;
    this.correo = correo;
    this.contrasena =  contrasena;
    this.idUsuario = idUsuario;
    }

    public String getIdAspirante() {
        return idAspirante;
    }

    public void setIdAspirante(String idAspirante) {
        this.idAspirante = idAspirante;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }    
}
