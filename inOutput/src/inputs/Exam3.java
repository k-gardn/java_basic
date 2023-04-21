package inputs;

import java.util.Scanner;
public class Exam3 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name1 = sc.next();
		String name2 = sc.next();
		System.out.println("성 : " + name1);
		System.out.println("이름 : " + name2);
		
		sc.close();
	}
}
