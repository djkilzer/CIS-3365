package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;


public class LController implements Initializable {

    @FXML
    private Label output;

    @FXML
    private TextField username, password;




    @FXML
    private void newpage(ActionEvent event) {

        if(username.getText().equals("rkilzer") && password.getText().equals("1234")) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.show();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        else {
            output.setText("NOT VALID");
        }

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
