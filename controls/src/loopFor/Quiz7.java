package loopFor;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, j, line, space, star;
		
		star = 1;
		
		System.out.println("줄 수를 입력하세요.");
		System.out.print("홀수 입력: ");
		
		line =  input.nextInt();
		space = line / 2 ; // 3
		
		for( i = 1 ;i <= line ; i++ ) { 
			if(i <= line / 2 + 1  ) { //반올림한 4번째 줄까지 출력
				for( j = 1 ;j <= space ; j++ ) {//3 2 1
					System.out.print(" ");
				}
				
				for( j = 1 ; j <= star ; j++ ) {
					System.out.print("*");
				}
				star += 2;
				space--;
			}
			else {
				space++;
				star -= 2;
				for( j = 1 ;j <= space + 1 ; j++ ) {
					System.out.print(" ");
				}
				
				for( j = 1 ; j <= star - 2 ; j++ ) {
					System.out.print("*");
				}
				
//				space++;
			}
			
			
			System.out.println();
			
			
		}
		
		System.out.println();
		star = line / 2 ; // 몫: 3
		space = 1;
		
		for (i = 0; i < line; i++) {
			for(j = 1; j <=star; j++) {
				System.out.print("*");
			}
			for(j = 1; j <=space; j++) {
				System.out.print(" ");
			}
			for(j = 1; j <=star; j++) {
				System.out.print("*");
			}
			System.out.println();
			
			if(i < line / 2) {
				space += 2;
				star--;
			}else {
				space -= 2;
				star++;
			}
		}
		
		
		
		
	}
}
