package ui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class coursesController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea coursesInformation;

    @FXML
    private AnchorPane courses;

    @FXML
    void addCourse(ActionEvent event) {

    }

    @FXML
    void back(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
		Scene scene = new Scene(root);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(scene);
		appStage.toFront();
		appStage.show();
    }

    @FXML
    void next(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("summary.fxml"));
		Scene scene = new Scene(root);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(scene);
		appStage.toFront();
		appStage.show();
    }

    @FXML
    void sortByCredtis(ActionEvent event) {

    }

    @FXML
    void sortByNRC(ActionEvent event) {

    }

    @FXML
    void sortByNameTeacher(ActionEvent event) {

    }

    @FXML
    void sortbyName(ActionEvent event) {

    }

    @FXML
    void initialize() {
      

    }
}
