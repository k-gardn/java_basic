package loopFor;

import java.util.Scanner;

public class Exam7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j, line, space, star;
		
		line =  1;
		star = 1;
		
		
		System.out.println("줄 수 입력: ");
		line =  input.nextInt();
		space = line - 1;
		
		for( i = 1 ;i < line ; i++ ) { 
			
			for( j = 1 ;j <= space ; j++ ) {
				System.out.print(" ");
			}
			
			for( j = 1 ; j <= star ; j++ ) {
				System.out.print("*");
			}
			
			System.out.println();
			
			star += 2;
			space--;
		}
	}
}
