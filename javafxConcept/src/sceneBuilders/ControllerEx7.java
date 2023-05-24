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

public class ControllerEx7 implements Initializable{
	
	// 조건은 참조변수의 이름은 fx:id랑 동일해야한다.
	// fxml의 id값을 찾아와서 참조값을 변수에 담아줌.
	
	@FXML private Button login;  //다르면 null이다.
	@FXML private TextField id;
	@FXML private PasswordField pw;
	private MemberDAO memberDao;
	//FXML의 onActio에 넣어둔 이벤트는 꼭 구현해놔야 에러가 안남.
	
	
	public void loginProc() {
		// 로그인
		String dbPw = memberDao.login(id.getText());
		Alert alert = new Alert(AlertType.INFORMATION);
		if (dbPw != null && dbPw.equals(pw.getText())) {
			alert.setContentText("로그인 성공");
		} else {
			alert.setContentText("로그인 실패");
		}
		alert.show();
	}
	public void cancelProc() {}
	public void regProc() {}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) { // 생성자처럼 동작. 
		System.out.println("ControllerEx7 안에 Initializable Method 호출");
		memberDao = new MemberDAO(); // 처음에 한번 실행해서 참조값을 넣어줌.
	}
}
