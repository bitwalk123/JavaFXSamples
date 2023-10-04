package samplewidgets;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleLabel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lab = new Label("Label");

        VBox vbox = new VBox();
        vbox.getChildren().add(lab);

        primaryStage.setTitle("Label example");
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
