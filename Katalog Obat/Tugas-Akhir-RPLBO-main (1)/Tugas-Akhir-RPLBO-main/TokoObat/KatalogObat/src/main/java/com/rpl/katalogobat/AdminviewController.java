package com.rpl.katalogobat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.control.MenuItem;


public class AdminviewController {

    @FXML
    private Button btnbersihkan;

    @FXML
    private Button btndelete;

    @FXML
    private Button btnimport;

    @FXML
    private Button btnsave;

    @FXML
    private Button btnupdate;

    @FXML
    private TextField cari;

    @FXML
    private MenuButton fieldbentuk;

    @FXML
    private DatePicker fieldexp;

    @FXML
    private ImageView fieldgambar;

    @FXML
    private TextField fieldkomposisi;

    @FXML
    private TextField fieldmerek;

    @FXML
    private TextField fieldnamaobat;

    @FXML
    private Menu logout;

    /**
     * @return the btnbersihkan
     */
    public Button getBtnbersihkan() {
        return btnbersihkan;
    }

    /**
     * @return the btndelete
     */
    public Button getBtndelete() {
        return btndelete;
    }

    /**
     * @return the btnimport
     */
    public Button getBtnimport() {
        return btnimport;
    }

    /**
     * @return the btnsave
     */
    public Button getBtnsave() {
        return btnsave;
    }

    /**
     * @return the btnupdate
     */
    public Button getBtnupdate() {
        return btnupdate;
    }

    /**
     * @return the cari
     */
    public TextField getCari() {
        return cari;
    }

    /**
     * @return the fieldbentuk
     */
    public MenuButton getFieldbentuk() {
        return fieldbentuk;
    }

    /**
     * @return the fieldexp
     */
    public DatePicker getFieldexp() {
        return fieldexp;
    }

    /**
     * @return the fieldgambar
     */
    public ImageView getFieldgambar() {
        return fieldgambar;
    }

    /**
     * @return the fieldkomposisi
     */
    public TextField getFieldkomposisi() {
        return fieldkomposisi;
    }

    /**
     * @return the fieldmerek
     */
    public TextField getFieldmerek() {
        return fieldmerek;
    }

    /**
     * @return the fieldnamaobat
     */
    public TextField getFieldnamaobat() {
        return fieldnamaobat;
    }

    /**
     * @return the logout
     */
    public Menu getLogout() {
        return logout;
    }

    /**
     * @param btnbersihkan the btnbersihkan to set
     */
    public void setBtnbersihkan(Button btnbersihkan) {
        this.btnbersihkan = btnbersihkan;
    }

    /**
     * @param btndelete the btndelete to set
     */
    public void setBtndelete(Button btndelete) {
        this.btndelete = btndelete;
    }

    /**
     * @param btnimport the btnimport to set
     */
    public void setBtnimport(Button btnimport) {
        this.btnimport = btnimport;
    }

    /**
     * @param btnsave the btnsave to set
     */
    public void setBtnsave(Button btnsave) {
        this.btnsave = btnsave;
    }

    /**
     * @param btnupdate the btnupdate to set
     */
    public void setBtnupdate(Button btnupdate) {
        this.btnupdate = btnupdate;
    }

    /**
     * @param cari the cari to set
     */
    public void setCari(TextField cari) {
        this.cari = cari;
    }

    /**
     * @param fieldbentuk the fieldbentuk to set
     */
    public void setFieldbentuk(MenuButton fieldbentuk) {
        this.fieldbentuk = fieldbentuk;
    }

    /**
     * @param fieldexp the fieldexp to set
     */
    public void setFieldexp(DatePicker fieldexp) {
        this.fieldexp = fieldexp;
    }

    /**
     * @param fieldgambar the fieldgambar to set
     */
    public void setFieldgambar(ImageView fieldgambar) {
        this.fieldgambar = fieldgambar;
    }

    /**
     * @param fieldkomposisi the fieldkomposisi to set
     */
    public void setFieldkomposisi(TextField fieldkomposisi) {
        this.fieldkomposisi = fieldkomposisi;
    }

    /**
     * @param fieldmerek the fieldmerek to set
     */
    public void setFieldmerek(TextField fieldmerek) {
        this.fieldmerek = fieldmerek;
    }

    /**
     * @param fieldnamaobat the fieldnamaobat to set
     */
    public void setFieldnamaobat(TextField fieldnamaobat) {
        this.fieldnamaobat = fieldnamaobat;
    }

    /**
     * @param logout the logout to set
     */
    public void setLogout(Menu logout) {
        this.logout = logout;
    }

    @FXML
    public void btnbersihkan(ActionEvent actionEvent) {
        cari.setText("");
        actionEvent.consume();
    }

    @FXML
    public void Btnsave(ActionEvent event) {
        // tambahin database

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.show();
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data Berhasil Simpan!");
        alert.show();
    }

    @FXML
    public void btnupdate(ActionEvent event) {
        // tambahin database

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.show();
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data Berhasil Diupdate!");
        alert.show();
    }

    @FXML
    public void btndelete(ActionEvent event) {
        // tambahin database

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.show();
        Alert alert = new Alert(Alert.AlertType.INFORMATION, "Data Berhasil Dihapus!");
        alert.show();
    }
    
    @FXML
    private void handleClose(ActionEvent event) {
        MenuItem menuItem = (MenuItem) event.getSource();
        MenuButton menuButton = (MenuButton) menuItem.getParentPopup().getOwnerNode();
        Stage stage = (Stage) menuButton.getScene().getWindow();
        stage.close();
}


}
