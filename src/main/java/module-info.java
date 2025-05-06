module com.example.mokkitieuusi2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mokkitieuusi2 to javafx.fxml;
    exports com.example.mokkitieuusi2;
}