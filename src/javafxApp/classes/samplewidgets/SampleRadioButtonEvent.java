package samplewidgets;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;

public class SampleRadioButtonEvent implements ChangeListener<Toggle> {

    @Override
    public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
        RadioButton rb = (RadioButton) newValue;
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Event");
        alert.setContentText(rb.getText() + ": " + rb.getUserData());
        alert.show();
    }
}
