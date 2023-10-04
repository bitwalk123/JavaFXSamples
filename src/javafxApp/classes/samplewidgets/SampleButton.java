package samplewidgets;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SampleButton extends Application {
  
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button but = new Button("Button");
        but.setOnAction(new ButEvent()); 

        VBox vbox = new VBox();
        vbox.getChildren().add(but);
 
        primaryStage.setTitle("Button example");
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

        
    public static void main(String[] args) {
        launch(args);
    }

}
