package ui;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.MalformedURLException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class AddContactController {

	private String imgURL;
	
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
    void addPhoto(ActionEvent event) throws MalformedURLException{
    	//ask if it's a web or a local photo
    	//Boolean defaultPhoto = true;
    	Image img;
    	FileChooser fc = new FileChooser();
    	fc.setTitle("Choose an image");
    	String defaultDirectory = new File("").getAbsolutePath();
    	defaultDirectory+="\\documents\\images\\profileimgs";
    	fc.setInitialDirectory(new File(defaultDirectory));
    	imgURL = (fc.showOpenDialog(photo.getScene().getWindow()).toURI().toURL().toExternalForm());
    	photo.setImage(new Image(imgURL));
    	String entries[] = imgURL.split("/");
    	imgURL = "Contacts_Schedule\\documents\\images\\profileimgs\\"+entries[entries.length-1];
    }

    @FXML
    void save(ActionEvent event) throws IOException {
    	//Check if the contact is already added
    	BufferedWriter bw = new BufferedWriter(new FileWriter(new File("").getAbsolutePath()+"\\documents\\data\\contacts.txt"));
    	bw.write(name.getText()+";"+lastName.getText()+";"+age.getText()+";"+ email.getText()+";"+ phoneNumber.getText()+";" +birthDate.getText()+";"+imgURL+"\n");
    	//Write the new row of contacts' file
    	//Confirm the new contact was added
    	//Ask to the user wants to add another contact or not
    	bw.close();
    	
    	Parent root = FXMLLoader.load(getClass().getResource("contact.fxml"));
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
