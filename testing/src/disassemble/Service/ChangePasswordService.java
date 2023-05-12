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
			System.out.println("등록되어있지 않은 이메일 입니다.");
		}else {
			// 패스워드 확인 및 MemberDAO.update() 호출 
			String currentPW = dto.getPassword(); //등록되어있는 비밀번호
			if(currentPW.equals(oldPw)) {
				dto.setPassword(newPw);
				memberDao.update(dto);
				System.out.println(dto.getName() +" 님의 비밀번호가 변경되었습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
	}
}
