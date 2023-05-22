package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class MemberDeleteService {
	
	private MemberDAO memberDao;
	
	public MemberDeleteService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	
	public void checkPassword(String email, String password, String confirmPassword) {
		// 패스워드 확인
		if(password.equals(confirmPassword)) {
			// MemberDAO 객체 내 selectEmail() 메소드를 호출 
			MemberDTO dto = memberDao.selectEmail(email);
			// 저장된 회원 정보와 입력된 회원 정보 검증
			if(dto == null) {
				System.out.println("존재하지 않는 회원입니다.");
			}else {
				// MemberDAO 객체 내 delete() 호출
				if(dto.getPassword().equals(password)) {
					memberDao.delete(email);
					System.out.println("회원 정보가 삭제되었습니다.");
				}else {
					System.out.println("회원정보의 비밀번호와 일치하지 않습니다.");
				}
			}
		}else {
			System.out.println("패스워드를 다시 확인해주세요.");
		}
	}
}
