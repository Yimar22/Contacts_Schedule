package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class AddImageController {
	
	public AddImageController() {
		selectFromPC.setGraphic(new ImageView(new Image("//documents/")));
	}
	
	private String url;
	
	// 1 for local; 0 for web
	private int source;
	
    @FXML
    private TextField imgSourcePath;

    @FXML
    private ImageView imgPreview;

    @FXML
    private Button saveChangesButton;

    @FXML
    private Button cancelChangesButton;
    
    @FXML
    private Button reloadPreviewButton; 
    
    @FXML
    private Button selectFromPC;
    
    @FXML
    void saveChanges(ActionEvent event) {
    	
    }

    @FXML
    void cancelChanges(ActionEvent event) {

    }
    
    @FXML
    void reloadPreview(ActionEvent event) {
    	
    }
    
    @FXML
    void selectFromPc(ActionEvent event) {
    	
    }
    
	public int getSource() {
		return source;
	}

	public void setSource(int source) {
		this.source = source;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
