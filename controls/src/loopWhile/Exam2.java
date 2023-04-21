package loopWhile;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		int i = 1, sum = 0;
		boolean loopFlag = true;
		
		while(loopFlag) {
			System.out.print("수 입력(1~ 100) : ");
			i = input.nextInt();
			if(i >= 1 && i <= 100)
				loopFlag = false;
			else
				System.out.println("잘못 입력, 다시");
			//여기에 수행할 문장이 있을 경우. 
			// break문 대신, loopFlag = false; 이렇게 쓴다.
		}
		
//		while(loopFlag) {
//			System.out.print("수 입력(1~ 100) : ");
//			i = input.nextInt();
//			if(i >= 1 && i <= 100)
//				break;
//			else
//				System.out.println("잘못 입력, 다시");
//		}
		
		for(int j = 1; j <= i; j++) {
			sum += j;
		}
		System.out.println("입력 받은 수까지의 합: " + sum);
	}

}
