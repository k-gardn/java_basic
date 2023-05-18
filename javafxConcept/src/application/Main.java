package application;
	
import java.awt.Dimension;
import java.awt.Toolkit;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Label label = new Label();
			label.setText("sdfsdf");
			
			label.setFont(new Font("Consolas",30));
			
			Scene scene = new Scene(label,400,200); // 라벨 출력
					
			Toolkit tk = Toolkit.getDefaultToolkit(); // Toolkit 첫 호출시, new Toolkit(); 후 참조값 반환
			Dimension screenSize = tk.getScreenSize();
			
			System.out.println("width : " + screenSize.width);
			System.out.println("height : " + screenSize.height);
			
			int x = screenSize.width;
			int y = screenSize.height;
			
			primaryStage.setX(x / 2 - (400 / 2)); // 해상도 / 2 - 창크기 / 2
			primaryStage.setY(y / 2 - (200 / 2));
			
			primaryStage.setTitle("창의 제목");
			
			primaryStage.setScene(scene);	
			primaryStage.show();			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
