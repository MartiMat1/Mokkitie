package com.example.mokkitieuusi2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Nakyma2Controller extends Application {

    @FXML private void ToggleButton VuokrausPainike;

    @FXML private void ToggleButton HakemistoPainike;

    @FXML
    private void VuokrausPainike() throws IOException {
        VuokraAvaus("MOKINVARAUS_NAKYMA3.2.fxml");

    }

    @FXML
    //private void HakemistoPainike() throws IOException {
    //    {
    //        HakemistoAvaus("MOKINVARAUS_NAKYMA3.1.fxml");
    //    };
    //}




    private void VuokraAvaus(String fxmlFile) throws IOException {
        FXMLLoader avaaja = new FXMLLoader();
        Pane uusiSivu = avaaja.load();

        Stage ikkuna = VuokrausPainike.getScene().getWindow();
        Scene nakyma = new Scene(uusiSivu);
        ikkuna.setScene(nakyma);
    }
    private void HakemistoAvaus(String fxmlFile) throws IOException {
        //FXMLLoader avaaja = new FXMLLoader();
        //Pane uusiSivu = avaaja.load();

        //Stage ikkuna = HakemistoPainike().getScene().getWindow();
        //Scene nakyma = new Scene(uusiSivu);
        //ikkuna.setScene(nakyma);

        Parent root = FXMLLoader.load(getClass().getResource("MOKINVARAUS_NAKYMA3.1.fxml"));

    }

    @FXML
    private void VuokranAvaus(ActionEvent event) {
        VuokrausPainike.load();
    }
}
