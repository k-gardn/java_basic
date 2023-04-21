package loopFor;

import java.math.BigInteger;
import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 1에서 1000까지의 자연수 중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하세요.
		int i =0, total = 0;
		System.out.println("1에서 1000까지의 자연수 중에서 4로 나누어도 6으로 나누어도 나머지가 1인 수의 합을 출력하세요.");
		
		for(i=1; i<=1000; i++) {
			if(i % 4 == 1 && i % 6 == 1) { //i % 12 == 1
				total += i; 
			}
		}
		System.out.println("합계 : " + total);
		
		
		// 첫 날에 1원, 다음날은 2배 증가. 30일 동안 저축한 금액을 구하세요.
		
		System.out.println("첫 날에 1원, 다음날은 2배 증가. 30일 동안 저축한 금액을 구하세요.");
		total = 0;
		int money = 1;
		for(i=1; i <= 30; i++) { // 1, 1*2, 1*2*2, ..., 1*2^29
			total = total + money ; 
			money = money * 2;
		}
		System.out.println("금액 : " + total);
		
		
		// 체스판 1칸에 밀알 1개, 2배씩 증가. 64칸에는 밀알이 몇 개인가?
		
		System.out.println("체스판 1칸에 밀알 1개, 2배씩 증가. 64칸에는 밀알이 몇 개인가?");
		
		BigInteger meal = new BigInteger("1"); // new BigInteger.ONE;
		BigInteger totalMeal = new BigInteger("0"); // new BigInteger.ZERO;
		
		for(i=1; i <= 64; i++) {
			
			totalMeal = totalMeal.add(meal); 
			meal = meal.multiply(BigInteger.valueOf(2));
//			System.out.println(meal);
		}
		
		System.out.println(totalMeal);
		
		input.close();
		
	}

	
}
