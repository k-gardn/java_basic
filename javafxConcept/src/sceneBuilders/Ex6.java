package sceneBuilders;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Ex6 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("regForm.fxml"));
		Parent form = loader.load();  
		
		/*
		 *  DB에 Table 수정하기
		 *  이름 : scene
		 *  컬럼 : 이름(name), 성별(gender), 
		 *  컬럼 : 연령대(ageScope), 취미(hobbys)
		 *  
			ALTER TABLE scene ADD name varchar2(21);
			ALTER TABLE scene ADD gender varchar2(6);
			ALTER TABLE scene ADD age_scope varchar2(6);
			ALTER TABLE scene ADD hobbys varchar2(100);
			COMMIT;

		 *  위 테이블에 ALTER TABLE 명령을 사용하여
		 *  컬럼을 추가하기.
		 */
		
		Button joinBtn = (Button)form.lookup("#join");
		ComboBox<String> ageCombo = (ComboBox<String>) form.lookup("#ageCombo");
		ageCombo.getItems().addAll("10대", "20대","30대");
		
		MemberDAO2 memberDao = new MemberDAO2();
		
		//회원가입
		joinBtn.setOnMouseClicked(e -> {
			TextField pwField = (TextField)form.lookup("#pw");
			TextField confirmField = (TextField)form.lookup("#confirm");
			if(pwField.equals(confirmField)) {
				
			}
			TextField idField = (TextField)form.lookup("#id");
			
			TextField nameField = (TextField)form.lookup("#name");
			
			RadioButton male = (RadioButton) form.lookup("#gender_m");
			RadioButton female = (RadioButton) form.lookup("#gender_f");
			
			CheckBox hobMusic = (CheckBox) form.lookup("#hob_music");
			CheckBox hobSports = (CheckBox) form.lookup("#hob_sports");
			CheckBox hobMovie = (CheckBox) form.lookup("#hob_movie");
			
			String id, pw, name, gender="", hobby="", ageScope;
			ageScope = null;
			
			id = idField.getText();
			pw = pwField.getText();
			name = nameField.getText();
			
			//성별
			if(male.isSelected()) {
				gender = male.getText();
			}else if(female.isSelected()) {
				gender = female.getText();
			}
			
			//취미
			if(hobMusic.isSelected()) {
				hobby += hobMusic.getText() + " ";
			}
			if(hobSports.isSelected()) {
				hobby += hobSports.getText() + " ";
			}
			if(hobMovie.isSelected()) {
				hobby += hobMovie.getText();
			}
			
			ageScope = ageCombo.getValue();
			
			int isJoin = memberDao.join(id, pw, name, gender, ageScope, hobby);
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setHeaderText("회원 가입");
			if(isJoin == 1) {
				alert.setContentText("회원가입 성공");
			}else {
				alert.setContentText("회원가입 실패");
			}
			
			System.out.println("아이디 : " + idField.getText());
			System.out.println("비밀번호 : " + pwField.getText());
			
		});
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex6");
		primaryStage.show();
	}
}
