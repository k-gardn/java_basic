package conditions;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int data;
		
		System.out.println("1.쉬운게임");
		System.out.println("2.어려운게임");
		System.out.println("3.나가기");
		System.out.println(">>>");
		data = input.nextInt();
		
		if(data == 1) {
			System.out.println("쉬운 게임 시작");
		}
		if(data == 2) {
			System.out.println("어려운 게임 시작");
		}
		if(data == 3) {
			System.out.println("종료 합니다.");
		}

		input.close();
	}

}
