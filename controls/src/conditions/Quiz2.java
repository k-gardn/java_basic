package conditions;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		세 수를 입력 받아 큰 수를 출력하시오.
		System.out.println("세 수를 입력 받아 큰 수를 출력하시오.");
		System.out.print("세 수 입력 : ");
		int data1 = sc.nextInt();
		int data2 = sc.nextInt();
		int data3 = sc.nextInt();
		
		int max = data1;
		
		if(max < data2) {
			max = data2;
		}
		if(max < data3)
			max = data3;
		
		System.out.println("셋 중 가장 큰 수는 " + max + "이다.");
		sc.nextLine();
		
//		두 수를 입력 받아 큰 수가 짝수이면 출력하시오.
		System.out.println("두 수를 입력 받아 큰 수가 짝수이면 출력하시오.");
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		
		
		max = data1;
		if(max < data2) {
			max = data2;
		}
		if(max % 2 == 0)
			System.out.println("둘 중에 큰 수는 " + max + " 이고, " + "짝수이다." );
		
//		sc.nextLine();
//		두 수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오.
		System.out.println("두 수를 입력 받아 합이 짝수이고 3의 배수인 수를 출력하시오.");
		System.out.print("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		
		int sum = data1 + data2;
		if(sum % 2 == 0 && sum % 2 == 0)
			System.out.println( "두 수의 합은 " + sum + "이며, " + "짝수이고 3의 배수이다.");

		sc.close();
	}

}
