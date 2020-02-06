package ui;

import java.io.IOException;
import java.net.URL;
import java.util.Hashtable;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ContactController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	@FXML
	private TextArea notes;

	@FXML
	private ImageView picture;

	@FXML
	private Label telfnumero;

	@FXML
	private Label fechadenacimiento;

	@FXML
	private Label email;

	@FXML
	private Label edad;

	@FXML
	void addContact(ActionEvent event) throws IOException {

		    
		    Parent root = FXMLLoader.load(getClass().getResource("addContact.fxml"));
			Scene scene = new Scene(root);
			Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
			appStage.setScene(scene);
			appStage.setTitle("Add Contact");
			appStage.toFront();
			appStage.show();
	}

	@FXML
	void addNote(ActionEvent event) {

	}

	@FXML
	void editContact(ActionEvent event) {

	}

	@FXML
	void next(ActionEvent event) throws IOException {

		Parent root = FXMLLoader.load(getClass().getResource("courses.fxml"));
		Scene scene = new Scene(root);
		Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		appStage.setScene(scene);
		appStage.toFront();
		appStage.show();
	}

	@FXML
	void initialize() {
		//Hashtable<String,Scene> scenes = new Hashtable<String,Scene>();
	}
}



