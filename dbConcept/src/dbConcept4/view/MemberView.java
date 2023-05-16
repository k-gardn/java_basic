package dbConcept4.view;

import java.util.ArrayList;
import java.util.Scanner;

import dbConcept4.DAO.MemberDAO;
import dbConcept4.DTO.MemberDTO;

public class MemberView implements IView {
	Scanner in = new Scanner(System.in);

	@Override
	public void mainMenu() {

		while (true) {
			System.out.println("1. 회원 전체 정보 출력");
			System.out.println("2. 회원 정보 조회");
			System.out.println("3. 회원 정보 입력");
			System.out.println("4. 회원 정보 변경");
			System.out.println("5. 회원 정보 삭제");
			System.out.println("0. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			switch (select) {
			case 1:	selectAll(); break;
			case 2:	selectId(); break;
			case 3:	insertMember(); break;
			case 4:	updateMember(); break;
			case 5: deleteMember(); break;
			case 0: disconnection();
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
		}
	}
	
	//하나의 DAO를 사용해야함!!!! 공유해야함!!..
	private MemberDAO Dao = new MemberDAO();
	
	private MemberDTO memberInfo = new MemberDTO();
	
	@Override
	public void deleteMember() {
		System.out.println("=== 회원 정보 삭제 ===");
		System.out.print("ID : "); String id = in.next();
		int result = Dao.deleteMember(id);
		if(result == 1 ) {
			System.out.println("회원이 삭제되었습니다.");
		}else {
			System.out.println("회원이 삭제되지 않았습니다.");
		}
	}

	@Override
	public void updateMember() {
		System.out.println("=== 회원 정보 수정 ===");
		System.out.print("ID : "); String id = in.next();
		memberInfo = Dao.selectId(id);
		if(memberInfo == null) {
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			
			System.out.print("PW : "); memberInfo.setPw(in.next());
			System.out.print("이름 : ");	memberInfo.setName(in.next());
			System.out.print("이메일 : ");	memberInfo.setEmail(in.next());
			int result = Dao.updateMember(memberInfo);
			if(result == 1) {
				System.out.println("회원 정보가 수정되었습니다.");
			}
		}
	}

	@Override
	public void insertMember() {
//		MemberDTO memberInfo = null;
		
		System.out.println("=== 회원 등록 ===");
		System.out.print("ID : "); String id = in.next();
		memberInfo = Dao.selectId(id);
		if(memberInfo == null) {
			MemberDTO member = new MemberDTO();
			System.out.print("PW : "); member.setPw(in.next());
			System.out.print("이름 : ");	member.setName(in.next());
			System.out.print("이메일 : ");	member.setEmail(in.next());
			member.setId(id);
			int isInsert = Dao.insertMember(member); //return의 용도를 잘 모르겠음.
			if(isInsert == 1) {
				System.out.println("가입이 완료되었습니다.");
			}
		}else {
			System.out.println("이미 가입된 아이디 입니다.");
		}
	}

	@Override
	public void selectId() { //회원 검색
		System.out.println("=== 회원 검색 ===");
		System.out.print("ID : ");
		MemberDTO memberInfo = Dao.selectId(in.next());
		if(memberInfo == null) {
			System.out.println("존재하지 않는 아이디입니다.");
		}else {
			
			System.out.println("PW : " + memberInfo.getPw());
			System.out.println("이름 : " + memberInfo.getName());
			System.out.println("이메일 : " + memberInfo.getEmail());
			System.out.println("회원번호 : " + memberInfo.getNum());
			System.out.println();
		}
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> members = Dao.selectAll();
		for(MemberDTO dto: members) {
			System.out.println("아이디 : " + dto.getId());
			System.out.println("비밀 번호 : " + dto.getPw());
			System.out.println("이름 : " + dto.getName());
			System.out.println("이메일 : " + dto.getEmail());
			System.out.println("회원번호 : " + dto.getNum());
			System.out.println("-------------------------");
		}
	}
	
	public void disconnection() {
		Dao.disconnection();
		System.out.println("프로그램을 종료합니다.");
	}

}
