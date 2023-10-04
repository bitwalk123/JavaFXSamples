/*
 * Reference:
 * https://kita-note.com/javafx-init-stop
 */
package samplewidgets;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class SampleApp extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void init() {
        System.out.println("初期化処理を実行");
    }

    @Override
    public void stop() {
        System.out.println("終了処理を実行");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("タイトル");
        primaryStage.setWidth(200);
        primaryStage.setHeight(200);

        Label lab = new Label("メインメソッドから実行");
        lab.setFont(new Font(16));
        primaryStage.setScene(new Scene(lab));

        primaryStage.show();
    }
}
