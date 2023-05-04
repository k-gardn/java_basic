package inheritance9;

import java.util.ArrayList;

public class DAO {
	
	ArrayList<DTO> memberList ;
	
	public DAO() {
		memberList = new ArrayList<DTO>();
	}
	
	public int indexOf(String id) {
		for(DTO member : memberList) {
			if(member.getId().equals(id)) {
				return memberList.indexOf(member);
			}
		}
		return -1;
	}
	
	public void add(DTO member) {
		memberList.add(member);
	}
	
	public DTO get(int index) {
		return memberList.get(index);
	}
	
	public void remove(int index) {
		memberList.remove(index);
	}
	
	public ArrayList<DTO> getAll(){
		return memberList;
	}
	
	public void set(int index, DTO member) {
		memberList.set(index, member);
	}
	
}
