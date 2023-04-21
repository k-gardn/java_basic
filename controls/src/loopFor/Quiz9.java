package loopFor;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//2에서 부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라.
		
		int i, j;
		boolean flag = true;
		
		System.out.println("숫자를 입력해주세요.");
		int num = input.nextInt();
		System.out.println("2 부터 입력하신 " + num +" 까지의 숫자 중에 소수는 ");
		
		for(i = 2 ; i <= num ; i++) {
			flag = true;
			for(j = 2; j < i ; j++) {
				if(i % j == 0)
					flag = false;
			}
		if(i ==2 || flag)	
			System.out.print( i + " ");
		}
		System.out.println(" 는 소수 입니다.");
		
		
		
		System.out.println();
		for(i = 0; i <= 10; i++ ) {
			for(j = 0; j <= 10; j++ ) {
				if(3 * i + 2* j == 10) {
					System.out.println("i = " + i + " j = " + j);
				}
			}
		}
	}
	
	
}



	
