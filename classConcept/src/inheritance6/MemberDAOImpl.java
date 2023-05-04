package inheritance6;

import java.util.ArrayList;

public class MemberDAOImpl implements IMemberDAO{
	private ArrayList<String> emails;
	private ArrayList<String> names;
	private ArrayList<String> mobiles;
	
	public MemberDAOImpl() {
		emails = new ArrayList<>();
		names = new ArrayList<>();
		mobiles = new ArrayList<>();
	}
	
	public void insert (String email,String name, String mobile ) {
		if(emails.contains(email)) {
			System.out.println("이미 등록된 이메일 입니다.");
		}else {
			emails.add(email);
			names.add(name);
			mobiles.add(mobile);
			System.out.println("회원이 등록되었습니다.");
		}
	}

	@Override
	public void selectEmail(String email) {
		if(emails.contains(email)) {
			int index = emails.indexOf(email);
			System.out.println("이름 : " + names.get(index));
			System.out.println("전화번호 : " + mobiles.get(index));
		}else {
			System.out.println("존재하지 않는 이메일 입니다.");
		}
	}

	@Override
	public void selectAll() {
		if(emails.size() > 0) {
			for(int i = 0 ; i < emails.size() ; i++) {
				System.out.println("이름: " + names.get(i) +"\t이메일: " + emails.get(i) + "\t전화번호: " + mobiles.get(i));
			}
		}else {
			System.out.println("등록한 회원이 없습니다.");
		}
	}

	@Override
	public void delete(String email) {
		if(emails.contains(email)) {
			int index = emails.indexOf(email);
			emails.remove(index);
			names.remove(index);
			mobiles.remove(index);
			System.out.println("회원정보가 삭제되었습니다.");
		}else {
			System.out.println("존재하지 않는 이메일 입니다.");
		}
		
	}

	@Override
	public void update(String email, String name, String mobile) {
		if(emails.contains(email)) {
			int index = emails.indexOf(email);
			names.set(index, name);
			mobiles.set(index, mobile);
			System.out.println("회원정보가 수정되었습니다.");
		}else {
			System.out.println("존재하지 않는 이메일 입니다.");
		}
		
	}
}
