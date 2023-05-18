package layouts;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPane1 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		Label id = new Label("ID");
		Label password = new Label("Password");
		
		TextField idField = new TextField(); 		// 보여진다.
		PasswordField pwField = new PasswordField(); // 안보여진다.
		
		idField.setMaxWidth(200);
		pwField.setMaxWidth(200);
		
		Button loginButton = new Button("로그인");
		Button cancelButton = new Button("취소");
		loginButton.setPrefSize(100, 30); //버튼 크기 
		cancelButton.setPrefSize(100, 30);
		
		//setConstraints가  static 메서드여서 아래와 같이 써서 만들어야함.
		GridPane.setConstraints(id, 0, 0);// 열, 행
		GridPane.setConstraints(password, 0, 1);
		GridPane.setConstraints(idField, 1, 0);
		GridPane.setConstraints(pwField, 1, 1);
		
		FlowPane flow = new FlowPane();
		flow.setAlignment(Pos.CENTER);
		flow.setHgap(30);
		flow.getChildren().addAll(loginButton, cancelButton);
		GridPane.setConstraints(flow, 0, 2, 2, 1); // 열 병합(2) 2개, 행 병합(1)은 안해.
		flow.setStyle("-fx-background-color: #FFBB00");
		
		GridPane grid = new GridPane();
		grid.getChildren().addAll(id,password,idField,pwField,flow);
		grid.setAlignment(Pos.CENTER); 
		grid.setHgap(30); // 수평 갭
		grid.setVgap(20); // 수직 갭
		
		grid.setPadding(new Insets(0, 0, 0, 50)); // 위, 오른, 아래, 왼 - padding
		
		
		primaryStage.setScene(new Scene(grid,400,200));
		primaryStage.setTitle("GridPane Exam01");
		primaryStage.show();
	}

}
