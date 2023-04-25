package arrays;

import java.util.Scanner;

public class Quiz9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("===== 아파트 입주자 정보 =====");
		
		int floor = 0;
		
		while(true) {
			System.out.print("건물의 층수를 입력하세요 : ");
			try {
				floor = input.nextInt();
			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				input.nextLine();
				continue;
				// TODO: handle exception
			}
			if(floor > 0)
				break;
		}
		
		String[][] eatchFloor = new String[floor][];

		for (int i = 0; i < eatchFloor.length; i++) {
			int n;
			while(true) {
				System.out.print(i + 1 + "층의 총 호실 입력 : ");
				
				try {
					 n = input.nextInt();
					
				} catch (Exception e) {
					continue;
				}
				if(n > 0)
					break;
			}
			eatchFloor[i] = new String[n]; //각 층의 배열 길이 입력.
		}
		
		System.out.println();
		for (int i = 0; i < eatchFloor.length; i++) {
			System.out.println((i + 1) + "층은 " + eatchFloor[i].length + "호실 까지 있습니다.");
//			System.out.printf("%02d층은 %02d호실 까지 있습니다.\n", i + 1, eatchFloor[i].length);
		}
		
		System.out.println("각 호실의 입주자 정보를 입력하세요.");
		System.out.println();
		for (int i = 0; i < eatchFloor.length; i++) {
			System.out.println(i+1 + "층의 정보를 입력하세요.");
			for (int j = 0; j < eatchFloor[i].length; j++) {
				System.out.print((i + 1) + "층 " + (j + 1) +"호실: ");
				String name = input.next();
				eatchFloor[i][j] = name;
			}
			System.out.println();
		}
		
		System.out.println("===== 입주자 정보 =====");
		for (int i = 0; i < eatchFloor.length; i++) {
			for (int j = 0; j < eatchFloor[i].length; j++) {
				System.out.println((i + 1) + "층 " + (j + 1) +"호실 입주자: "+ eatchFloor[i][j]);
			}
			System.out.println();
		}
	}
}




