package conditions;

import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int data;
		 System.out.println("수 입력 : ");
		 data = input.nextInt();
		
		 
		 if(data > 100) // > 100보다 >50 를 먼저 할 경우, 포함해버리기 때문에 100보다 큰 수를 거르지 못할 수도 있다.
			 System.out.println(data + ": 100보다 크다.");
		 else if (data > 50) 
			 System.out.println(data + ": 50보다 크다.");
		 else 
			 System.out.println(data + ": 50보다 작다.");
		
		
		input.close();
	}

}
