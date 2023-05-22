package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz4  extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
		p1.setStyle("-fx-background-color: red");
		p2.setStyle("-fx-background-color: orange");
		p3.setStyle("-fx-background-color: black");
		
		p1.setPrefSize(150.0, 40.0);
		p2.setPrefSize(150.0, 40.0);
		
//		p1.setMaxWidth(100.0);
//		p2.setMaxWidth(100.0);
		
		p3.setPrefSize(90.0, 60.0);
//		p3.setMaxHeight(90.0);
		
		VBox vBox = new VBox();
		vBox.getChildren().addAll(p1, p2);
		vBox.setSpacing(10);
		vBox.setAlignment(Pos.CENTER);
		
		HBox hBox = new HBox();
		hBox.getChildren().addAll(vBox,p3);
		hBox.setSpacing(10);
		hBox.setPadding(new Insets(20));
		hBox.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(hBox, 400, 200));
		primaryStage.show();
	}
}

//package layouts;
//
//import javafx.application.Application;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class Quiz4 extends Application{
//	public static void main(String[] args) {
//		launch(args);
//	}
//	
//	public Pane getPane(double width, double height, String color) {
//		Pane p = new Pane();
//		p.setPrefSize(width, height);
//		p.setStyle("-fx-background-color: " + color);
//		return p;
//	}
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		VBox vBox1 = new VBox();
//		vBox1.getChildren().add(getPane(200, 50, "red"));
//		vBox1.getChildren().add(getPane(200, 50, "orange"));
//		vBox1.setSpacing(10);
//		
//		VBox vBox2 = new VBox();
//		vBox2.getChildren().add(getPane(100, 110, "black"));
//		
//		HBox hBox = new HBox();
//		hBox.getChildren().addAll(vBox1, vBox2);
//		hBox.setSpacing(10);
//		
//		vBox1.setMaxHeight(150.0);
//		vBox2.setMaxHeight(150.0);
//		hBox.setAlignment(Pos.CENTER);
//		
////		hBox.setPadding(new Insets(30, 0, 0, 30));
//		primaryStage.setTitle("Quiz4");
//		primaryStage.setScene(new Scene(hBox, 400, 200));
//		primaryStage.show();
//	}
//
//}





