package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * 회원 등록 : 이름(중복 허용), 전화번호(중복 허용), 이메일(중복 허용 안됨) 
		 * 회원 확인 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 / 없으면 없음 출력 
		 * 회원 삭제 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 삭제 / 없으면 없음 출력 
		 * 회원 수정 : 이메일로 검색하여 있으면 이름과 전화번호 수정 / 없으면 없음 출력
		 */
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> phone = new ArrayList<>();
		ArrayList<String> email = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		
		int select, inputNum;
		String inputName, inputEmail;
		
		while(true) {
			
			if(email.isEmpty()) {
				System.out.println("1. 회원 등록");
			}
			else {
				System.out.println("1. 회원 등록");
				System.out.println("2. 회원 확인");
				System.out.println("3. 회원 삭제");
				System.out.println("4. 회원 모두 보기");
				System.out.println("5. 회원 수정");
				System.out.println("6. 프로그램 종료");
				System.out.print("선택 > ");
			}
			
			while(true) {
				try {
					select = input.nextInt();
				} catch (Exception e) {
					System.out.println("숫자를 입력해주세요.");
					continue;
				}
				break;
			}
			
			switch (select) {
			case 1:{
				while(true) {
					try {
						System.out.println("이름을 입력해주세요.");
						inputName =  input.next();
						System.out.println("전화번호를 입력해주세요.");
						inputNum =  input.nextInt();
						System.out.println("이메일을 입력해주세요.");
						inputEmail =  input.next();
					} catch (Exception e) {
						input.nextLine();
						continue;
					}
					break;
				}
				
				// 중복 검사.
				if(email.contains(inputEmail)) { // indexOf가 -1이면 없는 것.
					System.out.println("중복된 이메일 입니다.");
				}
				else {
					email.add(inputEmail);
					phone.add(email.indexOf(inputEmail), inputNum);
					name.add(email.indexOf(inputEmail), inputName);
				}
//				System.out.println("email" + email);
//				System.out.println("phone" + phone);
//				System.out.println("name" + name);
				
			}
				break;
			case 2:
				System.out.println("이메일을 입력해주세요.");
				inputEmail =  input.next();
				int emailIdx = email.indexOf(inputEmail);
				
				if(email.contains(inputEmail)) {
					System.out.println("이름 : " + name.get(emailIdx)); 
					System.out.println("번호 : " + phone.get(emailIdx)); 
					System.out.println("이메일 : " + email.get(emailIdx)); 
				}
				else {
					System.out.println("등록된 이메일이 아닙니다.");
				}
				break;
			case 3:
				System.out.println("삭제할 이메일을 입력하세요.");
				inputEmail =  input.next();
				if(email.contains(inputEmail)) {
					int removeIdx = name.indexOf(inputEmail);
					name.remove(removeIdx);
					phone.remove(removeIdx);
					email.remove(removeIdx);
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("연락처 항목에 없는 이름입니다.");
				}
				break;
			case 4:
				if(phone.size() != 0) {
//				if(names.isEmpty() == false) 
					for(int i = 0; i < phone.size(); i++ ) {
						System.out.println("이름 : " + name.get(i) + "\t번호 : " + phone.get(i) + "\t이메일 : " + email.get(i));
					}
				}
				else {
					System.out.println("등록된 정보가 없습니다.");
				}
				
				break;
			case 5:
				System.out.println("수정할 이메일을 입력해주세요.");
				inputEmail = input.next();
				if(email.contains(inputEmail)) {
					emailIdx = email.indexOf(inputEmail);
					System.out.print("이름 수정 : ");
					inputName = input.next();
					name.set(emailIdx, inputName );
					
					System.out.print("번호 수정 : ");
					inputNum = input.nextInt();
					phone.set(emailIdx,inputNum);
					System.out.println("수정이 완료 되었습니다.");
				}else {
					System.out.println("존재하지 않는 이메일입니다.");
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
