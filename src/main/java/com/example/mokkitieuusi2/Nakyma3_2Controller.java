package com.example.mokkitieuusi2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

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

    private void HaeMokki() {
        Hakukentta.setText(Hakukentta.getText());
    }

    public static void main(String[] args) {
    }

}
