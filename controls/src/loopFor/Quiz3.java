package loopFor;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// 두 수를 입력 받아 작은 수 ~ 큰 수의 합계를 출력하세요.
		int i = 1, total = 0;
		System.out.println("두 수를 입력하세요.");
		int data1 = input.nextInt();
		int data2 = input.nextInt();
		
		if(data1 >= data2) {
			for(i = data2 ; i<= data1 ; i++) {
				total += i;
			}
		}else {
			for(i = data1 ; i<= data2 ; i++) {
				total += i;
			}
		}
		
		System.out.println("두 수를 포함한 사이 숫자들의 합은 " + total + "입니다.");
		
		//쌤 풀이.
//		int begin, end;
//		begin = input.nextInt();
//		end = input.nextInt();
//		
//		if(begin > end) { //매개 변수 tmp를 사용해야 두 변수의 수를 서로 바꿀 수 있다.
//			int tmp = end;
//			end = begin;
//			begin = tmp;
//		}
//		for(i = begin; i <= end; i++) {
//			total += i;
//		}
		
		
		// 수를 입력 받아 소수인지 아닌지 판별해서 출력하세요.
		
		System.out.println("숫자를 입력해주세요. ");
		int data3 = input.nextInt();
		boolean result = true;
		
		for(i = 2 ; i < data3 ; i++) { 
			if(data3 % i == 0) {
				result = false;
				break;
			}
			
		}
		
		if(result == false ) {
			System.out.println("소수가 아닙니다.");
		}
		else {
			System.out.println("소수 입니다.");
		}
		System.out.println(result);
		
		
		//쌤
		String message = data3 + "는/은 소수이다."; // 문자열로 해도 괜춘하다.
		for(i = 2 ; i < data3 ; i++) { 
			if(data3 % i == 0) {
				message = data3 + "는/은 소수가 아니다.";
				break;
			}
		}
		System.out.println(message);
		
		
		input.close();
		
	}

	
}
