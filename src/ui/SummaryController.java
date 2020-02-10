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
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;
import model.Course;
import model.Schedule;

public class SummaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<Course> coursesTV;
    
    @FXML
    private TableColumn<Course, String> coursesTC;

    @FXML
    private Label lbMostEnrolledCourse;

    @FXML
    private Label lbAvarageRegisteredCredits;

    @FXML
    private Label bLessEnrolledCourse;

    @FXML
    private Label lbAvarageEnrolledCourse;
    
    ObservableList<Course> data = FXCollections.observableArrayList();
    
    private Schedule schedule;

    @FXML
    void back(ActionEvent event) throws IOException {
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
    	schedule.loadCourses();
    	
    	coursesTC.setCellValueFactory(c -> 
	      new ReadOnlyStringWrapper( String.valueOf( c.getValue().getName() ) ));
    	
    	Enumeration<String> e = schedule.getCourses().keys();
		String clave;
		Course newCourse;
		while( e.hasMoreElements() ) {
		    clave = e.nextElement();
		    newCourse = schedule.getCourses().get( clave );
		    data.add(newCourse);
		    
		}
    	coursesTV.setItems(data);
		
    	lbMostEnrolledCourse.setText(schedule.courseMoreEnrrolled().getName());	
    	bLessEnrolledCourse.setText(schedule.courseLessEnrolled().getName());
    	//lbMostEnrolledCourse.setText("Proyecto integrador I");	
    	//bLessEnrolledCourse.setText("Ingenieria economica");
    	lbAvarageEnrolledCourse.setText("25");
    	lbAvarageRegisteredCredits.setText("18");
    	
    	
    }
}
