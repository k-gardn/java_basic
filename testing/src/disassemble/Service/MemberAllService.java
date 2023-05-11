package disassemble.Service;

import java.util.ArrayList;
import java.util.HashMap;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
//		System.out.println("===== 회원 정보 =====");
//		HashMap<String, MemberDTO> members = new HashMap<>();
//		for ( String key :) {
//		    System.out.println("메뉴 : " + key +"\t가격 : " + menu.get(key)+"원");
//		}
		ArrayList<MemberDTO> memberList = new ArrayList<>(memberDao.selectAll());
		if(memberList.size() == 0) {
			System.out.println("회원이 존재하지 않습니다.");
		}else {
			System.out.println("=== 회원정보 ===");
			for(MemberDTO dto : memberList) {
				System.out.println("이메일 : " + dto.getEmail());
				System.out.println("이름 : " + dto.getName());
				System.out.println("비밀번호 : " + dto.getPassword());
				System.out.println("등록 날짜 : " + dto.getRegisterDate());
				System.out.println();
			}
			
		}
	}

}
