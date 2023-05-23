//package controls;
//
//import javafx.application.Application;
//import javafx.collections.ObservableList;
//import javafx.geometry.Insets;
//import javafx.geometry.Pos;
//import javafx.scene.Node;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.Label;
//import javafx.scene.control.RadioButton;
//import javafx.scene.control.TextField;
//import javafx.scene.control.ToggleGroup;
//import javafx.scene.layout.BorderPane;
//import javafx.scene.layout.FlowPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.VBox;
//import javafx.stage.Stage;
//import javafx.scene.control.TextArea;
//
//public class Quiz extends Application {
//
//	public static void main(String[] args) {
//		launch(args);
//	}
//	
//	public void start(Stage primaryStage) throws Exception {
//		
//		FlowPane flowTop = new FlowPane();
//		ObservableList<Node> toplist = flowTop.getChildren();
//		String[] topLabel = {"홈", "사회", "경제", "국제", "문화"};
//		
//		for(int i = 0; i < topLabel.length ; i++) {
//			toplist.add( getLable(topLabel[i]));
//		}
//		flowTop.setAlignment(Pos.CENTER);
//		flowTop.setPrefHeight(50);
//		flowTop.setHgap(30);
//		
//		
//		VBox leftBox = new VBox();
//		String[] leftLabel = {"카테고리", "노트북/PC", "자동차용품", "휴대폰", "캠핑/낚시"};
//		for(int i = 0; i < leftLabel.length ; i++) {
//			leftBox.getChildren().add(getLable(leftLabel[i]));
//		}
//		leftBox.setSpacing(30);
//		leftBox.setPadding(new Insets(0,30,0,10));
//		
//		
//		VBox centerBox = new VBox();
//		centerBox.getChildren().addAll(getSignUpBox("ID"), getSignUpBox("PW"));
//		centerBox.setPadding(new Insets(0,0,0,10));
//		centerBox.getChildren().add(getRadioButton("여","남"));
//		centerBox.getChildren().add(getCheckBox("게임","공부"));
//		centerBox.setSpacing(20.0);
//		
//		
//		TextArea area = new TextArea();
//		area.setMaxSize(150, 50);
////		area.setPadding(new Insets(20,0,0,0));
//		VBox areaBox = new VBox();
//		areaBox.getChildren().addAll(getLable("하고 싶은 말"), area);
//		areaBox.setSpacing(10.0);
//		centerBox.getChildren().add(areaBox);
//		
//		
//		HBox rightBox = new HBox();
//		Button loginButton = new Button("로그인");
//		loginButton.setPrefSize(80, 60);
//		rightBox.getChildren().addAll(getLoginTextFields(120,30),loginButton);
//		rightBox.setSpacing(5.0);
//		rightBox.setPadding(new Insets(0,10,0,0));
//		
//		BorderPane border = new BorderPane();
//		border.setTop(flowTop);
//		border.setLeft(leftBox);
//		border.setCenter(centerBox);
//		border.setRight(rightBox);
//		
//		
//		Scene scene = new Scene(border, 500, 300);
//		primaryStage.setTitle("Quiz controls");
//		primaryStage.setScene(scene);
//		primaryStage.show();
//	}
//	
//	public Label getLable(String menu) {
//		Label label = new Label(menu);
//		return label;
//	}
//	
//	public HBox getSignUpBox(String label) {
//		HBox hBox = new HBox();
//		
//		hBox.getChildren().add(getLable(label));
//		hBox.getChildren().add(new TextField());
//		hBox.setSpacing(15.0);
//		return hBox;
//	}
//	public HBox getRadioButton(String button1, String button2) {
//		RadioButton radio1 = new RadioButton("라디오1");
//		RadioButton radio2 = new RadioButton("라디오2");
//		
//		ToggleGroup group = new ToggleGroup();
//		radio1.setToggleGroup(group);
//		radio2.setToggleGroup(group);
//
//		radio1.setText(button1);
//		radio2.setText(button2);
//
//		radio1.setSelected(true);
//
//		HBox box = new HBox();
//		box.getChildren().addAll(radio1, radio2);
//		box.setSpacing(10);
//		return box;
//	}
//	public HBox getCheckBox(String button1, String button2) {
//		CheckBox check1 = new CheckBox("체크1");
//		CheckBox check2 = new CheckBox("체크2");
//		
//		check1.setText(button1);
//		check2.setText(button2);
//		
//		HBox box = new HBox();
//		box.getChildren().addAll(check1, check2);
//		box.setSpacing(10);
//		return box;
//	}
//	public VBox getLoginTextFields(double maxWidth, double maxHeight) {
//		TextField text1 = new TextField();
//		TextField text2 = new TextField();
//		
//		text1.setMaxSize(maxWidth, maxHeight);
//		text2.setMaxSize(maxWidth, maxHeight);
//		
//		VBox box = new VBox();
//		box.getChildren().addAll(text1, text2);
//		box.setSpacing(10);
//		return box;
//	}
//	
//
//}

package controls;

import java.util.ArrayList;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Quiz extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		BorderPane border =  new BorderPane();
		
		ArrayList<Label> topLabel = new ArrayList<Label>();
		topLabel.add(new Label("홈"));
		topLabel.add(new Label("사회"));
		topLabel.add(new Label("경제"));
		topLabel.add(new Label("국제"));
		topLabel.add(new Label("문화"));
		
		HBox top = new HBox();
		top.setAlignment(Pos.CENTER);
		top.setSpacing(30);
		top.setPadding(new Insets(20));

		top.getChildren().addAll(topLabel);
		border.setTop(top);
		
		ArrayList<Label> leftLabel = new ArrayList<Label>();
		leftLabel.add(new Label("카테고리"));
		leftLabel.add(new Label("노트북/PC"));
		leftLabel.add(new Label("자동차용품"));
		leftLabel.add(new Label("휴대폰"));
		leftLabel.add(new Label("캠핑/낚시"));
		
		VBox left = new VBox();
		left.setSpacing(20);
		left.setPadding(new Insets(10));
		left.setPrefWidth(100);
		
		left.getChildren().addAll(leftLabel);
		border.setLeft(left);
		
		
		VBox center = new VBox();
		
		HBox idBox = new HBox();
		Label idLabel = new Label("ID");
		idLabel.setPadding(new Insets(5, 5, 0, 0));
		
		idBox.getChildren().add(idLabel);
		idBox.getChildren().add(new TextField());
		idBox.setSpacing(15);
		center.getChildren().add(idBox);
		
		HBox pwBox = new HBox();
		Label pwLabel = new Label("PW");
		pwLabel.setPadding(new Insets(5, 0, 0, 0));
		
		pwBox.getChildren().add(pwLabel);
		pwBox.getChildren().add(new PasswordField());
		pwBox.setSpacing(15);
		center.getChildren().add(pwBox);

		HBox radioBox = new HBox();
		RadioButton woman = new RadioButton("여");
		RadioButton man = new RadioButton("남");
		ToggleGroup genderGroup = new ToggleGroup();
		woman.setToggleGroup(genderGroup);
		man.setToggleGroup(genderGroup);
		radioBox.getChildren().addAll(woman, man);
		radioBox.setSpacing(15);
		center.getChildren().add(radioBox);
		
		HBox checkBox = new HBox();
		CheckBox game = new CheckBox("게임");
		CheckBox study = new CheckBox("공부");
		checkBox.getChildren().addAll(game, study);
		checkBox.setSpacing(15);
		center.getChildren().add(checkBox);
		
		HBox sayBox = new HBox();
		sayBox.getChildren().add(new Label("하고 싶은 말"));
		center.getChildren().add(sayBox);
		
		HBox areaBox = new HBox();
		TextArea area = new TextArea();
		area.setPrefSize(170, 50);
		areaBox.getChildren().add(area);
		center.getChildren().add(areaBox);
		
		center.setSpacing(15);
		center.setPadding(new Insets(10));
		center.setMaxWidth(190);
		border.setCenter(center);
		
		/* RIGHT */
		TextField idFld = new TextField();
		PasswordField pwFld = new PasswordField();
		
		VBox idPw = new VBox();
		idPw.getChildren().addAll(idFld, pwFld);
		idPw.setSpacing(5);
		
		VBox login = new VBox();
		Button loginButton = new Button("로그인");
		loginButton.setPrefSize(70, 50);
		login.getChildren().add(loginButton);
		
		HBox right = new HBox();
		right.getChildren().addAll(idPw, login);
		right.setSpacing(5);
		right.setPadding(new Insets(10));
		border.setRight(right);
		
		primaryStage.setTitle("Quiz");
		primaryStage.setScene(new Scene(border, 550, 300));
		primaryStage.show();
	}
}
