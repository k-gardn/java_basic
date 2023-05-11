package disassemble.DAO;

import java.util.Collection;
import java.util.HashMap;

import disassemble.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO{
	
	//해쉬맵 만들기 
	//키 : 이메일
	HashMap<String, MemberDTO> members = new HashMap<>();
	
	@Override
	public Collection<MemberDTO> selectAll() {
//		ArrayList<MemberDTO> memberList = new ArrayList<>(members.values());
		return members.values();
	}

	@Override
	public MemberDTO selectEmail(String email) {
		return members.get(email);
	}

	@Override
	public void insert(MemberDTO member) {
		members.put(member.getEmail(), member);
	}

	@Override
	public void update(MemberDTO member) {
		members.put(member.getEmail(), member);
		
	}

	@Override
	public void delete(String email) {
		members.remove(email);
	}

}
