package sceneBuilders;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Ex1 extends Application{
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) throws Exception {
		System.out.println(getClass()); //현재 클래스의 참조값 
		// 결과 : class sceneBuilders.Ex1
		System.out.println(getClass().getResource("ex1.fxml")); 
		// 결과가 URL 자료형
		// 결과 : file:/C:/Users/hi/git/java_basic/javafxConcept/bin/sceneBuilders/ex1.fxml
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("ex1.fxml"));
		// FXML 파일을 가져와서 로드 하는 것. 
		// FXMLLoader는 URL을 넣어줘야함. 
		// String이 아님. 직접 경로를 써서 넣어줄 수 없음." /C:/Users/hi/git/java_basic/..."
		Parent form = loader.load(); //Scene이 요구하는 자료형이 Parent이다.
		
		primaryStage.setScene(new Scene(form));
		primaryStage.setTitle("Ex1");
		primaryStage.show();
	}
		
}
