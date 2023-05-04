package inheritance8;

import java.util.ArrayList;

public interface IMemberDAO {
	//접근 처리
	public void insert(MemberDTO member);
	public int findIndexByEmail(String email);
	public MemberDTO selectEmail(int index);
	public ArrayList<MemberDTO> selectAll();
	public void update(int index, String name, String mobile);
	public void delete(int index);
}
