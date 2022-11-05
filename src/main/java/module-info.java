module uz.bakhromjon.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens uz.bakhromjon.javafx to javafx.fxml;
    exports uz.bakhromjon.javafx;
}