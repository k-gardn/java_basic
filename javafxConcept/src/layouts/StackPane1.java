package layouts;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class StackPane1 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Rectangle rec = new Rectangle(100,100, Color.BROWN);
		Label label = new Label("사각형 안에 텍스트");
		
		//겹쳐서 나옴
		StackPane stack = new StackPane();
		stack.getChildren().addAll(rec, label);
		
		Scene scene = new Scene(stack, 300, 200);
		primaryStage.setTitle("StackPane1");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	

}
