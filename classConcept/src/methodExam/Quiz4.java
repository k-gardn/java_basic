package methodExam;

import java.util.ArrayList;
import java.util.Scanner;


public class Quiz4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * ArrayList를 사용하여 회원 정보 만들기. 
		 * 1.회원등록 : id, password, name 3개의 정보를 등록함. 
		 * 2.회원검색 : id로 회원 정보를 검색하여 출력함.
		 * 3.회원삭제 : id로 회원 정보를 검색하여 삭제함.
		 * 4.회원 모두 보기 : 모든 정보 출력함. 
		 * 5.비밀번호 수정 : id를 Key로 사용 중이기에 id를 이용하여 비밀번호를 수정함. 
		 * 6.프로그램 종료 : 프로그램을 종료함.
		 */
		QuizDAO4 memberDao = new QuizDAO4();
		String id = "", name = "", password = "";
		int index;
		QuizDTO4 memberDto;
		
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
				index = memberDao.indexOf(id);
				
				if(index == -1) {
					System.out.print("비밀번호 : "); password = sc.next();
					System.out.print("이름 : "); name = sc.next();
					
					memberDto = new QuizDTO4(); // 새로 추가할 때 필요함.
					
					memberDto.setId(id);
					memberDto.setPassword(password);
					memberDto.setName(name);
					
					memberDao.add(memberDto);
					
					System.out.println(id + " 계정 등록 완료");
				}else {
					System.out.println("등록된 아이디입니다.");
				}
				break;
				
			case "2": //회원 검색
				System.out.print("아이디 : "); id = sc.next();
				index = memberDao.indexOf(id); //데이터 조회해줘
				
				if(index == -1) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					memberDto = memberDao.get(index);
					System.out.println("## 회원 검색 결과 ##");
					System.out.println("아이디 : " + memberDto.getId());
					System.out.println("비밀번호 : " + memberDto.getPassword());
					System.out.println("이름 : " + memberDto.getName());
				}
				System.out.println();
				break;
			case "3": 
				System.out.print("아이디 : "); id = sc.next();
				index = memberDao.indexOf(id); //데이터 조회해줘
				
				if(index == -1) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					memberDao.remove(index);
					System.out.println(id + " 계정 정보 삭제 완료");
				}
				System.out.println();
				break;
			case "4": 
				ArrayList<QuizDTO4> list = memberDao.getAll(); 
				
				if(list.isEmpty()) {
					System.out.println("등록 후 이용하세요.");
				}else {
					for(QuizDTO4 dto : list) {
						System.out.println("아이디 : " + dto.getId());
						System.out.println("비밀번호 : " + dto.getPassword());
						System.out.println("이름 : " + dto.getName());
						System.out.println();
					}
					
				}
				break;
			case "5": 
				System.out.print("아이디 : "); id = sc.next();
				index = memberDao.indexOf(id);
				
				if(index == -1) {
					System.out.println("등록되지 않은 아이디입니다.");
				}else {
					memberDto = memberDao.get(index);
					System.out.print("현재 비밀번호 : "); password = sc.next();
					if(memberDto.getPassword().equals(password)) {
						System.out.print("새로운 비밀번호 : ");
						memberDto.setPassword(sc.next());
						
						memberDao.set(index, memberDto);
					}else {
						System.out.println("비밀번호가 수정되었습니다.");
					}
				}
				System.out.println();
				break;
			case "6" : System.out.println("프로그램을 종료합니다."); System.exit(0);
			default : System.out.println("메뉴를 확인하세요.");
			}
		}

	}

}
