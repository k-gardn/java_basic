package loopWhile;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = "";
		boolean stop = true;
		String id = "", pw = "";
		String inputId = "", inputPw = "";
		
		while (stop) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("3. 나가기");
			System.out.print(">>> ");
			int select = input.nextInt();
			
			
			switch (select) {
			case 1:
				System.out.print("저장할 아이디 입력 : ");
				id = input.next();
				System.out.print("저장할 비밀번호 입력 : ");
				pw = input.next();
				break;
			case 2:
				System.out.print("아이디 입력 : ");
				inputId = input.next();
				System.out.print("비밀번호 입력 : ");
				inputPw = input.next();
				if(inputId.equals(id) && inputPw.equals(pw)) {
					System.out.println("인증 성공 !!!");
					input.nextLine();
//					System.exit(0);
				}
				else {
					System.out.println("인증 실패 !!!");
					input.nextLine();
				}
				break;
			case 3:
				System.out.println("프로그램 종료합니다.");
			    System.exit(0); //while문을 나가는 방법.
//				stop = false;
//				break;
			default:
				System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
			
			
			System.out.println("id : " + id);
			System.out.println("inputId : "+ inputId);
		}//while
		input.close();
		
		
		 
	}

}
