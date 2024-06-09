module com.rpl.katalogobat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.rpl.katalogobat to javafx.fxml;
    exports com.rpl.katalogobat;
}
