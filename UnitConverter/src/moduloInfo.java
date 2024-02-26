 module UnitConverter {
        requires javafx.base;
        requires javafx.controls;
        requires javafx.fxml;
        requires javafx.graphics;
        requires javafx.media;
        requires javafx.swing;
        requires javafx.web;

        opens UnitConverter to javafx.fxml; // Reemplaza "yourPackageNameHere" con el nombre de tu paquete principal
    }
