package sceneBuilders;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Ex5 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("loginForm.fxml"));
		Parent form = loader.load();  
		Button joinBtn = (Button)form.lookup("#join");
		Button loginBtn = (Button)form.lookup("#login");
		
		MemberDAO memberDao = new MemberDAO();
		
		//회원가입
		joinBtn.setOnMouseClicked(e -> {
			TextField idField = (TextField)form.lookup("#id");
			TextField pwField = (TextField)form.lookup("#pw");
			
			String inputId = idField.getText();
			String inputPw = pwField.getText();
			boolean Ids = memberDao.checkId(inputId);
			if(inputId != null) {
				if(Ids == true)
					System.out.println("이미 존재하는 아이디 입니다.");
				else {
					int isJoined = memberDao.join(inputId, inputPw);
					if(isJoined == 1)
						System.out.println("회원가입이 완료되었습니다.");
				}
			}
			
			System.out.println("아이디 : " + idField.getText());
			System.out.println("비밀번호 : " + pwField.getText());
			
			String id, pw;
			
			id = idField.getText();
			pw = pwField.getText();
			
		});
		
		// 로그인
		loginBtn.setOnMouseClicked(e -> {
			TextField idField = (TextField)form.lookup("#id");
			TextField pwField = (TextField)form.lookup("#pw");
			
			String inputId = idField.getText();
			String inputPw = pwField.getText();
			
			if(inputId != null) {
				boolean Ids = memberDao.checkId(inputId);
				String dbPw = memberDao.login(inputId);
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setHeaderText("로그인");
				
				if(dbPw != null && dbPw.equals(inputPw)) { // dbPw == null 이면 아이디가 존재하지 않는 것임
					alert.setContentText("로그인 성공");
				}else {
					alert.setContentText("로그인 실패");
				}
//				if(Ids == true) {
//					if(dbPw.equals(inputPw))
//						alert.setContentText("로그인 성공");
//					else {
//						alert.setContentText("비밀번호가 틀렸습니다.");
//					}
//				}else {
//					alert.setContentText("존재하지 않는 아이디입니다.");
//				}
				alert.show();
			}
			
			String id, pw;
			
			id = idField.getText();
			pw = pwField.getText();
			
		});
		
		


		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex5");
		primaryStage.show();
	}
}
