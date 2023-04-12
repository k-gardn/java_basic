package variables;

public class Exam1 {

	public static void main(String[] args) {
		/* 
		 * 자료형 변수명;
		 * 자료형 변수명 = 데이터;
		 * '=' : 대입연산자, 오른쪽의 데이터를 왼쪽 공간에 넣어주겠다.
		 *  */
		
		int intData1; //주소의 공간은 알아서 만들거야. 우리는 공간의 이름만 만들어줌.
		
		byte data1 = 100;
		short data2 = 100;
		int data3 = 100;
		long data4 = 100;
		
		/*
		 * 100이라는 상수가 내부에서 저장될 때 선택되는 자료형은 int
		 *  그래서 주로 int 자료형으로 정수를 저장하는 코드가 많을 것이다.
		 */
		
		intData1 = 200;
		System.out.println("intData1 : " + intData1);
		System.out.println("data3 : " + data3);

	}

}
