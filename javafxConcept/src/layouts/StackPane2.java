package layouts;


import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
//import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class StackPane2 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label label = new Label("스마일 이미지");
//		label.setStyle("-fx-background-color: #FFBB");
		
		BorderPane border = new BorderPane();
		border.setBottom(label);
		BorderPane.setAlignment(label, Pos.CENTER);
//		border.setStyle("-fx-background-color: #FFBB00");
		
		ImageView iv = new ImageView("img/smilerere.png");
		StackPane stack = new StackPane();
		stack.getChildren().addAll(iv, border);
		
		
		Scene scene = new Scene(stack, 300, 200);
		primaryStage.setTitle("StackPane2 Ex2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
