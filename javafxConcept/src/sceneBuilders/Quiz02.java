package sceneBuilders;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz02 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("Quiz02.fxml"));
		Parent form = loader.load();  // 이때 initialized 이 호출 됨.

		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Quiz02");
		primaryStage.show();
	}
}
