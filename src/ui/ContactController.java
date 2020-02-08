package ui;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import model.Contact;

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
    private Label name;

	@FXML
	private Label telfnumero;

	@FXML
	private Label fechadenacimiento;

	@FXML
	private Label email;

	@FXML
	private Label edad;
	
	@FXML
    private TableView<Contact> contactList;

    @FXML
    private TableColumn<Contact, String> nameColumn;

    @FXML
    private TableColumn<Contact, String> apellidoColumn;
	
	Hashtable<String,Contact> contacts = new Hashtable<String,Contact>();
	ObservableList<Contact> data = FXCollections.observableArrayList();

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
		
		readFile();
		
		nameColumn.setCellValueFactory(new PropertyValueFactory<Contact,String>("name"));
		apellidoColumn.setCellValueFactory(new PropertyValueFactory<Contact,String>("lastName"));
		
		Enumeration<String> e = contacts.keys();
		String clave;
		Contact newContact;
		while( e.hasMoreElements() ) {
		    clave = e.nextElement();
		    newContact = contacts.get( clave );
		    data.add(newContact);
		    
		}
		contactList.setItems(data);
		
		/*Contact selectedContact = contactList.getSelectionModel().selectedItemProperty().getValue();
		name.setText(selectedContact.getName()+" "+selectedContact.getLastName());
		telfnumero.setText(selectedContact.getPhoneNumber());
		email.setText(selectedContact.getEmail());
		edad.setText(""+selectedContact.getAge());
		fechadenacimiento.setText(selectedContact.getBirthDate());*/
	}
	
	@FXML
    void selectRow(MouseEvent event) {
		
		Contact selectedContact = contactList.getSelectionModel().getSelectedItem();
		
		name.setText(selectedContact.getName()+" "+selectedContact.getLastName());
		telfnumero.setText(selectedContact.getPhoneNumber());
		email.setText(selectedContact.getEmail());
		edad.setText(""+selectedContact.getAge());
		fechadenacimiento.setText(selectedContact.getBirthDate());
		
    }
	
	void readFile() {
		BufferedReader br;
		
		try {
			
			br = new BufferedReader(new FileReader("documents\\data\\MOCK_DATA.csv"));
			br.readLine();
			String line = br.readLine();
			while (line!=null) {
				
				String [] fields = line.split(";");
				Contact newContact = null;
				
				newContact = new Contact(fields[0], fields[1], Integer.parseInt(fields[2]),
						fields[3], fields[4], fields[5], null);
				
				contacts.put(newContact.getName(), newContact);
				line = br.readLine();
			}
			
		} catch (FileNotFoundException e) {
			
			System.out.println("FileNotFoundException");
			
		}catch (IOException e) {
			
			System.out.println("IOException");
			
		}
	}
}



