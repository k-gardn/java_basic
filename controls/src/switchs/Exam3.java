package switchs;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * switch(정수 또는 문자열) {
		 *  case ? : 실행할 문장; 실행할 문장; break; 
		 *  case ? : 실행할 문장; 실행할 문장; break; 
		 *  default : 실행할 문장; 실행할 문장; break; 
		 *  }
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		String select = sc.next(); // 문자열을 equals를 쓰지 않고 비교할 수 있음.
		switch(select) {
			case "1" :
				System.out.println("case 1 : " + select); break;
			case "2" :
				System.out.println("case 2 : " + select); break;
			case "3" :
				System.out.println("case 3 : " + select); break;
			default : System.out.println("default : 1, 2, 3이  아니다.");
		
		}
		System.out.println("다음 문장");
		sc.close();
	}

}
