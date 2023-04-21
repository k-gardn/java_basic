package inputs;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Exam5 {
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int data1 = 0, data2 = 0; // 초기값을 안 넣어놓으면, 만약 입력이 잘못되었을 경우 변수에 들어가지 않기때문에 코드 에러남.
		
		while(true) {
			System.out.println("정수 입력 : ");
			try {
				//예외가 발생할 수 있는 코드를 작성.
				//만약에 input에 int가 아닌 다른 입력이 들어갈 경우.
				data1 = sc.nextInt();
				data2 = sc.nextInt();
				
			} catch (InputMismatchException e) { // 특정 사유에 의한 에러를 잡겠다.
				// catch (InputMismatchException e)
				// try 안에 코드에서 예외가 생겼다면 실행할 코드. // 
				// 예외가 발생하지 않으면 실행안함.
				
				sc.nextLine(); // 이걸 넣지 않으면 무한 랜더링에 빠짐. 
				//data1 = sc.nextInt(); 얘는 정수값만 처리하기 때문에, 입력에 문자열 섞였을 경우 처리할 능력이 없음.
				
				continue; // 다시 위로 가버려서 break 문으로 가지 못함. 다시 while문으로 올라감.
			} 
			break; // try문에 에러가 없을 경우, break문으로 넘어와서 while문이 끝남.
			
//			catch (ArrayIndexOutOfBoundsException e) { 
//				
//				
//			} catch (Exception e) { // Exception : 어떠한 예외가 발생해도 다 잡아서 발생시키겠다. //모든 에러를 다 잡는 애이기 때문에 맨 밑에 적어야함.
//				
//				System.out.println("관리자에게 문의하세요.");
//			}
		}
		
		System.out.println("입력받은 데이터 : " + data1 + ", " + data2);
		
		sc.close(); //
		
	}
}
