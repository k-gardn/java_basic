package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random r = new Random(); 
		
		
		boolean stop = true;
		int inputNum = 0;
		boolean computer = false;
		
		while(stop) {
			System.out.println("== 동전 앞/뒤 맞추기 ==");
			System.out.println("1. 앞면 / 2. 뒷면 / 3. 종료");
			inputNum = input.nextInt();
			computer = r.nextBoolean();
			
			switch(inputNum) {
			case 1:
				System.out.println("선택 > " + inputNum);
				break;
			case 2:
				System.out.println("선택 > " + inputNum);
				break;
			case 3:
				System.out.println("게임을 종료합니다.");
				stop = false;
				System.exit(0);
			default:
				System.out.println("메뉴를 확인 후 다시 입력하세요.");
			}
			
			if(inputNum == 1 && computer == true || inputNum == 2 && computer == false) {
				System.out.println("맞췄습니다!");
			}else{
				System.out.println("땡! 틀렸습니다.");
			}
		}
		
		//쌤
//		while(true) {
//			System.out.print("1.앞면");
//			System.out.print(" / 2.뒷면");
//			System.out.println(" / 3.나가기");
//			System.out.print(">>> ");
//			
//			int user;
//			try {
//				user = sc.nextInt();
//			} catch (Exception e) {
//				sc.nextLine();
//				continue;
//			}
//			
//			if(user == 3) {
//				System.out.println("프로그램을 종료합니다."); 
//				System.exit(0);
//			}
//			
//			if( !(user == 1 || user == 2))
//				continue;
//			
//			int com = (int)(Math.random() * 2) + 1;
//			System.out.println("com : " + com);
//			
//			if(user == com) {
//				System.out.println("맞췄습니다.");
//			}else {
//				System.out.println("틀렸습니다.");
//			}
//		}
		
		
	}
}

