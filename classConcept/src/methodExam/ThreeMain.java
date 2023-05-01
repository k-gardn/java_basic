package methodExam;

import java.util.Scanner;

public class ThreeMain {
	public static void main(String[] args) {
		Three three = new Three();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		three.setData(sc.nextInt());
		
		if(three.result()) { //boolean형 일 것이다.
			System.out.println(three.getData() + "는/은 3의 배수 입니다." );
		}else
			System.out.println(three.getData() + "는/은 3의 배수가 아닙니다." );
	}
}
