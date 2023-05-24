package sceneBuilders;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Ex7 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
		Parent form = loader.load();  // 이때 initializedl 이 호출 됨.

		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex7");
		primaryStage.show();
	}
}
