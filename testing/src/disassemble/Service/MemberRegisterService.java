package disassemble.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

import disassemble.DAO.MemberDAO;
import disassemble.DTO.MemberDTO;
import disassemble.DTO.RegisterRequest;

public class MemberRegisterService {
	private MemberDAO memberDao;
	
	// memberDao 안에 hashmap이 있는데 이걸 항상 새롭게 만들면 서로 다른 hashmap이 생성된다.
	// 각 서비스에서 같은 memberDao를 쓸 수 있도록 한다.
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
			// password == confirmPassword
			String pw = req.getPassword();
			String confirmPW = req.getConfirmPassword();
			
			// memberDao.insert() 계정 등록
			
			if(pw.equals(confirmPW)) {
				Date nowDate = new Date();
				SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd 'T'HH:mm:ss");
				String strNowDate = simpleDateFormat.format(nowDate);
				
				MemberDTO dto = new MemberDTO();
				
				dto.setEmail(email);
				dto.setName(req.getName());
				dto.setPassword(pw);
				dto.setRegisterDate(strNowDate); 
				
				memberDao.insert(dto);
				
				System.out.println("회원 등록되었습니다.");
			}else {
				System.out.println("패스워드를 다시 확인해주세요.");
			}
		}
	}
}
