package loopWhile;

import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select;
		int total = 10000, eachDice = 0, diceSum = 0, betting = 0, com = 0;
		int win = 0, lose = 0, draw = 0; 
		char play ;
		
		while(true) {
			System.out.println("=== Dice Game ===");
			System.out.println("숫자를 선택하세요.");
			System.out.print("1. Game Start / 2. Game Score / 3. End Game ");
			System.out.print(">>> ");
			
			try {
				select = Integer.parseInt(sc.next());
			} catch (Exception e) {
				continue;
			}

			if (select == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}

			if (select < 1 || select > 3) {
				System.out.println("확인 후 다시 입력하세요.");
				continue;
			}
			
			if(select == 1) {
					System.out.println("게임을 시작합니다.");
					
					while(true) {
						diceSum = 0;
						System.out.println("배팅 금액 : " + total + "원");
//						total = sc.nextInt(); // 첫 배팅 금액을 전액에 넣음.
						
						System.out.println("주사위를 돌리겠습니다.");
						for(int i = 0; i < 3 ; i++) {
							System.out.print(i + " 번째 주사위 : ");
							eachDice = (int)(Math.random() * (6 - 1 + 1)) + 1; // 1 ~ 6
							System.out.println(eachDice);
							diceSum += eachDice;
						}
						
						System.out.println("당신의 주사위 총 합: " + diceSum);
						
						while(true) {
							System.out.println("배팅 금액을 정해주세요.");
							betting = sc.nextInt();
							if(betting >= 100000) {
								System.out.println("100000보다 적은 금액을 배팅하세요.");
							}
							else
								break;
						}
						
						System.out.println("=== 결과 ===");
						System.out.println("당신의 눈 : " + diceSum);
						com = (int)(Math.random() * (18 - 3 + 1)) + 3; // 3 ~ 18
						System.out.println("상대의 눈 : " + com);
						
						if(diceSum > com) {
							System.out.println("당신이 이겼습니다.");
							System.out.println(betting + "원을 얻었습니다.");
							win++;
							total += betting;
						} else if(diceSum < com){
							System.out.println("당신이 졌습니다.");
							System.out.println(betting + "원을 잃었습니다.");
							lose++;
							total -= betting;
							if(total <= 0) {
								System.out.println("돈을 모두 잃었습니다. 게임을 종료합니다.");
								System.out.println("모든 기록이 초기화 됩니다.");
								win = 0; lose = 0; draw = 0;
								total = 10000;
								break;
							}
						}else {
							System.out.println("비겼습니다.");
							draw++;
						}
						
						
						
						System.out.println("게임을 계속하시겠습니까? (y/n)");
						play = sc.next().charAt(0);
						if(play == 'y') {
							continue;
						}else {
							System.out.println("게임을 종료합니다.");
							break;
						}
				}
			}
			if(select == 2) {
				System.out.println("현재 " +(win + lose + draw) +"전 " + win + "승 " + draw + "무 " + lose + "패");
			}
		}
	}
}

