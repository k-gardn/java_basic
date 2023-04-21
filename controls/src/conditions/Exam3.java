package conditions;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int data;
		System.out.print("입력 : ");
		data = input.nextInt();
		
		if(data > 10) {
			System.out.println("종속문장실행");
		}
		System.out.println("다음 문장"); 

		input.close();
	}

}
