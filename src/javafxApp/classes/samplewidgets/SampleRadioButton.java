package samplewidgets;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SampleRadioButton extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        RadioButton rb_a = new RadioButton("RadioButton A");
        RadioButton rb_b = new RadioButton("RadioButton B");
        RadioButton rb_c = new RadioButton("RadioButton C");

        ToggleGroup group = new ToggleGroup();
        rb_a.setToggleGroup(group);
        rb_b.setToggleGroup(group);
        rb_c.setToggleGroup(group);
        group.selectedToggleProperty().addListener(new SampleRadioButtonEvent());

        VBox vbox = new VBox();
        vbox.getChildren().add(rb_a);
        vbox.getChildren().add(rb_b);
        vbox.getChildren().add(rb_c);

        primaryStage.setTitle("RadioButton example");
        primaryStage.setScene(new Scene(vbox));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
