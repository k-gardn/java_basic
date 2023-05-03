package constructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");		String name = sc.next();
		System.out.print("국어  : ");	int kor = sc.nextInt();
		System.out.print("영어  : ");	int eng = sc.nextInt();
		System.out.print("수학  : ");	int math = sc.nextInt();
		
		Student student = new Student(name, kor, eng, math);
		// 한번 미리 데이터 넣어놓고, 불변하게 만들기.
		// 버그를 줄이려고.
		Student student2 = new Student(); 
		// public Student(String name, int kor, int eng, int math) 때문에
		// public Student()기본 생성자를 따로 명시해줘야함.
	
		System.out.println("이름 : " + student.getName());
		System.out.println("국어 : " + student.getKor());
		System.out.println("영어 : " + student.getEng());
		System.out.println("수학 : " + student.getMath());
		System.out.println("---------------------------");
		System.out.println("합계 : " + student.getTotal());
		System.out.println("평균 : " + student.getAverage());
		
		// 기본 생성자 호출
		ArrayList<String> list = new ArrayList<>();
		
		HashMap<String, String> map = new HashMap<>();
		map.put("admin", "1234");
		map.put("user1", "1111");
		
		//생성자 호출
		ArrayList<String> passwords = new ArrayList<>(map.values()); // 반환 자료형 없다.
		System.out.println(passwords);
		
		/* 
		 * 기본 생성자는 준비가 안되어 있는 케이스
		 * Scanner sc2 = new Scanner();
	     */
		
		
	}

}
