package javaversion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JavaVersion extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Label lab00 = new Label("Java");
        lab00.setId("title");
        gridPane.add(lab00, 0, 0);

        String java_version = System.getProperty("java.version");
        Label lab10 = new Label(java_version);
        lab10.setId("value");
        gridPane.add(lab10, 1, 0);

        Label lab01 = new Label("JavaFX");
        lab01.setId("title");
        gridPane.add(lab01, 0, 1);

        String javafx_version = System.getProperty("javafx.runtime.version");
        Label lab11 = new Label(javafx_version);
        lab11.setId("value");
        gridPane.add(lab11, 1, 1);

        Label lab02 = new Label("Platform");
        lab02.setId("title");
        gridPane.add(lab02, 0, 2);

        String platform = System.getProperty("os.name");
        Label lab12 = new Label(platform);
        lab12.setId("value");
        gridPane.add(lab12, 1, 2);

        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add(getClass().getResource("JavaVersion.css").toExternalForm());

        primaryStage.setTitle("Java Version");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

}
