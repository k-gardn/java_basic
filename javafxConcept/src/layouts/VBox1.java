package layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VBox1  extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		
		//Preferred
		p1.setPrefHeight(100.0); //double형 임.
		p2.setPrefHeight(100.0); 
		p3.setPrefHeight(100.0); 
		
		// 넓이가 기본으로 꽉참
		p1.setMaxWidth(120.0);
		p2.setMaxWidth(120.0);
		p3.setMaxWidth(120.0);
		
		p1.setStyle("-fx-background-color: green");
		p2.setStyle("-fx-background-color: red");
		p3.setStyle("-fx-background-color: black");
		
		VBox box = new VBox();
		box.getChildren().addAll(p1, p2, p3);
		box.setSpacing(10);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("HBoxEx");
		primaryStage.setScene(new Scene(box, 400, 200));
		primaryStage.show();
		
	}
}
