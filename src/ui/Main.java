package ui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {

	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("balanceGeneral.fxml"));

		Scene scene = new Scene(root);
		stage.setTitle("Balance General");
		stage.setResizable(false);
		stage.setScene(scene);
		stage.show();

	}
}
