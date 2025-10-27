package com.example;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Controller layer: mediates between the view (FXML) and the model.
 */
public class HelloController {

    private final HelloModel model = new HelloModel();

    @FXML
    private Label messageLabel;

    @FXML
    private Label currentDateAndTime;

    public Button updateButton;

    private Timeline timeline;

    @FXML
    private void initialize() {
        if (messageLabel != null) {
            messageLabel.setText(model.getGreeting());
        }
        if (currentDateAndTime != null)
            currentDateAndTime.setText(LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            // Update UI directly
            currentDateAndTime.setText(LocalDateTime.now()
                    .format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")));
        }));
        timeline.setCycleCount(Animation.INDEFINITE); // Repeat forever
        timeline.play();
    }

    public void stopButtonAction(ActionEvent actionEvent) {
        timeline.stop();
        updateButton.setDisable(true);
    }
}
