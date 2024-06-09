/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rpl.katalogobat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.text.Text;
/**
 *
 * @author viaan
 */
public class LoginController {

    /**
     * @return the btnmasuk
     */
    public Button getBtnmasuk() {
        
        
        return btnmasuk;
    }

    /**
     * @param btnmasuk the btnmasuk to set
     */
    public void setBtnmasuk(Button btnmasuk) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("admin-view.fxml"));
        this.btnmasuk = btnmasuk;
    }

    /**
     * @return the checkremember
     */
    public CheckBox getCheckremember() {
        return checkremember;
    }
    @FXML
  public void handleRememberUser(ActionEvent event) {
    if(checkremember.isSelected()) {
        // Let's validate the username field isn't empty (Optional)
        if(!fieldusername.getText().isEmpty()){
            Preferences pref = Preferences.userRoot();
            String userName = fieldusername.getText();
            pref.put("admin", userName);
        }
    }
}

    /**
     * @param checkremember the checkremember to set
     */
    public void setCheckremember(CheckBox checkremember) {
        this.checkremember = checkremember;
    }

    /**
     * @return the fieldpassword
     */
    public PasswordField getFieldpassword() {
        return fieldpassword;
    }

    /**
     * @param fieldpassword the fieldpassword to set
     */
    public void setFieldpassword(PasswordField fieldpassword) {
        this.fieldpassword = fieldpassword;
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
     * @return the linklupa
     */
    public Hyperlink getLinklupa() {
        return linklupa;
    }

    /**
     * @param linklupa the linklupa to set
     */
    public void setLinklupa(Hyperlink linklupa) {
        this.linklupa = linklupa;
    }

    /**
     * @return the linksignup
     */
    public Hyperlink getLinksignup() {
        return linksignup;
    }

    /**
     * @param linksignup the linksignup to set
     */
    public void setLinksignup(Hyperlink linksignup) {
        this.linksignup = linksignup;
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
    @FXML
    private Button btnmasuk;

    @FXML
    private CheckBox checkremember;

    @FXML
    private PasswordField fieldpassword;

    @FXML
    private TextField fieldusername;

    @FXML
    private Hyperlink linklupa;

    @FXML
    private Hyperlink linksignup;

    @FXML
    private Text txtlabel;
    
    
    public void btnmasuk(ActionEvent event) throws IOException {
        if (fieldusername.getText().equals("admin") && fieldpassword.getText().equals("admin")) {
            Parent root = FXMLLoader.load(getClass().getResource("admin-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }else if(fieldusername.getText().equals("user") && fieldpassword.getText().equals("user")){
            Parent root = FXMLLoader.load(getClass().getResource("user-view.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }else {
            txtlabel.setText("Incorret Username and Password!");
        }
    }
    
    
    public void getLinksignup(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("signup.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
    
       
    }
     public void getlinklupa (ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("changepassword.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.show();
    
        }


    private static class Preferences {

        private static Preferences userRoot() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public Preferences() {
        }

        private void put(String fieldusername, String fieldpassword ) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    }

 

