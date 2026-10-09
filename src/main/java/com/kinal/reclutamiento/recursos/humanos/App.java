/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main.java.com.kinal.reclutamiento.recursos.humanos;

/**
 *
 * @author informatica
 */

import static javafx.application.Application.launch;

import javafx.application.Application;
import javafx.stage.Stage;
import main.java.com.kinal.reclutamiento.recursos.humanos.util.SceneManager;

public class App extends Application {

    @Override
    public void start(Stage stage) {
        SceneManager.setPrimaryStage(stage);
        SceneManager.cambiarEscena("login-aspirante.fxml", "Iniciar Sesión");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
