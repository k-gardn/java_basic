package inheritance9;

import java.util.ArrayList;


public class Service {
	DAO dao ;
	DTO member;
	int index;
	
	public Service() {
		dao = new DAO();
	}
	
	public void insert(String id, String name, String password) {
		index = dao.indexOf(id);
		
		if(index == -1) {
			
			member = new DTO(); // 새로 추가할 때 필요함.
			
			member.setId(id);
			member.setPassword(password);
			member.setName(name);
			
			dao.add(member);
			
			System.out.println(id + " 계정 등록 완료");
		}else {
			System.out.println("등록된 아이디입니다.");
		}
	}
	
	public void searchId(String id) {
		index = dao.indexOf(id); //데이터 조회해줘
		
		if(index == -1) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			member = dao.get(index);
			System.out.println("## 회원 검색 결과 ##");
			System.out.println("아이디 : " + member.getId());
			System.out.println("비밀번호 : " + member.getPassword());
			System.out.println("이름 : " + member.getName());
		}
		System.out.println();
	}
	
	public void remove(String id) {
		index = dao.indexOf(id); //데이터 조회해줘
		
		if(index == -1) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			dao.remove(index);
			System.out.println(id + " 계정 정보 삭제 완료");
		}
		System.out.println();
	}
	
	public void showAll() {
		ArrayList<DTO> list = dao.getAll(); 
		
		if(list.isEmpty()) {
			System.out.println("등록 후 이용하세요.");
		}else {
			for(DTO dto : list) {
				System.out.println("아이디 : " + dto.getId());
				System.out.println("이름 : " + dto.getName());
				System.out.println("비밀번호 : " + dto.getPassword());
				System.out.println();
			}
			
		}
	}
	
	public void update(String id, String name, String password) {
		index = dao.indexOf(id);
		
		if(index == -1) {
			System.out.println("등록되지 않은 아이디입니다.");
		}else {
			member = dao.get(index);
			member.setName(name);
			member.setPassword(password);
				
			dao.set(index, member);
			System.out.println("회원 정보가 수정되었습니다.");
		}
		System.out.println();
	}
}
