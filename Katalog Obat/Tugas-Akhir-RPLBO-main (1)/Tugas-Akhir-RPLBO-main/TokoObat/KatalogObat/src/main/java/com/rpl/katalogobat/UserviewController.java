package com.rpl.katalogobat;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class UserviewController {

    @FXML
    private Button btncari;

    @FXML
    private TextField cari;

    @FXML
    private ImageView fieldgambar;

    @FXML
    private Label fieldusername;

    @FXML
    private Button btndetail;

    @FXML
    private TextField fieldnamaobat;

    @FXML
    private TextField fieldkomposisi;

    @FXML
    private TextField fieldmerek;

    @FXML
    private TextField fieldexp;

    @FXML
    private TextField fieldbentuk;

    // Method to handle transition to the detail view
    public void todetail(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("detailobat.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setTitle("Detail Obat");
        stage.setScene(scene);
        stage.show();
    }

    // Method to handle closing the current window
    @FXML
    private void handleClose(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        MenuButton menuButton = (MenuButton) menuItem.getParentPopup().getOwnerNode();
        Stage stage = (Stage) menuButton.getScene().getWindow();
        stage.close();
    }

    // Method to show the About Us window
    @FXML
    public void showAboutUs(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
            Stage stage = new Stage();
            stage.setTitle("About Us");
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error loading AboutUs.fxml: " + e.getMessage());
        }
    }
}
