package loopWhile;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//쌤
		while(true) {
			System.out.println("=== 가위 바위 보 게임 ===");
			System.out.println("숫자를 선택하세요.");
			System.out.print("1. 가위 / 2. 바위 / 3. 보 / 0. 종료");
			System.out.print(">>> ");
			
			int user;
			try { 
				user = sc.nextInt();
			} catch (Exception e) { // 숫자가 아니면 다시 입력하도록.
				sc.nextLine();
				continue;
			}
			
			if(user == 0) {
				System.out.println("프로그램을 종료합니다."); 
				System.exit(0);
			}
			
			if( !(user == 1 || user == 2 || user == 3))
				continue;
			
			int com = (int)(Math.random() * (3 - 1 + 1)) + 1; // 1 ~ 3
			
			String comStr = (com == 1) ? "가위" : com == 2 ? "바위" : "보";
			String userStr = (user == 1) ? "가위" : user == 2 ? "바위" : "보";
		
			System.out.println("======= 결과 =======");
			System.out.println(userStr + " 를 선택하셨군요. ");
			System.out.println("컴퓨터는 " + comStr + " 를 냈어요.");
			
			String result = "";
			if(user == com) {
				result = "Draw";
			}else {
				if(user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
					result = "win";
				}
				else 
					result = "Lose";
			}
			System.out.println(result);
		}
		
	}
}

