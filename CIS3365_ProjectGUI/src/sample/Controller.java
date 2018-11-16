package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.awt.*;
import java.net.URL;

import javafx.event.ActionEvent;
import java.util.ResourceBundle;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.sql.Connection;
import javafx.collections.FXCollections;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Controller implements Initializable {

    @FXML
    private Button clearButton, submitButton, logoutButton;

    @FXML
    private TextArea sqlText;

    @FXML
    private TableView dbTableView;



    @FXML
    private void setClearButton(ActionEvent event) {
        try {
            dbTableView.refresh();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }


    @FXML
    private void setLogoutButton(ActionEvent event) {
            try {
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
                Parent root1 = (Parent) fxmlLoader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root1));
                stage.close();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }



        @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}