package disassemble.Service;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;

public class ChangePasswordService {
	private MemberDAO memberDao;
	
	public ChangePasswordService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}

	public void changePassword(String email, String oldPw, String newPw) {
		// 이메일 등록여부 확인.
		MemberDTO dto = memberDao.selectEmail(email);
		if(dto == null) {
			System.out.println("등록되지 않은 이메일입니다.");
		}else {
			// 패스워드 확인 및 MemberDAO.update() 호출 
			if(oldPw.equals(dto.getPassword())) {
				dto.setPassword(newPw);
				memberDao.update(dto);
				System.out.println("비밀번호가 수정되었습니다.");
			}else {
				System.out.println("회원정보의 비밀번호와 일치하지 않습니다.");
			}
		}
	}

}
