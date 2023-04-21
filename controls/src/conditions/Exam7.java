package conditions;

import java.util.Scanner;

public class Exam7 { // 중첩문
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("수 입력 : ");
		int data = sc.nextInt();
		String message;
		
		if(data % 2 == 0) {
			if(data % 3 == 0) {
				message = data + "는/은 짝수이고, 3의 배수이다.";
			}else {
				message = data + "는/은 짝수이지만, 3의 배수는 아니다.";
			}
		}else {
			if(data % 3 == 0) {
				message = data + "는/은 홀수이고, 3의 배수이다.";
			}else {
				message = data + "는/은 홀수이지만, 3의 배수는 아니다.";
			}
		}
		System.out.println(message);

	}
}



