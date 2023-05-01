package methodExam;

import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student student = new Student();
		
		System.out.print("이름 : ");		student.setName(sc.next());
		System.out.print("국어  : ");	student.setKor(sc.nextInt());
		System.out.print("영어  : ");	student.setEng(sc.nextInt());
		System.out.print("수학  : ");	student.setMath(sc.nextInt());
	
		System.out.println("이름 : " + student.getName());
		System.out.println("국어 : " + student.getKor());
		System.out.println("영어 : " + student.getEng());
		System.out.println("수학 : " + student.getMath());
		System.out.println("---------------------------");
		System.out.println("합계 : " + student.getTotal());
		System.out.println("평균 : " + student.getAverage());
	}
}
