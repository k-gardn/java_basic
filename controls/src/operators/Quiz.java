package operators;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 수를 입력 받아 짝수/홀수를 구분하여 출력하세요.
		System.out.print("숫자를 입력하세요.");
		int data1 = sc.nextInt();
		
		String result1 = (data1 % 2 == 0) ? "짝수" : "홀수";
//		boolean result = (data1 % 2 == 0) ? true : false;
		System.out.println("짝수냐 홀수냐 ? " + result1);
		
		
		// 수를 입력 받아 3의 배수이다/3의 배수가 아니다를 출력하세요.
		System.out.print("숫자를 입력하세요.");
		int data2 = sc.nextInt();
		
		String result2 = (data2 % 3 == 0) ? "3의 배수이다." : "3의 배수가 아니다.";
		System.out.println("3의 배수니 ? " + result2);
		
		
		// 수를 입력 받아 큰 수를 출력 하세요.
		System.out.print("두개의 수를 입력하세요. ");
		int data3 = sc.nextInt();
		int data4 = sc.nextInt();
		
		int result3 = (data3 > data4) ? data3 : data4;
		
		System.out.println("둘 중 큰 수는 ? " + result3);
		
		
		String result4 = (data3 == data4) ? data3 + "과/와" + data4 + "는 동일한 수 입니다." :
			((data3 > data4) ? data3 + " 과/와 " + data4 + " 중 큰 수는 " + data3 + "입니다." : 
				data3 + " 과/와 " + data4 + " 중 큰 수는 " + data4 + "입니다.");
		
		System.out.println("둘 중 큰 수는 ? " + result4);
		
		
		sc.close();
		 
	}
	
}
