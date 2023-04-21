package switchs;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		boolean stop = true;
		while(stop) {
			System.out.println("일을 입력하세요.");
			System.out.print("4월 " );
			input = sc.nextInt();
			
			if(input >= 1 && input <= 30) {
				String day="";
				int dayNum = input % 7;
				
				switch (dayNum) {
				case 1:
					day = "토요일";
					break;
				case 2:
					day = "일요일";
					break;
				case 3:
					day = "월요일";
					break;
				case 4:
					day = "화요일";
					break;
				case 5:
					day = "수요일";
					break;
				case 6:
					day = "목요일";
					break;
				case 0:
					day = "금요일";
					break;
				}
				System.out.println(input + " 일은 " + day + " 입니다.");
				stop = false;
//				break;
			}else {
				System.out.println("잘못 입력하셨습니다. ");
				System.out.println("1~30 사이의 숫자를 입력해주세요.");
				System.out.println();
			}
		}
		sc.close();
	}
}



