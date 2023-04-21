package inputs;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		
		// 자료형 변수명
//		Scanner sc; //Class 자료형 변수명.
		// sc는 참조 변수.(= 참조값을 저장하는 변수)
		
		/*
		 * new : 클래스를 실행해줘. 클래스(class)가 실행된 상태를 인스턴스(instance)라고 함. 
		 * 클래스(=Scanner): 건물의 설계도 , 인스턴스(=sc) : 설계도로 만들어진 건물.
		 * 클래스: 파일, 인스턴스: 실행한 상태
		 */
		//	System = 운영체제(=OS = operator system ex]windows, mac, linux)
		//	System.in : 운영체제 입력(= 키보드, 마우스)
		
//		sc = new Scanner(System.in); 
		//sc에 참조값을 넣어준다. 
		//주소가 있기 때문에 주소를 찾아가서 Scanner라는 class의 다양한 기능을 사용할 수 있게된다. ex) sc.기능들
		
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("문자열 : ");
		sc.next(); //"김변수"
		
		sc.nextLine();
		System.out.println("문자열 : ");
		sc.nextLine(); //"김 변수"
		
		System.out.println("정수 : ");
		sc.nextInt();
		sc.nextInt(); // 2개의 정수를 한번에 입력 받을 수 있음.
		
		System.out.println("실수 : ");
		sc.nextDouble();
		
		sc.close();
		
	}
}
