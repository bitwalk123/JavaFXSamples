package samplewidgets;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.CheckBox;

public class SampleCheckBoxEvent implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        CheckBox cb = (CheckBox) event.getSource();
        String cbText = cb.getText();

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Event");

        if (cb.isSelected()) {
            alert.setContentText(cbText + ": checked ON");
        } else {
            alert.setContentText(cbText + ": checked OFF");
        }
        alert.show();
    }
}
