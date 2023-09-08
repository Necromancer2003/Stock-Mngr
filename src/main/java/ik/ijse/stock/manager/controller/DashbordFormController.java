package ik.ijse.stock.manager.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashbordFormController {
    public AnchorPane rootNode;
    public AnchorPane root;


    public void CustomerActiononButton(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/Customer_form.fxml"));

        this.rootNode.getChildren().clear();
        this.rootNode.getChildren().add(root);

    }

    public void dashActionButton(ActionEvent actionEvent) throws IOException {
        Parent dashroot = FXMLLoader.load(this.getClass().getResource("/view/dash.fxml"));

        this.rootNode.getChildren().clear();
        this.rootNode.getChildren().add(dashroot);
    }

    public void ItemActionButton(ActionEvent actionEvent) throws IOException {
        Parent itemroot = FXMLLoader.load(this.getClass().getResource("/view/Item_Form.fxml"));

        this.rootNode.getChildren().clear();
        this.rootNode.getChildren().add(itemroot);
    }

    public void ActionOnSuplierButton(ActionEvent actionEvent) throws IOException {
        Parent splierroot = FXMLLoader.load(this.getClass().getResource("/view/Suplier_Form.fxml"));

        this.rootNode.getChildren().clear();
        this.rootNode.getChildren().add(splierroot);
    }

    public void ActiononLogout(ActionEvent actionEvent) throws IOException {
        Parent loinroot = FXMLLoader.load(this.getClass().getResource("/view/Login_Form.fxml"));

        Scene scene = new Scene(loinroot);
        Stage stage = (Stage) this.root.getScene().getWindow();

        stage.setScene(scene);
        stage.setTitle("Sign in");
        stage.centerOnScreen();
    }
}
