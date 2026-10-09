/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.kinal.reclutamiento.recursos.humanos.config;

/**
 *
 * @author informatica
 */
public class Credentials {
    public static final String URL_DB = System.getenv("jdbcmysql://localhost:3306/reclutamiento_recursos_humanos_in4bv");
    public static final String PASS_DB =  System.getenv("%IndiVA4");
    public static final String USER_DB = System.getenv("IN4Bv");
    
 private Credentials() {
     
}
}
