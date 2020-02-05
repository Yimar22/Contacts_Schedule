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
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class AddContactController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name;

    @FXML
    private TextField email;

    @FXML
    private TextField lastName;

    @FXML
    private TextField edad;

    @FXML
    private TextField fechadenacimiento;

    @FXML
    private TextField telfNumber;

    @FXML
    private ImageView photo;

    @FXML
    void addPhoto(ActionEvent event) {

    }

    @FXML
    void save(ActionEvent event) throws IOException {
    	
    	
    	
    	
    	  Parent root = FXMLLoader.load(getClass().getResource("contacts.fxml"));
			Scene scene = new Scene(root);
			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			appStage.setScene(scene);
			appStage.setTitle("Add Contact");
			appStage.toFront();
			appStage.show();
    }

    @FXML
    void initialize() {
       

    }
}
