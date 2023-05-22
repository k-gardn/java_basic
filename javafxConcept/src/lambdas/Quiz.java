package lambdas;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Quiz extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		Label search = new Label("Search", new ImageView("/img/search.png"));
		search.setFont(new Font(20));
		search.setTextFill(Color.BLUE);
		
		Label value = new Label("Values");
		value.setFont(new Font(20));
		
		Label longText = new Label("A label that needs to be wapped");
		longText.setWrapText(true); // 창 크기를 줄이면 줄 바꿈이 생김.
		
		search.setOnMouseEntered(
			e -> {
				search.setScaleX(1.5);
				search.setScaleY(1.5);
			}
		);
		search.setOnMouseExited(
			e -> {
				search.setScaleX(1);
				search.setScaleY(1);
			}
		);
		
		value.setOnMouseEntered(
			e -> {
				value.setRotate(270);
				value.setScaleX(1.5);
				value.setScaleY(1.5);
			}
		);
		value.setOnMouseExited(
			e -> {
				value.setRotate(0);
				value.setScaleX(1);
				value.setScaleY(1);
			}
		);
		
		longText.setOnMouseEntered(
			e -> {
				longText.setScaleX(1.5);
				longText.setScaleY(1.5);
				longText.setTextFill(Color.BLUE);
			}
		);
		longText.setOnMouseExited(
			e -> {
				longText.setScaleX(1);
				longText.setScaleY(1);
				longText.setTextFill(Color.BLACK);
			}
		);
			
		HBox box = new HBox();
		box.getChildren().addAll(search, value, longText);
		box.setSpacing(50);
		box.setAlignment(Pos.CENTER);
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(box, 500, 200));
		primaryStage.show();
	}
}











