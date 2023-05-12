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
				System.out.println("등록되어있지 않은 이메일 입니다.");
			}else {
				// MemberDAO 객체 내 delete() 호출
				if(password.equals(dto.getPassword())) {
					memberDao.delete(email);
					System.out.println("회원 정보가 삭제되었습니다.");
				}else {
					System.out.println("등록된 비밀번호와 다르게 입력하셨습니다.");
				}
			}
		}else {
			System.out.println("패스워드 확인이 잘못되었습니다.");
		}
	}
}
