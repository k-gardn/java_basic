package layouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Quiz1 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label menu = new Label("메뉴");
		Label home = new Label("홈");
		Label login = new Label("로그인");
		
		BorderPane border = new BorderPane();
		
		FlowPane flowTop = new FlowPane();
		flowTop.getChildren().addAll(menu, home, login);
		flowTop.setAlignment(Pos.CENTER);
		flowTop.setStyle("-fx-background-color: #FFB6C1;");
		flowTop.setPrefHeight(50);
//		home.setPadding(new Insets(0,100,0,100));
		flowTop.setHgap(100);
		
		Button MenuButton = new Button("메뉴 나열");
		FlowPane flowLeft = new FlowPane();
		flowLeft.getChildren().add(MenuButton);
		flowLeft.setStyle("-fx-background-color: #00BFFF;");
		flowLeft.setPrefWidth(100);
		
		Button ContentButton = new Button("내용 들어가는 곳");
		FlowPane flowCenter = new FlowPane();
		flowCenter.getChildren().add(ContentButton);
		flowCenter.setStyle("-fx-background-color: #7FFF00");
//		flowCenter.setPrefWidth(10); // 크기 변화가 없음.
		
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
		flowRight.setStyle("-fx-background-color:#FFFFE0 ");
		flowRight.setPrefWidth(250);
		
		Button footer = new Button("바닥글 들어가는 곳");
		FlowPane flowBottom = new FlowPane();
		flowBottom.getChildren().add(footer);
		flowBottom.setAlignment(Pos.CENTER);
		flowBottom.setStyle("-fx-background-color: #A0522D;");
		flowBottom.setPrefHeight(70);
		
		border.setTop(flowTop);
		border.setLeft(flowLeft);
		border.setCenter(flowCenter);
		border.setRight(flowRight);
		border.setBottom(flowBottom);
		
		primaryStage.setScene(new Scene(border,500,300));
		primaryStage.setTitle("Quiz1");
		primaryStage.show();
	}
}
