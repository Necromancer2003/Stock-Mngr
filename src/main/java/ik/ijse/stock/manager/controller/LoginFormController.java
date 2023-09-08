package ik.ijse.stock.manager.controller;


import ik.ijse.stock.manager.db.Db;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    public TextField txtUser;
    public PasswordField txtPw;
    public AnchorPane loginroot;

    public void ActionONLOgin(ActionEvent actionEvent) throws IOException {
        String usr = txtUser.getText();
        String pw = txtPw.getText();

        if(usr.equals(Db.user) && pw.equals(Db.pw)){
            navigate();
        }else{
            new Alert(Alert.AlertType.ERROR,"Invalid Username or Password").show();
        }
    }
    public void navigate() throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashbord_form.fxml"));

        Scene scene = new Scene(root);
        Stage stage = (Stage) this.loginroot.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();

    }

    public void ActoionOnSignUp(MouseEvent mouseEvent) throws IOException {
        Parent itemroot = FXMLLoader.load(this.getClass().getResource("/view/sign_up.fxml"));

        Scene scene = new Scene(itemroot);
        Stage stage = (Stage) this.loginroot.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Sign Up");
        stage.centerOnScreen();
    }
}
