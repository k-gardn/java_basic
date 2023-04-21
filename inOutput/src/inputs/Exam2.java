package inputs;

import java.io.IOException;

public class Exam2 {
	public static void main(String[] args) throws IOException  { //문법적 에러가 아님, 실행이 될 수도 안될수도 있지만. 결과가 이상해질 수 있음.
		//throws: 전가 -> 예외를 전가시킨다.
		System.out.print("입력 :");
		
		//이거는 잘 안씀.
		// System.in.read(); 글자 수만큼 받아야함.
		// 한 글자씩 받음. 입력의 길이를 예측할 수 없기 때문에 쓰지 않는 것이 좋음.
		int data = System.in.read(); //입력받은 숫자를 유니코드로 변환함.
		System.out.println("입력 받은 데이터 : " + data);
	}
}
