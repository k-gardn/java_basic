package switchs;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		String select = sc.next(); // 문자열을 equals를 쓰지 않고 비교할 수 있음.
		
		if(select.equals("1")) {
			System.out.println("case 1 : " + select);
		}else if(select.equals("2")) {
			System.out.println("case 2 : " + select);
		}else if(select.equals("3")) {
			System.out.println("case 3 : " + select);
		}else {
			System.out.println("default : 1, 2, 3이 아닌 수 ");
		}
		System.out.println("다음 문장");
		sc.close();
	}

}
