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
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;
import model.Schedule;

public class SummaryController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ScrollPane courses;

    @FXML
    private Label lbMostEnrolledCourse;

    @FXML
    private Label lbAvarageRegisteredCredits;

    @FXML
    private Label bLessEnrolledCourse;

    @FXML
    private Label lbAvarageEnrolledCourse;
    
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
    	
    	
		
    	lbMostEnrolledCourse.setText(schedule.moreStudentsAmount().getName());	
    	bLessEnrolledCourse.setText(schedule.lessStudentsAmount().getName());
    }
}
