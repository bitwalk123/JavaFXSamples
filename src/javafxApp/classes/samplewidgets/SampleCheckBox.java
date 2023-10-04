package samplewidgets;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleCheckBox extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        CheckBox cb_a = new CheckBox("チェックボックスＡ");
        CheckBox cb_b = new CheckBox("チェックボックスＢ");
        CheckBox cb_c = new CheckBox("チェックボックスＣ");

        cb_a.setOnAction(new SampleCheckBoxEvent());
        cb_b.setOnAction(new SampleCheckBoxEvent());
        cb_c.setOnAction(new SampleCheckBoxEvent());

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        vbox.getChildren().addAll(cb_a, cb_b, cb_c);

        primaryStage.setTitle("CheckBox example");
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
