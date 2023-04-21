package switchs;

import java.util.Scanner;

public class Quiz {
	// 1. 우리집 등록.2. 회사 등록. 3. 등록보기
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String home = "";
		String company = "";
		boolean stop = true;
		
		while (stop) {
			System.out.println("1. 우리집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			System.out.println("4. 종료하기");
			System.out.print(">>> ");
			int select = input.nextInt();
			
			switch (select) {
			case 1:
				System.out.print("우리집 입력 : ");
				home = input.next();
				break;
			case 2:
				System.out.print("회사 입력 : ");
				company = input.next();
				break;
			case 3:
				System.out.println("우리집 : " + home);
				System.out.println("회사 : " + company);
				break;
			case 4:
				System.out.println("프로그램 종료합니다.");
				stop = false;
				break;
//			    System.exit(0); //while문을 나가는 방법.
			default:
				System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
		}//while
		input.close();
	}
}



