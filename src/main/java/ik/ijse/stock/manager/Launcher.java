package ik.ijse.stock.manager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Launcher extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent rootNode = FXMLLoader.load(this.getClass().getResource("/view/Login_Form.fxml"));

        Scene scene = new Scene(rootNode);
        stage.setScene(scene);
        stage.setTitle("Sign in");
        stage.centerOnScreen();
        stage.show();
    }
}
