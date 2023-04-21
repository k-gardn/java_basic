package conditions;

import java.util.Scanner;

public class Exam8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int data = sc.nextInt();
		String message;
		
		if(data > 0) {
			if(data % 2 == 0) {
				message = data + "는(은) 양의 짝수입니다.";
			}else {
				message = data + "는(은) 양의 홀수입니다.";
			}
		}else if(data < 0) {
			if(data % 2 == 0) {
				message = data + "는(은) 음의 짝수입니다.";
			}else {
				message = data + "는(은) 음의 홀수입니다.";
			}
		}else {
			message = "입력 데이터는 0입니다.";
		}
		
		System.out.println(message);

	}
}







