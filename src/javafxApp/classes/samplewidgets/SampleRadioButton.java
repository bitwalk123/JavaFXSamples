package samplewidgets;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleRadioButton extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        RadioButton rb_a = new RadioButton("ラジオボタンＡ");
        RadioButton rb_b = new RadioButton("ラジオボタンＢ");
        RadioButton rb_c = new RadioButton("ラジオボタンＣ");

        ToggleGroup group = new ToggleGroup();
        rb_a.setToggleGroup(group);
        rb_b.setToggleGroup(group);
        rb_c.setToggleGroup(group);
        group.selectedToggleProperty().addListener(new SampleRadioButtonEvent());

        VBox vbox = new VBox();
        vbox.setAlignment(Pos.CENTER);
        vbox.setSpacing(10);

        vbox.getChildren().addAll(rb_a, rb_b, rb_c);

        primaryStage.setTitle("RadioButton example");
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
