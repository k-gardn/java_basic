package inheritance8;

import java.util.ArrayList;

public class MemberServiceImpl implements IMemberService{
	private MemberDaoImpl memberDao;
	
	int index;
	MemberDTO member;
	
	public MemberServiceImpl() {
		memberDao = new MemberDaoImpl();
	}

	@Override
	public void insert(String email, String name, String mobile) {
		// 이메일 존재 여부 판단.
		index = memberDao.findIndexByEmail(email);
		if(index == -1) {
			member = new MemberDTO();
			
			member.setEmail(email);
			member.setName(name);
			member.setMobile(mobile);
			
			memberDao.insert(member);
			System.out.println(email + " 님이 등록되었습니다.");
		}else {
			System.out.println("이미 존재하는 회원입니다.");
		}
	}

	@Override
	public void selectEmail(String email) {
		index = memberDao.findIndexByEmail(email);
		
		if(index == -1) {
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			member = memberDao.selectEmail(index);
			System.out.print("이메일 : " + member.getEmail() + "\t");
			System.out.print("이름 : " + member.getName() + "\t");
			System.out.print("전화번호 : " + member.getMobile() + "\t");
			System.out.println();
		}
	}

	@Override
	public void selectAll() {
		ArrayList<MemberDTO> list = memberDao.selectAll();
		
		if(list.isEmpty()) {
			System.out.println("등록된 회원이 없습니다.");
		}else {
			for(MemberDTO dto : list) {
				System.out.print("이메일 : " + dto.getEmail() + "\t");
				System.out.print("이름 : " + dto.getName() + "\t");
				System.out.print("전화번호 : " + dto.getMobile() + "\t");
				System.out.println();
			}
		}
	}

	@Override
	public void update(String email, String name, String mobile) {
		index = memberDao.findIndexByEmail(email);
		
		if(index == -1) {
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			
			
			memberDao.update(index, name, mobile);
			System.out.println("수정이 완료되었습니다.");
		}
	}

	@Override
	public void delete(String email) {
		index = memberDao.findIndexByEmail(email);
		
		if(index == -1) {
			System.out.println("존재하지 않는 회원입니다.");
		}else {
			memberDao.delete(index);
			System.out.println(email + "님의 정보가 삭제되었습니다.");
		}
	}

	
	
}










