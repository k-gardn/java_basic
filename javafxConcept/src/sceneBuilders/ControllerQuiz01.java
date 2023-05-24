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

public class ControllerQuiz01 implements Initializable{
	
	@FXML private Button login;  //다르면 null이다.
	@FXML private TextField id;
	@FXML private PasswordField pw;
	private MemberDAO memberDao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { // 생성자처럼 동작. 
		System.out.println("ControllerEx7 안에 Initializable Method 호출");
		memberDao = new MemberDAO();
	}
	
	public void message(String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		alert.setContentText(contentText);
		alert.show();
	}
	
	public void loginProc() {
		// 로그인
//		Alert alert = new Alert(AlertType.INFORMATION);
//		alert.setHeaderText("알림");
//		System.out.println("아이디 : "+ id.getText());
//		System.out.println("비밀번호 : "+ pw.getText());
//		
//		if(id.getText().equals("") && pw.getText().equals("")){
//			alert.setContentText("아이디, 비밀번호를 입력하세요.");
//		}
//		else if (id.getText().equals("")) {
//			alert.setContentText("아이디를 입력하세요.");
//		} else if(pw.getText().equals("")) {
//			alert.setContentText("비밀번호를 입력하세요.");
//		}
//		alert.show();
		
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
	
	public void idMaxLen() {
		//10자리가 넘어가면 알림이 뜨도록하기.
		String userId = id.getText();
		if(userId.length() > 10)
			message("최대 길이는 10자리 입니다.");
	}
	
	

}
