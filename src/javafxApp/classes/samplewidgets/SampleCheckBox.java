package samplewidgets;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleCheckBox extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        CheckBox cb_a = new CheckBox("CheckBox A");
        CheckBox cb_b = new CheckBox("CheckBox B");
        CheckBox cb_c = new CheckBox("CheckBox C");

        cb_a.setOnAction(new SampleCheckButtonEvent());
        cb_b.setOnAction(new SampleCheckButtonEvent());
        cb_c.setOnAction(new SampleCheckButtonEvent());

        VBox vbox = new VBox();
        vbox.getChildren().add(cb_a);
        vbox.getChildren().add(cb_b);
        vbox.getChildren().add(cb_c);

        primaryStage.setTitle("CheckButton example");
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
