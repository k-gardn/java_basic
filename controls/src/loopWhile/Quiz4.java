package loopWhile;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// 369게임.
		// for문으로 범위 지정/ while 문으로 10의 자리, 일의 자리 뽑아내서 하면 되지 않을 까?
		
		System.out.println("369게임 입니다. 숫자를 입력해주세요." );
		System.out.print("입력: ");
		int num = input.nextInt();
		int count = 0;
//		int tmp = num;
		
		for(int i = 1; i <= num; i++) {
			int tmp = i;
			while(true) {
				
				int rest = tmp % 10; //1의 자리.
				if(rest == 3 || rest == 6 || rest == 9) {
					count++;
				}
				tmp = tmp / 10; //몫
				if(tmp == 0)
					 break;
			}
		}
		System.out.println("박수를 친 횟수는 " + count + " 번 입니다.");
		 
	}

}
