package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		// 이름은 중복 가능. 전화번호는 중복 안됨.
		// 연락처가 중복되면 등록 못함.
		// 이름과 전화번호의 index가 같아야 함.
		
		/* 1. 연락처 등록
		 * 2. 연락처 검색
		 * 3. 연락처 삭제
		 * 4. 모두 보기
		 * 5. 종료
		 *  */
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> phone = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		int select, phoneNum;
		String phoneName;
		
		while(true) {
			
			if(phone.isEmpty()) {
				System.out.println("1. 연락처 등록");
			}
			else {
				System.out.println("1. 연락처 등록");
				System.out.println("2. 연락처 검색");
				System.out.println("3. 연락처 삭제");
				System.out.println("4. 모두 보기");
				System.out.println("5. 종료");
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
					System.out.println("연락처를 입력해주세요.");
					try {
						phoneNum =  input.nextInt();
					} catch (Exception e) {
						input.nextLine();
						continue;
					}
					break;
				}
				
				while(true) {
					System.out.println("이름을 입력해주세요.");
					try {
						phoneName =  input.next();
					} catch (Exception e) {
						input.nextLine();
						continue;
					}
					break;
				}
				
				// 중복 검사.
				if(name.contains(phoneName)) {// indexOf가 -1이면 없는 것.
					System.out.println("중복된 연락처 입니다.");
				}
				else {
					phone.add(phoneNum);
					name.add(phone.indexOf(phoneNum), phoneName);
				}
//				System.out.println("phone" + phone);
//				System.out.println("name" + name);
				
			}
				break;
			case 2:
				System.out.println("이름을 입력해주세요.");
				phoneName =  input.next();
				if(name.contains(phoneName)) {
					System.out.println("번호 : " + phone.get(name.indexOf(phoneName))); 
				}
				else {
					System.out.println("등록된 이름이 아닙니다.");
				}
				break;
			case 3:
				System.out.println("삭제할 연락처의 이름을 입력하세요.");
				phoneName =  input.next();
				if(name.contains(phoneName)) {
					int removeIdx = name.indexOf(phoneName);
					name.remove(removeIdx);
					phone.remove(removeIdx);
					System.out.println("삭제되었습니다.");
				}else {
					System.out.println("연락처 항목에 없는 이름입니다.");
				}
				break;
			case 4:
				for(int i = 0; i < phone.size(); i++ ) {
					System.out.println("이름 : " + name.get(i) + "\t번호 : " + phone.get(i) );
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
