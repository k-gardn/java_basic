package maps;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * HashMap을 사용하여 회원 정보 만들기. HashMap을 두 개 만들어서 구성하기. 
		 * 1.회원등록 : id, password, name 3개의 정보를 등록함. 
		 * 			  id는 Key로 password, name은 value로 사용. // 중복 검사.
		 * 2.회원검색 : id를 Key로 사용 중이기에 id를 이용하여 회원 정보를 검색하여 출력함. 
		 * 3.회원삭제 : id를 Key로 사용 중이기에 id를 이용하여 회원 정보를 삭제함. 
		 * 4.회원 모두 보기 : 모든 정보 출력함. 
		 * 5.비밀번호 수정 : id를 Key로 사용 중이기에 id를 이용하여 비밀번호를 수정함. 
		 * 6.프로그램 종료 : 프로그램을 종료함.
		 */
		
		HashMap<String, String> name = new HashMap<>();
		HashMap<String, String> password = new HashMap<>();
		
		int select;
		String id, pw, nick;
		
		while(true) {
			System.out.println("1. 회원등록");
			System.out.println("2. 회원검색");
			System.out.println("3. 회원삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 비밀번호 수정");
			System.out.println("6. 프로그램 종료");
			
			while(true) {
				System.out.println("숫자를 입력해주세요.");
				try {
					select = sc.nextInt();
				} catch (Exception e) {
					continue;
				}
				if(select < 1 || select > 6) {
					System.out.println("숫자를 잘 못 입력하셨습니다.");
					continue;
				}
				break;
			}
			
			switch (select) {
			case 1:
				System.out.println("등록할 아이디를 입력해주세요.");
				id = sc.next();
				while(true) {
					if(name.containsKey(id)) {
						System.out.println("이미 등록된 아이디 입니다. 다시 입력해주세요.");
						continue;
					}else {
						System.out.println("사용가능한 아이디 입니다.");
						break;
					}
				}
				System.out.println("이름을 입력해주세요.");
				nick = sc.next();
				name.put(id, nick);
				System.out.println("패스워드를 입력해주세요.");
				pw = sc.next();
				password.put(id, pw);
				break;
			case 2: // 회원 검색.
				while(true) {
					System.out.println("검색할 아이디를 입력해주세요.");
					System.out.println("아이디 : ");
					id = sc.next();
					if(!name.containsKey(id)) {
						System.out.println("존재하지 않는 아이디 입니다. ");
						sc.nextLine();
						continue;
					}else {
						System.out.println("이름 : " + name.get(id) + "\t패스워드 : " + password.get(id));
						break;
					}
				}
				
				break;
			case 3: //회원 삭제.
				
				while(true) {
					System.out.println("삭제할 회원의 아이디를 입력해주세요.");
					id = sc.next();
					System.out.print("아이디 : ");
					if(!name.containsKey(id)) {
						System.out.println("존재하지 않는 아이디 입니다. 다시 입력해주세요.");
						sc.nextLine();
						continue;
					}else {
						name.remove(id);
						password.remove(id);
						System.out.println(id + "님의 정보가 삭제되었습니다.");
						break;
					}
				}
				break;
			case 4: // 회원 정보 모두 보기.
				if(name.isEmpty()) {
					System.out.println("존재하는 회원이 없습니다.");
				}else {
					for ( String searchId : name.keySet() ) {
						System.out.println("아이디 : " + searchId + "\t이름 : " + name.get(searchId) + "\t패스워드 : " + password.get(searchId) );
					}
				}
				break;
			case 5: // 비밀번호 수정.
				while(true) {
					System.out.println("수정할 아이디를 입력해주세요.");
					id = sc.next();
					sc.nextLine();
					if(!name.containsKey(id)) {
						System.out.println("존재하지 않는 아이디 입니다.");
						continue;
					}else {
						System.out.println("새로운 비밀 번호를 입력해주세요.");
						pw = sc.next();
						password.put(id, pw);
						System.out.println("비밀번호가 변경되었습니다.");
						break;
					}
				}
				break;
			case 6:
				System.out.println("프로그램이 종료되었습니다.");
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}







