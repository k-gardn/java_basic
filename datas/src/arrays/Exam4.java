package arrays;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name[] = new String[3];

		for(int i = 0; i < name.length; i++) {
			System.out.print(i+1+"번째 이름 입력 : ");
			name[i] = input.next();
		}
		
		for(int i = 0; i < name.length; i++) {
			System.out.println(i+1+"번째 값 : "+ name[i]);
		}
		input.close();
	}
}



