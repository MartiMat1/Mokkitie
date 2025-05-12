package com.example.mokkitieuusi2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Nakyma1Controller {
    @FXML
    private TextField SyottokenttaNimi;

    @FXML
    private TextField SyottokenttaSS;

    @FXML
    private Button EnterPainike;

    @FXML
    private Button CancelPainike;



    @FXML
    private void Syottokentta1() {
    System.out.println("Nimi: "  + SyottokenttaNimi.getText());
    }
    @FXML
    private void Syottokentta2() {
    System.out.println("Salasana: " + SyottokenttaSS.getText());
    }

    @FXML
    private void EnterPainike() throws IOException {
        SivunAvaus("MOKINVARAUS_NAKYMA2.fxml");
    }


    private void SivunAvaus(String fxmlFile) throws IOException {
    FXMLLoader avaaja = new FXMLLoader();
        Pane uusiSivu = avaaja.load();

        Stage ikkuna = EnterPainike.getScene().getWindow();
        Scene nakyma = new Scene(uusiSivu);
        ikkuna.setScene(nakyma);
    }
}