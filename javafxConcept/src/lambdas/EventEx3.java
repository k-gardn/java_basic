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

public class EventEx3 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label label = new Label("클릭");
		label.setFont(new Font(24));
		label.setLayoutX(120);
		label.setLayoutY(80);
		
		label.setOnMouseEntered(new EventHandler<Event>() {
			@Override
			public void handle(Event event) {
				label.setScaleX(2);
				label.setScaleY(2);
			}
		}
		);
		
		label.setOnMouseExited((e) -> {
			label.setScaleX(1);
			label.setScaleY(1);
		});
		
		AnchorPane anchor = new AnchorPane();
		anchor.getChildren().add(label);
		primaryStage.setTitle("EventEx1");
		primaryStage.setScene(new Scene(anchor,300,200));
		primaryStage.show();
		
		
	}
}
