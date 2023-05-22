
package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Quiz5 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		BorderPane border = new BorderPane();
		
		FlowPane flow = new FlowPane();
		flow.getChildren().addAll(getLable("메뉴"),getLable("홈"),getLable("로그인"));
		flow.setAlignment(Pos.CENTER);
		flow.setPrefHeight(50);
		flow.setHgap(50);
		flow.setStyle("-fx-background-color: #FFBB00;");
		
		border.setTop(flow);
		
		ListView<String> lv = new ListView<String>();
		lv.getItems().addAll("아이템1", "아이템2", "아이템3");
		lv.setPrefSize(80,100);
		
		FlowPane flowLeft = new FlowPane();
		flowLeft.getChildren().add(lv);
		flowLeft.setPrefWidth(100);
		border.setLeft(flowLeft);
		
		Button ContentButton = new Button("내용 들어가는 곳");
		FlowPane flowCenter = new FlowPane();
		flowCenter.getChildren().add(ContentButton);
		
		Button idButton = new Button("아이디 입력");
		Button pwButton = new Button("비밀번호 입력");
		Button loginButton = new Button("로그인");
		idButton.setPrefSize(120, 30);
		pwButton.setPrefSize(120, 30);
		loginButton.setPrefSize(70, 60);
		
		GridPane grid = new GridPane();
		grid.add(idButton, 0, 0);
		grid.add(pwButton, 0, 1);
		grid.add(loginButton, 1, 0, 1, 2);
		grid.setPadding(new Insets(30,0,0,30));
		
		FlowPane flowRight = new FlowPane();
		flowRight.getChildren().add(grid);
		flowRight.setPrefWidth(250);
		
		Button footer = new Button("바닥글 들어가는 곳");
		FlowPane flowBottom = new FlowPane();
		flowBottom.getChildren().add(footer);
		flowBottom.setAlignment(Pos.CENTER);
		flowBottom.setPrefHeight(70);
		
		border.setCenter(flowCenter);
		border.setRight(flowRight);
		border.setBottom(flowBottom);
		
//		VBox vbox = new VBox();
//		vbox.getChildren().addAll(stack1, flowCenter,flowRight,flowBottom);
		
		ImageView iv = new ImageView("img/quiz.jpg");
		
		StackPane stackBackground = new StackPane();
		stackBackground.getChildren().addAll(iv, border);
//		stackBackground.getChildren().addAll(border, iv);
		
		primaryStage.setTitle("Quiz5");
		primaryStage.setScene(new Scene(stackBackground, 500, 335));
		primaryStage.show();
	}

	public Label getLable(String menu) {
		Label label = new Label(menu);
		return label;
	}
}
