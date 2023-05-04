package inheritance7;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberMain {
	// 입력, 출력 받을 예정.
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String email = "", name="", mobile="";
		int index;
		MemberDaoImpl memberDao = new MemberDaoImpl();
		MemberDTO member;
		
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
				
				// 이메일 존재 여부 판단.
				index = memberDao.findIndexByEmail(email);
				if(index == -1) {
					System.out.print("이름 : ");	name = in.next();
					System.out.print("전화번호 : "); mobile = in.next();
					
					member = new MemberDTO();
					
					member.setEmail(email);
					member.setName(name);
					member.setMobile(mobile);
					
					memberDao.insert(member);
					System.out.println(email + " 님이 등록되었습니다.");
				}else {
					System.out.println("이미 존재하는 회원입니다.");
				}
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : "); email = in.next();
				index = memberDao.findIndexByEmail(email);
				
				if(index == -1) {
					System.out.println("존재하지 않는 회원입니다.");
				}else {
					member = memberDao.selectEmail(index);
					System.out.print("이메일 : " + member.getEmail() + "\t");
					System.out.print("이름 : " + member.getName() + "\t");
					System.out.print("전화번호 : " + member.getMobile() + "\t");
					System.out.println();
				}
				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : "); email = in.next();
				index = memberDao.findIndexByEmail(email);
				
				if(index == -1) {
					System.out.println("존재하지 않는 회원입니다.");
				}else {
					memberDao.delete(index);
					System.out.println(email + "님의 정보가 삭제되었습니다.");
				}
				break;
			case 4:	
				ArrayList<MemberDTO> list = memberDao.selectAll();
				
				if(list.isEmpty()) {
					System.out.println("등록된 회원이 없습니다.");
				}else {
					for(MemberDTO dto : list) {
						System.out.print("이메일 : " + dto.getEmail() + "\t");
						System.out.print("이름 : " + dto.getName() + "\t");
						System.out.print("전화번호 : " + dto.getMobile() + "\t");
						System.out.println();
					}
				}
				break;
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); email = in.next();
				index = memberDao.findIndexByEmail(email);
				
				if(index == -1) {
					System.out.println("존재하지 않는 회원입니다.");
				}else {
					System.out.print("이름 : ");	name = in.next();
					System.out.print("전화번호 : "); mobile = in.next();
					
					memberDao.update(index, name, mobile);
					System.out.println("수정이 완료되었습니다.");
				}
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









