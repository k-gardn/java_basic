package sceneBuilders;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ControllerQuiz03 implements Initializable{
	
	@FXML private Button login;  //다르면 null이다.
	@FXML private TextField id;
	@FXML private PasswordField pw;
	private MemberDAO memberDao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { // 생성자처럼 동작. 
		System.out.println("ControllerEx7 안에 Initializable Method 호출");
		memberDao = new MemberDAO();
		login.setDisable(true);
	}
	
	public void message(String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		alert.setContentText(contentText);
		alert.show();
	}
	
	public void loginProc() {
		String userId = id.getText();
		String userPw = pw.getText();
		
		String dbPw = memberDao.login(userId);
		
		if(userId.isEmpty()) {
			message("아이디를 입력하세요.");
		}else if(userPw.isEmpty()) {
			message("비밀번호를 입력하세요.");
		}else if(dbPw != null && dbPw.equals(userPw) ) {
			message("로그인 성공");
		}else {
			message("로그인 실패");
		}
	}
	
	// TextField 이벤트 메서트(onKeyPressed) - 키를 눌렀을 때
	public void idCheck() {
		//10자리가 넘어가면 알림이 뜨도록하기.
		String userId = id.getText();
		if(!userId.isEmpty()) {
			login.setDisable(false);
		}else {
			login.setDisable(true);
		}
		
		if(userId.length() > 10) {
			message("최대 길이는 10자리 입니다.");
			id.setText(id.getText().substring(0, 10));
		}
	}
	
	// PasswordField 이벤트 메서트(onKeyReleased) - 키를 뗐을 때
	public void pwCheck() {
		//10자리가 넘어가면 알림이 뜨도록하기.
		String userPw = pw.getText();
		if(userPw.length() > 10) {
			message("최대 길이는 10자리 입니다.");
			pw.setText(pw.getText().substring(0, 10));
		}
	}
	
}
