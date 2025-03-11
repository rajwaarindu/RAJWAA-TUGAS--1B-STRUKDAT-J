module org.example.strukdat1_1b {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.strukdat1_1b to javafx.fxml;
    exports org.example.strukdat1_1b;
}