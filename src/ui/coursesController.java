package ui;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.ResourceBundle;

import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Course;
import model.Schedule;

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
    private TableView<Course> coursesTV;

    @FXML
    private TableColumn<Course, String> coursesTC;
    
    @FXML
    private TableColumn<Course, String> creditsTC;
    
    @FXML
    private TableColumn<Course, String> teacherNameTC;

    @FXML
    private TableColumn<Course, Integer> nrcTC;

   
    private Schedule schedule;
    
	
	ObservableList<Course> data = FXCollections.observableArrayList();

   

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
    void removeCourse(ActionEvent event) {
    	Course selectedItem = coursesTV.getSelectionModel().getSelectedItem();
    	coursesTV.getItems().remove(selectedItem);
    }
    
    @FXML
    void sortByCredtis(ActionEvent event) {
    //	creditsTC.sortableProperty();
    }

    @FXML
    void sortByNRC(ActionEvent event) {
    	//nrcTC.setSortType(nrcTC.getSortType());
    }

    @FXML
    void sortByNameTeacher(ActionEvent event) {

    }

    @FXML
    void sortbyName(ActionEvent event) {

    }

    @FXML
    void initialize() {
    	
    	schedule = new Schedule();
    	
		schedule.loadCourses();
		
		//coursesTC.setCellValueFactory(new PropertyValueFactory<Course,String>("Curso"));
		coursesTC.setCellValueFactory(c -> 
	      new ReadOnlyStringWrapper( String.valueOf( c.getValue().getName() ) ));
		
		
		creditsTC.setCellValueFactory(c -> 
	      new ReadOnlyStringWrapper( String.valueOf( c.getValue().getCredits() ) ));
		
		teacherNameTC.setCellValueFactory(c -> 
	      new ReadOnlyStringWrapper( String.valueOf( c.getValue().getTeacherName() ) ));
		
		nrcTC.setCellValueFactory(new PropertyValueFactory<Course,Integer>("NRC"));
		
		
		Enumeration<String> e = schedule.getCourses().keys();
		String clave;
		Course newCourse;
		while( e.hasMoreElements() ) {
		    clave = e.nextElement();
		    newCourse = schedule.getCourses().get( clave );
		    data.add(newCourse);
		    
		}
		coursesTV.setItems(data);

    }
    
	
}
