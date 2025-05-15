package com.example.mokkitieuusi2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;



import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class Nakyma3_1Controller {

    @FXML private TextField Hakukentta;
    @FXML private ScrollPane Mokinselaus;
    @FXML private Label filtteri1, filtteri2, filtteri3, filtteri4, filtteri5, filtteri6, filtteri7, filtteri8, filtteri9;

    @FXML
    private void HaeMokkeja() {
        // Future: implement search logic based on Hakukentta text
        System.out.println("Haetaan mökkejä hakusanalla: " + Hakukentta.getText());
    }

    @FXML
    private void KaytaFiltteria(MouseEvent event) throws IOException {
        Label clickedLabel = (Label) event.getSource();
        String filterName = clickedLabel.getText(); // E.g., "Filtteri1"

        System.out.println("Klikattiin: " + filterName);

        // Decide which FXML to open based on label text (or ID)
        String fxmlToLoad = "MOKINVARAUS_NAKYMA2.fxml"; // Example, change as needed

        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlToLoad));
        Parent newRoot = loader.load();

        Stage currentStage = (Stage) clickedLabel.getScene().getWindow();
        currentStage.setScene(new Scene(newRoot));
    }
}
