package com.example.mokkitieuusi2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class Nakyma2Controller {

    @FXML private Button VuokrausPainike;
    @FXML private Button HakemistoPainike;

    @FXML
    private void VuokranAvaus(ActionEvent event) throws IOException {
        VuokraAvaus("MOKINVARAUS_NAKYMA3.2.fxml");
    }

    @FXML
    private void HakemistoAvaus(ActionEvent event) throws IOException {
        vaihdaNakyma("MOKINVARAUS_NAKYMA3.1.fxml", HakemistoPainike);
    }

    private void VuokraAvaus(String fxml) throws IOException {
        vaihdaNakyma(fxml, VuokrausPainike);
    }

    private void vaihdaNakyma(String fxmlTiedosto, Button painike) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlTiedosto));
        Parent root = loader.load();
        Stage stage = (Stage) painike.getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
