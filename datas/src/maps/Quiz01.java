package maps;

import java.util.HashMap;
import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		HashMap<String, Integer> menu = new HashMap<>(); // 없는 키를 get하려고해도 에러가 나지 않는다.
		
		int select, muPrice;
		String muName;
		
		
		while(true) {
			
			System.out.println("1. 메뉴 등록");
			System.out.println("2. 메뉴별 가격 보기");
			System.out.println("3. 종 료");
			
			while(true) {
				System.out.println("숫자를 입력해주세요.");
				try {
					select = input.nextInt();
				} catch (Exception e) {
					continue;
				}
				
				break;
			}
			
			switch (select) {
			case 1:
				while(true) {
					System.out.print("등록할 메뉴를 입력하세요.");
					muName = input.next();
					try {
						System.out.print("가격을 입력하세요.");
						muPrice = input.nextInt();
					} catch (Exception e) {
						System.out.println("입력이 잘 못 되었습니다.");
						continue;
					}
					if(muPrice <= 0) {
						break;
					}
					break;
				}
				
				menu.put(muName, muPrice);
				break;
			case 2:
				
				if(menu.isEmpty()) {
					System.out.println("등록 후 이용해주세요.");
				}else {
					input.nextLine(); // 버퍼 정리.
					while(true) {
						System.out.println("===== 메뉴판 =====");
						for ( String key : menu.keySet() ) {
						    System.out.println("메뉴 : " + key +"\t가격 : " + menu.get(key)+"원");
						}
						System.out.println("1. 수정 2. 삭제 3. 나가기");
						
						select = input.nextInt();
						if(select == 1) {
							System.out.println("어떤 메뉴를 수정하시겠습니까? ");
							muName = input.next();
							if(menu.containsKey(muName)) {
								System.out.println("수정할 가격을 입력해주세요.");
								muPrice = input.nextInt();
								menu.put(muName,muPrice);
							}else {
								System.out.println("존재하지 않는 메뉴 입니다.");
								continue;
							}
							
						}else if(select == 2) {
							System.out.println("어떤 메뉴를 삭제하시겠습니까?");
							muName = input.next();
							if(menu.containsKey(muName)) {
								menu.remove(muName);
								System.out.println("메뉴가 삭제되었습니다.");
								continue;
							}else {
								System.out.println("존재하지 않는 메뉴 입니다.");
								continue;
							}
						}else {
							System.out.println("메뉴로 돌아갑니다.");
							break;
						}
					}
				}
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}
