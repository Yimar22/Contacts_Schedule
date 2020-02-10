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
    private TextField nameTF;
	
    @FXML
	private TextField lastNameTF;
    
    @FXML
    private TextField phoneNumberTF;
    
    @FXML
    private TextField emailTF;
   
    @FXML
    private TextField ageTF;

    @FXML
    private TextField birthDateTF;

    @FXML
    private ImageView photoIV;

    @FXML
    void addPhoto(ActionEvent event) throws MalformedURLException{
    	//ask if it's a web or a local photo
    	//Boolean defaultPhoto = true;
    	FileChooser fc = new FileChooser();
    	fc.setTitle("Choose an image");
    	String defaultDirectory = new File("").getAbsolutePath();
    	defaultDirectory+="\\documents\\images\\profileimgs";
    	fc.setInitialDirectory(new File(defaultDirectory));
    	imgURL = (fc.showOpenDialog(photoIV.getScene().getWindow()).toURI().toURL().toExternalForm());
    	photoIV.setImage(new Image(imgURL));
    	String entries[] = imgURL.split("/");
    	imgURL = "Contacts_Schedule\\documents\\images\\profileimgs\\"+entries[entries.length-1];
    }

    @FXML
    void save(ActionEvent event){    	
    	// Data conversion
    	String name = nameTF.getText();
    	String lastName = lastNameTF.getText();
    	int age = Integer.parseInt(ageTF.getText());
    	String email = emailTF.getText();
    	String phoneNumber = phoneNumberTF.getText();
    	String birthDate = birthDateTF.getText();
    	
    	//Writer
    	try {
    		/*BufferedWriter bw = new BufferedWriter(new FileWriter(new File("").getAbsolutePath()+"\\documents\\data\\contacts.txt",true));
    		bw.append(name+";"+lastName+";"+age+";"+email+";"+phoneNumber+";"+birthDate+";"+imgURL);
    		bw.close();*/
    		FileWriter fsStream = new FileWriter("documents\\data\\Estudiantes.csv", true);
    		BufferedWriter out = new BufferedWriter(fsStream);
    		out.write(name+";"+lastName+";"+age+";"+email+";"+phoneNumber+";"+birthDate+";"+imgURL+"\n");
    		out.close();
    	}catch(IOException e){
    		System.out.println("Error: "+e.getMessage());
    	}
    	
    	//Main Menu Loader
    	Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource("contact.fxml"));
		} catch (IOException e) {
			System.out.println("fxml file not founded");
		}
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
