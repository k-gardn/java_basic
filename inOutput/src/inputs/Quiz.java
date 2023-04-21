package inputs;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까 ? ");
		String name = sc.next();
		
		System.out.print(name + "님의 국어 점수 : ");
		int korean = sc.nextInt();
		
		System.out.print(name + "님의 영어 점수 : ");
		int english = sc.nextInt();
		
		System.out.print(name + "님의 수학 점수 : ");
		int math = sc.nextInt();
		
//		int total = korean + english + math;
		
		System.out.println("=======================");
		System.out.println("이 름  : " + name);
		System.out.println("=======================");
		System.out.println("국 어  : " + korean);
		System.out.println("영 어  : " + english);
		System.out.println("수 학  : " + math);
		System.out.println("=======================");
		System.out.println("합 계  : " + (korean + english + math));
//		System.out.println("합 계  : " + total);
		System.out.println("=======================");
		
		sc.close(); //
		
	}
}
