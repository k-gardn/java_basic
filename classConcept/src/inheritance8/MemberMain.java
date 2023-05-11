package inheritance8;

import java.util.Scanner;

public class MemberMain {
	// 입력만.
	// MemberMain -> MemberService -> DAO
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", mobile="";
		
		MemberServiceImpl service = new MemberServiceImpl();
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 검색");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			
			switch (select) {
			case 1:
				System.out.println();
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				service.insert(email, name, mobile);
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				service.selectEmail(email);
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				break;
			case 4:	
				service.selectAll();
				break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				System.out.print("이름 : ");	name = in.next();
				System.out.print("전화번호 : "); mobile = in.next();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}

	
}









