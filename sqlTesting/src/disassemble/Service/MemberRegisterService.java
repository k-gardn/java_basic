package disassemble.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao;
	}
	public void regist(RegisterRequest req) {
		
		// password == confirmPassword
		if(req.getPassword().equals(req.getConfirmPassword())) {
			
			// email로 계정 등록 여부 확인
			MemberDTO memberDto = memberDao.selectEmail(req.getEmail());
			
			if(memberDto != null) {
				System.out.println("이미 등록된 이메일입니다.");
			}else {
				// memberDao.insert() 계정 등록
				MemberDTO dto = new MemberDTO();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String nowDate = sdf.format(new Date());
				
				dto.setEmail(req.getEmail());
				dto.setPassword(req.getPassword());
				dto.setName(req.getName());
				dto.setRegisterDate(nowDate);
				
				memberDao.insert(dto);
				System.out.println("등록이 완료되었습니다.");
			}
		}else {
			System.out.println("패스워드를 다시 확인해주세요.");
			return;
		}
	}

}
