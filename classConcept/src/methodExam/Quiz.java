package methodExam;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		/*
		 * 두 수를 입력받아 큰 수를 판별하시오.(Max.java)
		 * 수 를 입력 받아 소수를 판별하시오.(Prime.java)
		 */
		
		Scanner sc = new Scanner(System.in);
		Max max = new Max();
		System.out.print("두 수 입력 : ");
		max.setData1(sc.nextInt());
		max.setData2(sc.nextInt());
		
		System.out.printf("%d와 %d 중 큰 수 : %d\n", 
				max.getData1(), max.getData2(), max.largeNumber());
		
		Prime prime = new Prime();
		System.out.print("수 입력 : ");
		prime.setData(sc.nextInt());
		
		if(prime.isPrime()) {
			System.out.println(prime.getData() + "는 소수이다.");
		}else {
			System.out.println(prime.getData() + "는 소수가 아니다.");
		}
	}
}
