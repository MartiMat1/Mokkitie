package com.example.mokkitieuusi2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Nakyma1Controller extends Application {


    @FXML private TextField SyottokenttaNimi;
    @FXML private TextField SyottokenttaSS;
    @FXML private Button EnterPainike;
    @FXML private Button CancelPainike;


    private void EnterPainike(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("MOKINVARAUS_NAKYMA2.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Päävalikko");
    }


    @FXML
    private void Syottokentta1() {
        System.out.println("Nimi: " + SyottokenttaNimi.getText());
    }
    @FXML
    private void Syottokentta2() {
        System.out.println("Salasana: " + SyottokenttaNimi.getText());
    }



    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MOKINVARAUS_NAKYMA1.fxml"));
        primaryStage.setTitle("Tervetuloa Mökkivarausjärjestelmään");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
