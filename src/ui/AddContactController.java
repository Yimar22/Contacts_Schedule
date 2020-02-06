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
import model.Contact;

public class AddContactController {

	
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField name;
	
    @FXML
	private TextField lastName;
    
    @FXML
    private TextField phoneNumber;
    
    @FXML
    private TextField email;
   
    @FXML
    private TextField age;

    @FXML
    private TextField birthDate;

    @FXML
    private ImageView photo;

    @FXML
    void addPhoto(ActionEvent event) throws IOException {
    	//ask if it's a web or a local photo
    	//Boolean defaultPhoto = true;
    	String path = "/Contacts_Schedule/documents/images/avatar-icon-vector-illustration.jpg";
    	
    	Parent root = FXMLLoader.load(getClass().getResource("addImage.fxml"));
		Scene scene = new Scene(root);
		Stage appStage = new Stage();
		appStage.setScene(scene);
		appStage.setTitle("Add Image");
		appStage.toFront();
		appStage.show();
    	photo = new ImageView(path);
    }

    @FXML
    void save(ActionEvent event) throws IOException {
    	//Check if the contact is already added
    	 new Contact(name.getText(), lastName.getText(), Integer.parseInt(age.getText()), email.getText(), Integer.parseInt(phoneNumber.getText()), birthDate.getText(), photo.getAccessibleText());
    	
    	//Write the new row of contacts' file
    	//Confirm the new contact was added
    	//Ask to the user wants to add another contact or not
    	
    	
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
