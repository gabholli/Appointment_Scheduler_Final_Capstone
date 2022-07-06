package helper;


import javafx.scene.control.TextField;

public class InputValidation {

    public static void textNumberValidation(TextField tf) {
        tf.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.matches("\\d*")) return;
            tf.setText(newValue.replaceAll("[^-\\d]", ""));
        });
    }

    public static void textFieldStringValidation(TextField tf) {
        tf.textProperty().addListener((observable, oldValue, newValue) -> {
            if (newValue.matches("[a-zA-Z0-9]")) return;
            tf.setText(newValue.replaceAll("[^-a-zA-Z0-9]", ""));
        });
    }


}





