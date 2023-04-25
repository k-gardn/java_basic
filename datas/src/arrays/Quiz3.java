package arrays;

import java.util.Scanner;

public class Quiz3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		/*
		 * 2023년 1월 1일은 토요일입니다. 
		 * 두 수 a ,b를 입력 받아 2023 년 a월 b일이 무슨 요일인지 출력하세요.
		 * 요일의 이름은 일요일부터 토요일입니다. 
		 * 예를 들어 a=2, b=22라면 2월 22일은 수요일이므로 문자열 “수요일"을 출력하세요. 
		 * 단, 13월 26일이나 2월 45일같은 날짜는 주어지지 않습니다.
		 */
		
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		String[] weeks = {"토","일","월","화","수","목","금"};
		
		int userMonth = 1;
		int userDay = 1;
		int totalDays = 0;
		String userWeek = "";
		
		//1월 1일 토요일. 7로 나눠서 1이면 토요일.
		//1월 8일 토요일.
		
		while(true) {
			System.out.println("월 일 입력 : ");
			try {
				userMonth = input.nextInt();
				userDay =input.nextInt();
				if(userMonth < 1 || userMonth > 12 )
					continue;
				if(userDay > days[userMonth - 1])
					continue;
				break;
			}catch (Exception e) {
				continue;
			}
//			input.nextLine();
			
		}
		
		
		for(int i = 0; i < userMonth - 1; i++ ) {
			if(userMonth == 1)
				break;
			totalDays += days[i];
		}
		
		totalDays += userDay;
		userWeek = weeks[totalDays % 7];
		System.out.println("2023년 " + userMonth + "월 "+ userDay + "일은 " + userWeek +"요일 입니다.");
//		System.out.printf("2023년 %02d월 %02d일은 %s요일 입니다.", month, day, week[total % 7] );
		input.close();
	}
}



