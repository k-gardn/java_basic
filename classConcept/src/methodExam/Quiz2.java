package methodExam;

import java.util.Scanner;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * 절대 값을 구하는 함수를 정의하시오.(Absolute.java)
		 * 
		 * 점수를 입력 받아 A~F학점을 출력하시오.(Grade.java)
		 * - 90 이상 A, 80이상 B, 70이상 C, 60이상 D, 그 외 F
		 * */
		
		//절대값 출력
		Scanner sc = new Scanner(System.in);
		Absolute abs = new Absolute();
		
		System.out.println("숫자를 입력하세요. ");
		abs.setNum(sc.nextInt());
		System.out.println(abs.getNum() + "의 절대 값은 " + abs.absNum());
		
		//점수 출력
		Grade grade = new Grade();
		System.out.println("점수를 입력하세요. ");
		grade.setScore(sc.nextInt());
		
		System.out.println("점수는 " + grade.getGrade() +" 입니다."); 
	}
}
