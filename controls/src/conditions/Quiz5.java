package conditions;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		학점을 입력받아 구분하여 문자열 출력.
		System.out.println("학점을 입력하세요.A,B,C,D,F 중에 입력하세요.");
		System.out.print("점수 : ");
//		char data1 = input.next().charAt(0);
		char data1 = input.next().toUpperCase().charAt(0); // 쌤이 한 방법.
		
		
		if(data1 == 'A' || data1 == 'B') {
			System.out.println("참 잘했어요.");
		}
		else if(data1 == 'C' || data1 == 'D') {
			System.out.println("분발합시다.");
		}
		
//		String grade = input.next().toUpperCase(); // 쌤 //입력으로 받은 A의 주소와 "A"의 주소(참조)가 다름.
//		//grade.equals("A"); //equals : 입력으로 받은 A의 주소와 "A"의 주소가 같은지 비교할수 있도록 하는 매서드
//		if(grade.equals("A") || grade.equals("B")) {
//		System.out.println("참 잘했어요.");
//	}else if(grade.equals("C") || grade.equals("D")) {
//		System.out.println("분발합시다.");
//	}
		
		
//		윤년/평년을 판별해주는 프로그램을 작성하세요.
		System.out.println("윤년/평년을 판별해주는 프로그램을 작성하세요.");
		System.out.print("년도 입력 : ");
		int data2 = input.nextInt();
		
		String result = "";
		
		
		if(data2 % 400 == 0 ) {
			result = "윤년";
		}
		else {
			if(data2 % 100 == 0){
			result = "평년";
			}else if(data2 % 4 == 0) {
				result = "윤년";
			}else {
				result = "평년";
			}
		}
// 		쌤 풀이	
//		if(data2 % 4 == 0)
//			result = "윤년";
//				if(data2 % 100 == 0)
//					result = "평년";
//					if(data2 % 400 == 0)
//						result = "윤년";
		
		
		
		System.out.print(result + "입니다.");
		
		input.close();
	}

}
