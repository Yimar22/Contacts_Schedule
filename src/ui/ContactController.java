package ui;


import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
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
import model.Schedule;

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

	private Schedule schedule;
	


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

		schedule = new Schedule();
		schedule.loadContacts();
		

		nameColumn.setCellValueFactory(new PropertyValueFactory<Contact,String>("name"));
		apellidoColumn.setCellValueFactory(new PropertyValueFactory<Contact,String>("lastName"));

		Enumeration<String> e = schedule.getContacts().keys();
		String clave;
		Contact newContact;
		while( e.hasMoreElements() ) {
			clave = e.nextElement();
			newContact = schedule.getContacts().get( clave );
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


}



