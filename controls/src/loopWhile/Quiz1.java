package loopWhile;

import java.util.Scanner;

public class Quiz1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		 // 
		 System.out.println("수 입력: ");
		 int i = input.nextInt();
		 
		 while(true) {
			 int tmp = i % 10; 
			 i = i / 10;
			 System.out.print(tmp + " ");
			 
			 if(i == 0)
				 break;
		 }
	}

}
