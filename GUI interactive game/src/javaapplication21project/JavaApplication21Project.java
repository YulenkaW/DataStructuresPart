
package javaapplication21project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class JavaApplication21Project extends Application {

    
    public static void main(String[] args) {
     launch(args);
     
    
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Project.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("GUI GUI GUI");
        stage.setScene(scene);
        stage.show();
    }
    
    
    }
    

