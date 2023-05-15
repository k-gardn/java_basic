package dbConcept3;


import java.util.ArrayList;

public class MemberServiceImpl implements IMemberService {
	/*
	 * 입력 값 전달받아 검증하기. 
	 * DAO로 CRUD를 하기 위한 데이터를 전달 결과를 받을게 있다면 받아서 결과 출력,
	 * 결과를 받을게 없고 출력이 있으면 결과 출력
	 */
	private MemberDAOImpl Dao ;

	public MemberServiceImpl() {
		Dao = new MemberDAOImpl();
	}
	
	@Override
	public void insert(MemberDTO member) {
		int isMember = Dao.isExists(member.getEmail());
		if(isMember == 1) {
			System.out.println("이미 등록된 회원입니다.");
		}else {
			Dao.insert(member);
			System.out.println("회원정보가 등록되었습니다.");
		}
	}

	@Override
	public void selectEmail(String email) { //회원 검색
		int isMember = Dao.isExists(email);
		if(isMember == 1) {
			MemberDTO dto = Dao.selectEmail(email);
			System.out.println("이메일 : " + dto.getEmail());
			System.out.println("이름 : " + dto.getName());
			System.out.println("전화번호 : " + dto.getMobile());
		}else {
			System.out.println("등록된 이메일이 아닙니다.");
		}
	}

	@Override
	public void delete(String email) { //회원 삭제
		int result = Dao.delete(email);
		if (result == 1) {
			System.out.println("회원정보 삭제되었습니다.");
		} else {
			System.out.println("등록되지 않은 회원 입니다.");
		}
	}

	@Override
	public void selectAll() { // 전체 조회
		ArrayList<MemberDTO> members = Dao.selectAll();
		for(MemberDTO dto : members) {
			System.out.println("이메일 : " + dto.getEmail());
			System.out.println("이름 : " + dto.getName());
			System.out.println("전화번호 : " + dto.getMobile());
			System.out.println();
		}
	}

	@Override
	public void update(String email, String name, String mobile) { //회원 수정
		MemberDTO dto = new MemberDTO();
		dto.setEmail(email);
		dto.setName(name);
		dto.setMobile(mobile);
		int isMember = Dao.isExists(email);
		if(isMember == 0) {
			System.out.println("존재하지 않는 이메일입니다.");
		}else {
			Dao.update(dto);
			System.out.println("회원정보가 수정되었습니다.");
		}
	}

	@Override
	public void disconnection() {
		Dao.disconnection();
		System.out.println("프로그램을 종료합니다.");
	}
}
