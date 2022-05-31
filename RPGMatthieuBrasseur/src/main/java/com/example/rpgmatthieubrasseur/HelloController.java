package com.example.rpgmatthieubrasseur;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    Button StartButton;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onStartButtonClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader
                (HelloApplication.class.getResource("choix-heros.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        HelloApplication.stage.setScene(scene);
        HelloApplication.stage.show();
    }
}