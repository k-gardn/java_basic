//package layouts;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//
//public class Quiz2  extends Application{
//	public static void main(String[] args) {
//		launch(args);
//	}
//	
//	@Override
//	public void start(Stage primaryStage) throws Exception {
//		Pane p1 = new Pane();
//		Pane p2 = new Pane();
//		Pane p3 = new Pane();
//		Pane p4 = new Pane();
//		Pane p5 = new Pane();
//		Pane p6 = new Pane();
//		
//		
////		p1.setPrefSize(100.0, 100.0); 그냥 이렇게 넓이, 높이를 설정해도됨.
//		p1.setMaxHeight(100.0);
//		p2.setMaxHeight(100.0);
//		p3.setMaxHeight(100.0);
//		
//		p1.setPrefWidth(120.0);
//		p2.setPrefWidth(120.0);
//		p3.setPrefWidth(120.0);
//		
//		p4.setMaxHeight(100.0);
//		p5.setMaxHeight(100.0);
//		p6.setMaxHeight(100.0);
//		
//		p4.setPrefWidth(120);
//		p5.setPrefWidth(120);
//		p6.setPrefWidth(120);
//		
//		p1.setStyle("-fx-background-color: red");
//		p2.setStyle("-fx-background-color: orange");
//		p3.setStyle("-fx-background-color: black");
//		p4.setStyle("-fx-background-color: red");
//		p5.setStyle("-fx-background-color: orange");
//		p6.setStyle("-fx-background-color: black");
//		
//		HBox box1 = new HBox();
//		box1.getChildren().addAll(p1, p2, p3);
//		box1.setSpacing(10);
//		box1.setAlignment(Pos.CENTER);
//		box1.setPrefWidth(120.0);
//		box1.setPrefHeight(100.0);
//		
//		
//		HBox box2 = new HBox();
//		box2.getChildren().addAll(p4, p5, p6);
//		box2.setSpacing(10);
//		box2.setAlignment(Pos.CENTER);
//		box2.setPrefWidth(120.0);
//		box2.setPrefHeight(100.0);
//		
//		
//		VBox vbox = new VBox();
//		vbox.getChildren().addAll(box1,box2);
//		vbox.setSpacing(20);
//		vbox.setAlignment(Pos.CENTER);
//		
//		primaryStage.setTitle("HBoxEx");
//		primaryStage.setScene(new Scene(vbox, 400, 300));
//		primaryStage.show();
//		
//		
//		
//	}
//}

//쌤
package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p1 = new Pane();
		Pane p2 = new Pane();
		Pane p3 = new Pane();
		Pane p4 = new Pane();
		Pane p5 = new Pane();
		Pane p6 = new Pane();
		
		p1.setStyle("-fx-background-color: red");
		p2.setStyle("-fx-background-color: orange");
		p3.setStyle("-fx-background-color: black");
		p4.setStyle("-fx-background-color: red");
		p5.setStyle("-fx-background-color: orange");
		p6.setStyle("-fx-background-color: black");
		
//		p1.setPrefSize(100.0, 100.0);
		p1.setPrefWidth(100);
		p1.setMaxHeight(200);
		p2.setPrefSize(100.0, 200.0);
		p3.setPrefSize(300.0, 300.0);
		p4.setPrefSize(100.0, 100.0);
		p5.setPrefSize(100.0, 100.0);
		p6.setPrefSize(100.0, 300.0);
		
		HBox hBox1 = new HBox(); // 높이가 무한인 상태
		hBox1.getChildren().add(p1);
		hBox1.getChildren().add(p2);
		hBox1.getChildren().add(p3);
		hBox1.setSpacing(10);
		hBox1.setPadding(new Insets(20));
//		hBox1.setStyle("-fx-background-color: blue");
		
		
		HBox hBox2 = new HBox(); // 높이가 무한인 상태
		hBox2.getChildren().addAll(p4, p5, p6);
		hBox2.setSpacing(10);
		hBox2.setPadding(new Insets(20));
		
		VBox vBox = new VBox(); //
		vBox.getChildren().add(hBox1);
		vBox.getChildren().add(hBox2);
		
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(vBox, 400, 300));
		primaryStage.show();
	}

}






