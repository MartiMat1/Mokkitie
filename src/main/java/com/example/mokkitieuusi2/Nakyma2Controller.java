package com.example.mokkitieuusi2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Nakyma2Controller extends Application {

    @FXML
    private void ToggleButton VuokrausPainike;

    @FXML
    private void ToggleButton HakemistoPainike;

    @FXML
    private void VuokrausPainike(){
        VuokraAvaus("MOKINVARAUS_NAKYMA3.2.fxml");
    }

    @FXML
    private void HakemistoPainike(){
        {
            HakemistoAvaus("MOKINVARAUS_NAKYMA3.1.fxml");
        };
    }




    private void VuokraAvaus(String fxmlFile) {
        FXMLLoader avaaja = new FXMLLoader();
        Pane uusiSivu = avaaja.load();

        Stage ikkuna = VuokrausPainike.getScene().getWindow();
        Scene nakyma = new Scene(uusiSivu);
        ikkuna.setScene(nakyma);
    }
    private void VuokraAvaus(String fxmlFile) {
        FXMLLoader avaaja = new FXMLLoader();
        Pane uusiSivu = avaaja.load();

        Stage ikkuna = HakemistoPainike.getScene().getWindow();
        Scene nakyma = new Scene(uusiSivu);
        ikkuna.setScene(nakyma);
    }
}
