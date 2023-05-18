package layouts;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class BorderPaneEx extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Button[] bottons = new Button[5];
		String[] buttonNames = {"TOP", "LEFT", "CENTER", "RIGHT", "BOTTOM"};
		
		for(int i=0; i < bottons.length; i++) {
			bottons[i] = new Button(buttonNames[i]);
		}
		
		BorderPane border = new BorderPane();
		
		FlowPane flowTop = new FlowPane();
		flowTop.getChildren().add(bottons[0]);
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setStyle("-fx-background-color: #FFBB00;");
		flowTop.setPrefHeight(100);
		
		border.setTop(flowTop);
		
		
//		border.setTop(bottons[0]);
		border.setLeft(bottons[1]);
		border.setCenter(bottons[2]);
		border.setRight(bottons[3]);
		border.setBottom(bottons[4]);
		
		primaryStage.setScene(new Scene(border,400,200));
//		primaryStage.setTitle("GridPane Exam01");
		primaryStage.show();
	}

}
