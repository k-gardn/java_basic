package methodExam;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		EvenOdd2 eo2 = new EvenOdd2();
		Scanner sc = new Scanner(System.in);
		
		eo2.setData(11);
		boolean result = eo2.tests();
		System.out.println("결과 : " + result);
		
		eo2.setData(10);
		System.out.println("결과 : " + eo2.tests());

		System.out.print("데이터 입력 : " );
		int data =  sc.nextInt();
		eo2.setData(data);
		result = eo2.tests();
		System.out.println("결과 : " + result);
	}

}








