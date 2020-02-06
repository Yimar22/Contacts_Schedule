package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class AddImageController {

    @FXML
    private TextField urlTextField;

    @FXML
    private ImageView imageViewer;

    @FXML
    private Button applyButton;

    @FXML
    private Button cancelButton;

    @FXML
    void applyChanges(ActionEvent event) {
    	String url = urlTextField!=null?"/Contacts_Schedule/documents/images/avatar-icon-vector-illustration.jpg":urlTextField.getText();
    }

    @FXML
    void cancelOperation(ActionEvent event) {

    }

}