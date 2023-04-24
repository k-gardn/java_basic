package loopWhile;

import java.util.Random;
import java.util.Scanner;

public class Quiz10 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int max = 101, min = 1;
		
		while (true) {
			System.out.println("\n==== Up & Down Game ====");
			System.out.println("1.Game Start \n2.Game Score \n3.End Game");
			System.out.print(">> ");
			
			int select;
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			switch (select) {
			case 1:
				System.out.println("<< Game Start >>");
				
				int answer = r.nextInt(100) + 1;
				System.out.println("정답 : " + answer);
				
				while(true) {
					System.out.println("<< Player Turn >>");
					System.out.print("Input Number : ");
					int user = 0, com = 0;
					try {
						user = sc.nextInt();
					} catch (Exception e) {
						sc.nextLine();
						continue;
					}
					
					if(user < 1 || user > 100)
						continue;
					
					//(end - begin + 1) + begin
					if(user > answer) {
						System.out.println("Down!!");
						max = user;
					}
					else if(user < answer) {
						System.out.println("Up!!");
						min = user;
					}
					else {
						System.out.println("플레이어가 정답을 맞췄습니다!!");
						break;
					}
					System.out.println("사용자 턴이 끝났습니다. 계속하려면 엔터키를 누르세요.");
					 // computer는 min + 1 ~ max-1까지 
					com = r.nextInt(max - 1 - min ) + min + 1;
					System.out.print("컴퓨터가 맞춰봅니다. \n 컴퓨터의 입력: " + com);
					System.out.println();
					
					if(com > answer) {
						System.out.println("Down!!");
						max = com;
					}
					else if(com < answer) {
						System.out.println("Up!!");
						min = com;
					}
					else {
						System.out.println("컴퓨터가 정답을 맞췄습니다!!");
						break;
					}
				}
				break;
				
			default :
				System.out.println("확인 후 다시 입력하세요.");
			}
		}
	}
}

