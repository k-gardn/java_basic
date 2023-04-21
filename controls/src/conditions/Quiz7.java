package conditions;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		국영수 점수 입력. 평균 60점 이상, 과목 점수 40점 이상이면 합격.
//		"평균 불합격", "어떤 과목 불합격"
		
		System.out.println("국어, 영어, 수학 점수를 입력해주세요.");
		System.out.print("국어 : ");
		int korean = input.nextInt();
		System.out.print("영어 : ");
		int english = input.nextInt();
		System.out.print("수학 : ");
		int math = input.nextInt();
		
		int sum = korean + english + math;
		
		if(korean < 40 || english < 40 || math < 40 ) {
			if(korean < 40)
				System.out.println("국어 과목 불합격");
			if(english < 40)
				System.out.println("영어 과목 불합격");
			if(math < 40)
				System.out.println("수학 과목 불합격");
		}else if(sum / 3 < 60 )
			System.out.println("평균 불합격");
//		if(average >= 60) {
//			if(kor < 40) {
//				message = "국어 불합격";
//			}else if(eng < 40) {
//				message = "영어 불합격";
//			}else if(math < 40) {
//				message = "수학 불합격";
//			}else{
//				message = "합격";
//			}
//		}else {
//			message = "평균 불합격";
//		}
			
//		주차장 기본 요금은 30분에 3000원. 10분 단위로 추가요금 500원씩 부가.
		System.out.println("주차 시간을 입력하세요.");
		int time = input.nextInt();
		int price = 3000;
		
		if(time > 30) {
			if(time % 10 == 0) {
				price += (time - 30) / 10 * 500;
			}
			else {
				price += ((time - 30) / 10 + 1) * 500;
			}
			
		}
		else if(time <= 0) {
			price = 0;
		}
			
		System.out.println(price + "원 입니다.");
		
		input.close();
	}

}
