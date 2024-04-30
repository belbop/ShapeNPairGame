package com.example.shapenpairgame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WelcomeController {

    private Stage stage;
    private Scene gameScene;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void setGameScene(Scene gameScene) {
        this.gameScene = gameScene;
    }

    @FXML
    private void handleCloseButton(ActionEvent event) {
        // Switch to the main game view
        stage.setScene(gameScene);
    }

}
