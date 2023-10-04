package samplewidgets;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleLabel extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lab = new Label("ラベル");

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().add(lab);

        primaryStage.setTitle("Label example");
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
