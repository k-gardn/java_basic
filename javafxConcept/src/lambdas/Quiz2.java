package lambdas;

import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz2 extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		HBox loginBox = new HBox();
		TextField text1 = new TextField();
		TextField text2 = new TextField();
		
		text1.setMaxSize(180, 60);
		text2.setMaxSize(180, 60);
		
		VBox box = new VBox();
		box.getChildren().addAll(text1, text2);
		box.setAlignment(Pos.CENTER);
		box.setMaxHeight(100.0);
		box.setSpacing(10);
		
		Button loginButton = new Button("로그인");
		loginButton.setPrefHeight(55);
		loginButton.setAlignment(Pos.CENTER);
		
		loginBox.getChildren().addAll(box,loginButton);
		loginBox.setMaxWidth(200);
		loginBox.setAlignment(Pos.CENTER);
		loginBox.setSpacing(5);

		//이거 왜 안되나여??? -> 이때 넣어버리면 비어있는게 저장되어버림..!!..
//		String id = text1.getText();
//		String pw = text2.getText();
		
		String checkId = "admin";
		String checkPw = "1234"; 
		
		loginButton.setOnMouseClicked(e->{
//			String id = text1.getText();
//			String pw = text2.getText();
//			Alert alert = new Alert(AlertType.INFORMATION);
//				alert.setHeaderText("로그인");
////				if(text1.getText().equals(checkId) && text2.getText().equals(checkPw)) {
//				if(id.equals(checkId) && pw.equals(checkPw)) {
//					alert.setContentText("로그인 성공");
//				}
//				else {
//					alert.setContentText("로그인 실패");
//				}
//				alert.show();
			
			//db 연결하여 id, pw 체크
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("로그인");
			String id = text1.getText();
			String pw = text2.getText();
			
			MemberDAO memberDao = new MemberDAO();
			String dbPw = memberDao.login(id);
			
			if(dbPw != null && dbPw.equals(pw)) {
				alert.setContentText("로그인 성공");
			}else {
				alert.setContentText("로그인 실패");
			}
			alert.show();
//			System.out.println(idFld.getText());
//			System.out.println(pwFld.getText());
		});
		
		primaryStage.setTitle("Quiz2");
		primaryStage.setScene(new Scene(loginBox, 300, 200));
		primaryStage.show();
	}
	

}
