package com.rpl.katalogobat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.MenuItem;
import javafx.scene.control.MenuButton;



public class DetailobatController{

    /**
     * @return the fieldbentuk
     */
    public TextField getFieldbentuk() {
        return fieldbentuk;
    }

    /**
     * @param fieldbentuk the fieldbentuk to set
     */
    public void setFieldbentuk(TextField fieldbentuk) {
        this.fieldbentuk = fieldbentuk;
    }

    /**
     * @return the fieldexp
     */
    public TextField getFieldexp() {
        return fieldexp;
    }

    /**
     * @param fieldexp the fieldexp to set
     */
    public void setFieldexp(TextField fieldexp) {
        this.fieldexp = fieldexp;
    }

    /**
     * @return the fieldgambar
     */
    public ImageView getFieldgambar() {
        return fieldgambar;
    }

    /**
     * @param fieldgambar the fieldgambar to set
     */
    public void setFieldgambar(ImageView fieldgambar) {
        this.fieldgambar = fieldgambar;
    }

    /**
     * @return the fieldkomposisi
     */
    public TextField getFieldkomposisi() {
        return fieldkomposisi;
    }

    /**
     * @param fieldkomposisi the fieldkomposisi to set
     */
    public void setFieldkomposisi(TextField fieldkomposisi) {
        this.fieldkomposisi = fieldkomposisi;
    }

    /**
     * @return the fieldmerek
     */
    public TextField getFieldmerek() {
        return fieldmerek;
    }

    /**
     * @param fieldmerek the fieldmerek to set
     */
    public void setFieldmerek(TextField fieldmerek) {
        this.fieldmerek = fieldmerek;
    }

    /**
     * @return the fieldnamaobat
     */
    public TextField getFieldnamaobat() {
        return fieldnamaobat;
    }

    /**
     * @param fieldnamaobat the fieldnamaobat to set
     */
    public void setFieldnamaobat(TextField fieldnamaobat) {
        this.fieldnamaobat = fieldnamaobat;
    }

    @FXML
    private TextField fieldbentuk;

    @FXML
    private TextField fieldexp;

    @FXML
    private ImageView fieldgambar;

    @FXML
    private TextField fieldkomposisi;

    @FXML
    private TextField fieldmerek;

    @FXML
    private TextField fieldnamaobat;

    @FXML
    private void handleBack(ActionEvent event) {
    try {
        MenuItem menuItem = (MenuItem) event.getSource();
        MenuButton menuButton = (MenuButton) menuItem.getParentPopup().getOwnerNode();
        Stage stage = (Stage) menuButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("user-view.fxml"));
        Parent root = loader.load();
        stage.setScene(new Scene(root));
        stage.show();
    } catch (IOException e) {
        e.printStackTrace(); // Consider using a logger for better error handling in production
    }
}

}
