package sceneBuilders;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class ControllerEx8 implements Initializable{
	// 어노테이션
	@FXML TextField idField;
	@FXML PasswordField pwField;
	@FXML Button loginButton;

	private MemberDAO memberDao;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		loginButton.setDisable(true);
		
//		System.out.println(idField.textProperty());
		idField.textProperty().addListener(
			(observable, oldValue, newValue) -> {
				System.out.println(observable);
				System.out.println("oldValue : "+ oldValue);
				System.out.println("newValue : " + newValue);
				if(newValue.length() > 10) {
					message("최대 길이는 10자리입니다.");
					idField.setText(oldValue);
				}
				
				if(newValue.length() != 0)
					loginButton.setDisable(false);
				else if(newValue.length() == 0)
					loginButton.setDisable(true);
			}
		); 
		pwField.textProperty().addListener(
			(a,o,n)->{
				if(n.length() > 10) {
					message("최대 길이는 10자리입니다.");
					pwField.setText(o);
				}
				
		});
		memberDao = new MemberDAO();
	}
	
	public void message(String contentText) {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setHeaderText("알림");
		alert.setContentText(contentText);
		alert.show();
	}
	
	// 로그인 버튼이 클릭되면 동작함.
	public void loginButtonMethod() {
		String userId = idField.getText();
		String userPw = pwField.getText();
		
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
	
}



