package com.rpl.katalogobat;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ForgetPasswordConroller {

    @FXML
    private Button btnmasuk;

    @FXML
    private TextField fieldusername;

    @FXML
    private PasswordField passwordulang;
    @FXML
    private PasswordField fieldnewpassword;

    @FXML
    private Text txtlabel;

//    @FXML
//    void btnmasuk(ActionEvent event) {
//
//    }

    /**
     * @return the btnmasuk
     */
    public Button getBtnmasuk() {
        return btnmasuk;
    }

    /**
     * @param btnmasuk the btnmasuk to set
     */
    public void setBtnmasuk(Button btnmasuk) {
        this.btnmasuk = btnmasuk;
    }

    

    /**
     * @return the fieldusername
     */
    public TextField getFieldusername() {
        return fieldusername;
    }

    /**
     * @param fieldusername the fieldusername to set
     */
    public void setFieldusername(TextField fieldusername) {
        this.fieldusername = fieldusername;
    }

    /**
     * @return the txtlabel
     */
    public Text getTxtlabel() {
        return txtlabel;
    }

    /**
     * @param txtlabel the txtlabel to set
     */
    public void setTxtlabel(Text txtlabel) {
        this.txtlabel = txtlabel;
    }
    
    public void getBtnmasuk (ActionEvent event) throws IOException {
        if (fieldusername.getText().equals("admin") && getFieldnewpassword().getText().equals("admin123") &&getPasswordulang().getText().equals("admin123"))  {
            Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    
        }else {
            txtlabel.setText("Incorret Masukkan Ulang Passwod!");
        }
    }

    /**
     * @return the passwordulang
     */
    public PasswordField getPasswordulang() {
        return passwordulang;
    }

    /**
     * @return the fieldnewpassword
     */
    public PasswordField getFieldnewpassword() {
        return fieldnewpassword;
    }

    /**
     * @param passwordulang the passwordulang to set
     */
    public void setPasswordulang(PasswordField passwordulang) {
        this.passwordulang = passwordulang;
    }

    /**
     * @param fieldnewpassword the fieldnewpassword to set
     */
    public void setFieldnewpassword(PasswordField fieldnewpassword) {
        this.fieldnewpassword = fieldnewpassword;
    }

}
