package lambdas;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class EventEx1 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("클릭");
		label.setFont(new Font(24));
		label.setLayoutX(120);
		label.setLayoutY(80);
		
		//EventHandler : 인터페이스
		// 1. 상속 받은 클래스 구현
		// 2. 인스턴스 만들어서 구현
		// 3. 람다
//		EventHandler<Event> event = new EventHandler<Event>() {
//			@Override
//			public void handle(Event event) {
//				System.out.println("Label 클릭을 함");
//			}
//		};
////		event.handle(new Event(null));
////		label.setOnMousePressed(event);
//		label.setOnMouseClicked(event);
		
		EventHandler<Event> event2 = e ->{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("머리글");
			alert.setContentText("본문 내용");
			alert.show();
		};
//		event2.handle(new Event(null));
		label.setOnMouseClicked(event2);
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(label);
		primaryStage.setTitle("EventEx1");
		primaryStage.setScene(new Scene(anchor,300,200));
		primaryStage.show();
		
		
	}
}
