
package main.java.com.kinal.reclutamiento.recursos.humanos.util;


import java.io.File;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;

public class SceneManager {
    
    private static Stage primaryStage;
    
    public static void setPrimaryStage(Stage stage) {
        primaryStage = stage;
    }
    
    public static void cambiarEscena(String fxml, String titulo) {
        try {
            File file = new File("src/main/resources/fxml/" + fxml);
            
            if (!file.exists()) {
                file = new File("build/classes/view/" + fxml);
            }
            
            if (!file.exists()) {
                System.err.println("No se encontró el FXML: " + fxml);
                return;
            }
            
            URL location = file.toURI().toURL();
            FXMLLoader loader = new FXMLLoader(location);
            Parent root = loader.load();
            
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle(titulo);
            primaryStage.centerOnScreen();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}