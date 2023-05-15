package dbConcept4.view;

import java.util.Scanner;

import dbConcept4.DAO.MemberDAO;
import dbConcept4.DTO.MemberDTO;

public class MemberView implements IView {
	Scanner in = new Scanner(System.in);

	@Override
	public void mainMenu() {
		
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
			case 1:	insertMember(); break;
			case 2:	selectId(); break;
			case 3:	deleteMember(); break;
			case 4:	selectAll(); break;
			case 5: updateMember(); break;
			case 6: disconnection();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}

	private MemberDAO Dao;
	
	@Override
	public void deleteMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateMember() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insertMember() {
		MemberDTO member = new MemberDTO();
//		MemberDTO memberInfo = null;
		
		System.out.println("=== 회원 등록 ===");
		System.out.print("ID : "); String id = in.next(); member.setId(id);
		System.out.print("PW : "); member.setEmail(in.next());
		System.out.print("이름 : ");	member.setName(in.next());
		System.out.print("이메일 : ");	member.setName(in.next());
		
		MemberDTO memberInfo = Dao.selectId(id);
		
		if(memberInfo != null) {
			System.out.println("이미 가입된 아이디 입니다.");
		}else {
			int isInsert = Dao.insertMember(member); //return의 용도를 잘 모르겠음.
			if(isInsert == 1) {
				System.out.println("가입이 완료되었습니다.");
			}
		}
	}

	@Override
	public void selectId() { //회원 검색
		System.out.println("=== 회원 검색 ===");
		System.out.print("ID : ");
		MemberDTO member = Dao.selectId(in.next());
		
		System.out.println("PW : " + member.getPw());
		System.out.println("이름 : " + member.getName());
		System.out.println("이메일 : " + member.getEmail());
		System.out.println("회원번호 : " + member.getNum());
		
		
	}

	@Override
	public void selectAll() {
		// TODO Auto-generated method stub
		
	}
	
	public void disconnection() {}

}
