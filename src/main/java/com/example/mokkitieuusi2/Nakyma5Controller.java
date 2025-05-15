package com.example.mokkitieuusi2;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;


class Nakyma5Controller {

    @FXML private Button SuljePainike;

    class ViidennesNakyma {
        Parent root;

        {
            try {
                root = FXMLLoader.load(getClass().getResource("MOKINVARAUS_NAKYMA5.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        Scene scene = new Scene(root, 300, 275);


    }
}