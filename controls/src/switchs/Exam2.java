package switchs;

import java.util.Scanner;

public class Exam2 {

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
		System.out.print("입력 : ");
//		char select = sc.nextInt(); //유니코드로 바꿔준다. 97, 65, 48 이렇게 해도 가능함.
		char select = sc.next().charAt(0);
		
		switch(select) {
			case 'a' :
				System.out.println("case a : " + select); break;
			case 'A' :
				System.out.println("case A : " + select); break;
			case '0' :
				System.out.println("case 0 : " + select); break;
			default : System.out.println("default : a, A, 0이  아니다.");
		
		}
		System.out.println("다음 문장");
		sc.close();
	}

}
