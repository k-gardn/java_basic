package methodExam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class MemberMain {

	public static void main(String[] args) {
		//데이터 입출력
		
		Scanner sc = new Scanner(System.in);
		/*
		 * HashMap을 사용하여 회원 정보 만들기. HashMap을 두 개 만들어서 구성하기. 
		 * 1.회원등록 : id, password, name 3개의 정보를 등록함. 
		 * 			  id는 Key로 password, name은 value로 사용. 
		 * 2.회원검색 : id를 Key로 사용 중이기에 id를 이용하여 회원 정보를 검색하여 출력함. 
		 * 3.회원삭제 : id를 Key로 사용 중이기에 id를 이용하여 회원 정보를 삭제함. 
		 * 4.회원 모두 보기 : 모든 정보 출력함. 
		 * 5.비밀번호 수정 : id를 Key로 사용 중이기에 id를 이용하여 비밀번호를 수정함. 
		 * 6.프로그램 종료 : 프로그램을 종료함.
		 */
		Member member = new Member();
		String id = "", name = "", password = "";
		MemberDTO memberDto;
		
		while(true) {
			System.out.println("1. 회원등록");
			System.out.println("2. 회원검색");
			System.out.println("3. 회원삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print(">> ");
			String select = sc.next();
			
			switch(select) {
			case "1": 
				System.out.print("아이디 : "); id = sc.next();
				memberDto = member.select(id); //데이터 조회해줘.
				
				if(memberDto == null) { //아이디가 없으면 등록시작.
					System.out.print("비밀번호 : "); password = sc.next();
					System.out.print("이름 : "); name = sc.next();
					member.insert(id, password, name);
					System.out.println(id + " 계정 등록 완료");
				}else {
					System.out.println("등록된 아이디입니다.");
				}
				break;
			case "2": 
				System.out.print("아이디 : "); id = sc.next();
				memberDto = member.select(id);
				
				if(memberDto == null) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					System.out.println("## 회원 검색 결과 ##");
					System.out.println("아이디 : " + id);
					System.out.println("비밀번호 : " + memberDto.getPassword());
					System.out.println("이름 : " + memberDto.getName());
				}
				System.out.println();
				break;
			case "3": 
				System.out.print("아이디 : "); id = sc.next();
				System.out.print("현재 비밀번호 : "); password = sc.next();
				memberDto = member.select(id);
				
				if(memberDto == null) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					if(memberDto.getPassword().equals(password)) {
						System.out.println(id + " 계정 정보 삭제 완료");
						member.delete(id);
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
				System.out.println();
				break;
			case "4": 
				ArrayList<MemberDTO> members = member.selectAll();
				
				if(members.isEmpty()) {
					System.out.println("등록 후 이용하세요.");
				}else {
					for(MemberDTO dto : members) {
						System.out.println("아이디 : " + dto.getId());
						System.out.println("비밀번호 : " + dto.getPassword());
						System.out.println("이름 : " + dto.getName());
						System.out.println();
					}
				}
				break;
//			case "5": 
//				System.out.print("아이디 : "); id = sc.next();
//				if(members.containsKey(id) == false) {
//					System.out.println("등록되지 않은 아이디입니다.");
//				}else {
//					System.out.print("새로운 비밀번호 : ");
//					DTO dto = members.get(id);
//					dto.setPw(sc.next());
//					members.put(id, dto);
//					System.out.println("비밀번호가 수정되었습니다.");
//				}
//				System.out.println();
//				break;
			case "6" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default : System.out.println("메뉴를 확인하세요.");
			}
		}
	}

}
