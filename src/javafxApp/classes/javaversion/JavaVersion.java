package javaversion;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class JavaVersion extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();

        Label lab00 = new Label("Java");
        lab00.setMaxWidth(200);
        gridPane.add(lab00, 0, 0);

        String java_version = System.getProperty("java.version");
        Label lab10 = new Label(java_version);
        lab10.setMaxWidth(300);
        gridPane.add(lab10, 1, 0);

        Label lab01 = new Label("JavaFX");
        lab01.setMaxWidth(200);
        gridPane.add(lab01, 0, 1);

        String javafx_version = System.getProperty("javafx.runtime.version");
        Label lab11 = new Label(javafx_version);
        lab11.setMaxWidth(300);
        gridPane.add(lab11, 1, 1);

        Label lab02 = new Label("Platform");
        lab02.setMaxWidth(200);
        gridPane.add(lab02, 0, 2);

        String platform = System.getProperty("os.name");
        Label lab12 = new Label(platform);
        lab12.setMaxWidth(300);
        gridPane.add(lab12, 1, 2);

        Scene scene = new Scene(gridPane);
        scene.getStylesheets().add(getClass().getResource("JavaVersion.css").toExternalForm());

        primaryStage.setTitle("Jave Version");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
