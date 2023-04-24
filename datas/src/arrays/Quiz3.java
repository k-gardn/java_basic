package arrays;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] month = new int[12];
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] weeks = {"금","토","일","월","화","수","목"};
		
		int userMonth = 1;
		int userDay = 1;
		int totalDays = 0;
		String userWeek = "";
		
		//1월 1일 토요일. 7로 나눠서 1이면 토요일.
		//1월 8일 토요일.
		for(int i=0 ; i < 12; i++) {
			month[i] = i+1;
			System.out.println();
		}
		
		
		while(true) {
			System.out.println("월 일 입력 : ");
			try {
				userMonth = input.nextInt();
				userDay =input.nextInt();
				break;
			}catch (Exception e) {
				continue;
			}
//			input.nextLine();
		}
		
		for(int i = 0; i < userMonth ; i++ ) {
			if(userMonth == 1)
				break;
			totalDays += days[i];
		}
		
		totalDays += userDay;
		userWeek = weeks[totalDays % 7];
		System.out.println("2023년 " + userMonth + "월 "+ userDay + "일은 " + userWeek +"요일 입니다.");

		input.close();
	}
}



