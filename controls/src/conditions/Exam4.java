package conditions;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int data = sc.nextInt();
		
		if(data % 3 == 0) {
			System.out.println(data + "는/은 3의 배수이다.");
		}else {
			System.out.println(data + "는/은 3의 배수가 아니다.");
		}
		
	}

}
