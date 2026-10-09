/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.com.kinal.reclutamiento.recursos.humanos.controlador;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import main.java.com.kinal.reclutamiento.recursos.humanos.servicio.AspirantesService;
import main.java.com.kinal.reclutamiento.recursos.humanos.util.SceneManager;

/**
 * @author informatica
 */
public class AspiranteController {

    private final AspirantesService aspiranteService;

    public AspiranteController() {
        this.aspiranteService = new AspirantesService();
    }

    public String procesarLogin(String correo, String contrasena) {
        boolean esValido = aspiranteService.autenticarAspirante(correo, contrasena);
        
        if (esValido) {
            return "¡Login exitoso! Bienvenido.";
        } else {
            return "Error: Correo o contraseña incorrectos.";
        }
    }

    @FXML
    private TextField txtCorreo;

    @FXML
    private PasswordField txtContrasena;

    @FXML
    private Label lblMensaje;

    @FXML
    protected void onLoginButtonClick() {
        String correo = txtCorreo.getText();
        String contrasena = txtContrasena.getText();

        boolean autenticado = aspiranteService.autenticarAspirante(correo, contrasena);

        if (autenticado) {
            lblMensaje.setText("¡Login exitoso!");
            SceneManager.cambiarEscena("usuario-view.fxml", "Panel Principal");
        } else {
            lblMensaje.setText("Correo o contraseña incorrectos.");
        }
    }
}

