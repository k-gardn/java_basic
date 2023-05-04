package inheritance7;

import java.util.ArrayList;

public class MemberDaoImpl implements IMemberDAO{
	private ArrayList<MemberDTO> members;
	
	public MemberDaoImpl() {
		members = new ArrayList<>();
	}

	@Override
	public void insert(MemberDTO member) {
		members.add(member);
	}

	@Override
	public int findIndexByEmail(String email) {
		int index = -1; //없으면 -1, 있으면 찾은 index
		for(MemberDTO dto : members) {
			if(dto.getEmail().equals(email)) {
				index = members.indexOf(dto);
			}
		}
		return index;
	}

	@Override
	public MemberDTO selectEmail(int index) {
		return members.get(index);
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		//참조값을 반환하기 때문에 부하가 없다. 
		//ArrayList의 크기에 따라 바뀌는 것이 아님.
		return members; 
	}

	@Override
	public void update(int index, String name, String mobile) {
		MemberDTO dto = members.get(index);
//		MemberDTO dto2 = selectEmail(index); // 만든 메서드 사용해도됨.
		dto.setName(name);
		dto.setMobile(mobile);
		members.set(index, dto);
	}

	@Override
	public void delete(int index) {
		members.remove(index);
	}

	
	
}










