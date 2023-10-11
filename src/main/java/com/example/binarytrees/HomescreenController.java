package com.example.binarytrees;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class HomescreenController {
    @FXML
    private Button playButton;
    @FXML
    protected void onPlayClick() throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("binarytree.fxml"));
        Scene binaryTreeScene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) playButton.getScene().getWindow();
        stage.setScene(binaryTreeScene);
    }
}