package disassemble.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	public MemberRegisterService(MemberDAO memberDao) {
		this.memberDao = memberDao; //main에서 만든 memberDao를 사용하세요. new로 만들지 말고.
	}
	public void regist(RegisterRequest req) { //멤버 등록 
		
		// email로 계정 등록 여부 확인
		String email = req.getEmail();
		MemberDTO info = memberDao.selectEmail(email);
		if(info != null) {
			System.out.println("이미 등록된 이메일 입니다.");
		}else {
			String pw = req.getPassword();
			String confirmPW = req.getConfirmPassword();
			
			// password == confirmPassword
			// memberDao.insert() 계정 등록
			Date nowDate = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
			String strNowDate = simpleDateFormat.format(nowDate);
			
			if(pw.equals(confirmPW)) {
				MemberDTO dto = new MemberDTO();
				dto.setEmail(email);
				dto.setName(req.getName());
				dto.setPassword(pw);
				dto.setRegisterDate(strNowDate); //일단 보류
				memberDao.insert(dto);
				System.out.println("회원 등록되었습니다.");
			}else {
				System.out.println("패스워드를 다시 확인해주세요.");
			}
		}
	}
}
