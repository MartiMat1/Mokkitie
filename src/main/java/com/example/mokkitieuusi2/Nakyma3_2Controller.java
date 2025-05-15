package com.example.mokkitieuusi2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;


public class Nakyma3_2Controller {

    @FXML
    TextField Hakukentta;
    @FXML
    ScrollPane Mokinselaus;
    @FXML
    Label filtteri1;
    @FXML
    Label filtteri2;
    @FXML
    Label filtteri3;
    @FXML
    Label filtteri4;
    @FXML
    Label filtteri5;
    @FXML
    Label filtteri6;
    @FXML
    Label filtteri7;
    @FXML
    Label filtteri8;
    @FXML
    Label filtteri9;
    @FXML
    ImageView KalenteriNakyma;

    @FXML
    ImageView MOKKITIEDOT_1;
    @FXML
    ImageView MOKKITIEDOT_2;
    @FXML
    ImageView MOKKITIEDOT_3;
    @FXML
    ImageView MOKKITIEDOT_4;
    @FXML
    ImageView MOKKITIEDOT_5;
    @FXML
    ImageView MOKKITIEDOT_6;
    @FXML
    ImageView MOKKITIEDOT_7;
    @FXML
    ImageView MOKKITIEDOT_8;
    @FXML
    ImageView MOKKITIEDOT_9;

    @FXML
    ImageView OmatTiedot;


    @FXML
    private void MokkiTiedotKuvat(ActionEvent event){
        //MokinTiedot("MOKINVARAUS_NAKYMA4.fxml");
    }

    private void HaeMokki() {
        Hakukentta.setText(Hakukentta.getText());
    }

    public void MokinVaraus (Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Nakyma3_2Controller.class.getResource("MOKINVARAUS_NAKYMA3.2.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),320,260);
        stage.setScene(scene);
        stage.show();
    }
    //public void MokinTiedot(Stage stage) throws Exception {
    //    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MOKINVARAUS_NAKYMA4.fxml"));
    //    Scene scene = new Scene(fxmlLoader.load(),320,260);
    //    stage.setScene(scene);
    //    stage.show();
    //}
    public void MokinTiedot(String fxmlFileName, String title) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFileName));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setTitle(title);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
    }

}
