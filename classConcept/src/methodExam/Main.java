package methodExam;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd(); // 설계도를 바탕으로 건물을 지었다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("결과 : " + eo.tests(10));
		System.out.println("결과 : " + eo.tests(222));
		System.out.println("결과 : " + eo.tests(123));
		
		System.out.println("데이터 입력 : ");
		int data = sc.nextInt();
		boolean result = eo.tests(data);
		System.out.println("결과 : " + result);

	}

}
