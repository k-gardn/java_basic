package methodExam;

import java.util.ArrayList;
import java.util.HashMap;

public class Member {
	// 데이터를 관리하는 곳.
	
	// Member는 Arraylist 같은 개념인거지. add, get 등의 기능을 관리하는 곳.
	//아래 HashMap에 데이터 관리의 코드는 Member Class에 작성
	// 데이터 관리 코드: Create(입력), Read(검색, 조회), Update(수정), Delete(삭제)
	
	private HashMap<String, String> passwords = new HashMap<>();
	private HashMap<String, String> names = new HashMap<>();
	
	public void insert(String id, String password, String name) {
		passwords.put(id, password);
		names.put(id, name);
	}

	public MemberDTO select(String id) {
		String p = passwords.get(id);
		String n = names.get(id);
		if(p == null)
			return null;
		
		MemberDTO memberDto = new MemberDTO();
		memberDto.setPassword(p);
		memberDto.setName(n);
		return memberDto;
		
		/*
		 * return p, n; 
		 * 두 개 이상의 반환 데이터
		 * - 같은 자료형일 경우 배열, Collection 또는 DTO와 같은 클래스
		 * - 다른 자료형일 경우 Collection 또는 DTO와 같은 클래스.
		 */
	}
	
	public ArrayList<MemberDTO> selectAll() {
		ArrayList<MemberDTO> members = new ArrayList<>();
		
		for(String id : passwords.keySet()) {
			
			MemberDTO dto = new MemberDTO();
			dto.setId(id);
			dto.setPassword(passwords.get(id));
			dto.setName(names.get(id));
			members.add(dto);
		}
		return members;
	}
	
	public void update() {}
	public void delete(String id) {
		names.remove(id);
		passwords.remove(id);
	}
}
