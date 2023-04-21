package conditions;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		수를 입력 받아 5의 배수이다/아니다. 구분하여 출력.
		System.out.println("수를 입력 받아 5의 배수이다/아니다. 구분하여 출력하시오.");
		System.out.print("입력 : ");
		int data1 = sc.nextInt();
		
		if(data1 % 5 == 0) {
			System.out.println("5의 배수이다.");
		}else {
			System.out.println("5의 배수가 아니다.");
		}
		
		
//		수를 입력 받아 0보다 크고 100보다 작으면 적중범위/비적중범위 구분하여 출력.
		System.out.println("수를 입력 받아 0보다 크고 100보다 작으면 적중범위/비적중범위 구분하여 출력하시오.");
		System.out.print("입력 : ");
		data1 = sc.nextInt();
		
		if(0 < data1 && data1 < 100) {
			System.out.println(data1 + "는 " + " 적중범위안에 있다." );
		}else {
			System.out.println(data1 + "는 " + " 적중범위 안에 있지 않다." );
		}
		
		
		
//		수를 입력 받아 짝수이고 3의 배수이다/아니다. 구분하여 출력.
		System.out.println("수를 입력 받아 짝수이고 3의 배수이다/아니다. 구분하여 출력하시오.");
		System.out.print("입력 : ");
		data1 = sc.nextInt();
		
//		if(data1 % 2 == 0 && data1 % 3 == 0 ) {
		if(data1 % 6 == 0  ) { //최소공배수로 해도됨!
			System.out.println( data1 + "는 " + "짝수이고 3의 배수이다.");
		}else {
			System.out.println( data1 + "는 " + "무엇도 아니다.");
		}
			

		sc.close();
	}

}
