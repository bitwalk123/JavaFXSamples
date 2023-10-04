package samplewidgets;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleButton extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button but = new Button("ボタン");
        but.setOnAction(new SampleButtonEvent());

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);
        vbox.getChildren().add(but);

        primaryStage.setTitle("Button example");
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
