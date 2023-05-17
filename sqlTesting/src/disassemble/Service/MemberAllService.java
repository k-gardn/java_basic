package disassemble.Service;

import java.util.ArrayList;
import java.util.Collection;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberAllService {
	private MemberDAO memberDao;
	
	public MemberAllService(MemberDAO memberDao){
		this.memberDao = memberDao;
	}
	
	public void selectAll() {
		// MemberDAO 객체 내부 selectAll() 호출 후 회원 모든 정보 출력
		Collection<MemberDTO> members = memberDao.selectAll();
		if(members.isEmpty()) {
			System.out.println("가입한 회원이 존재하지 않습니다.");
		}else {
			System.out.println("===== 전체 회원 조회 =====");
			for(MemberDTO dto : members) {
				System.out.println("Email: " + dto.getEmail());
				System.out.println("Name: " + dto.getName());
				System.out.println("Password: " + dto.getPassword());
				System.out.println("Register Date: " + dto.getRegisterDate());
				System.out.println();
			}
		}
	}

}
