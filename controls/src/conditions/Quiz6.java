package conditions;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		과자 1개에 1000원. 10개이상을 사면 전체 금액의 10% 할인. 100개 이상사면 12% 할인. 
		System.out.println("과자의 개수를 입력해주세요.");
		System.out.print("개수 : ");
		int snack = input.nextInt();
		int total = snack * 1000;
		
		
		if(snack >= 100) {
			total = (int)(total * 0.88); 
		}
		else if(snack >= 10) {
			total = (int)(total * 0.9); // cost = cost * 90 / 100;
		}
		
		
		
		System.out.println(total + "원 입니다.");
		
		
//		커피의 개당 가격은 2000원. 10개 초과하면 초과하는 양에 대해서만 개당 1500원.
		
		System.out.println("커피의 개수를 입력해주세요.");
		System.out.print("개수 : ");
		int coffee = input.nextInt();
		total = 0;
		
		
		if(coffee > 10) {
			total = (coffee - 10) * 1500 + 10 * 2000;
		} else {
			total = coffee * 2000;
		}
		
		// total = coffee * 2000;
		// if(coffee > 10) {
		// total = total - ((coffee - 10) * 500);}
		
		System.out.print(total + "원 입니다.");
		
		input.close();
	}

}
