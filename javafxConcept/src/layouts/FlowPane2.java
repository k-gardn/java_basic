package layouts;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPane2 extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		ArrayList<Button> tmpList = new ArrayList<>();
		for(int i = 1; i < 10; i++) {
			Button button = new Button("버튼"+i);
			tmpList.add(button);
		}
		
		FlowPane flowPane = new FlowPane(); // 행으로 배열
		ObservableList<Node> list = flowPane.getChildren();
		list.addAll(tmpList);
		
		primaryStage.setScene(new Scene(flowPane,200,200));
		primaryStage.show();
	}

}
