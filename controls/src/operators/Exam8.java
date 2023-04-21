package operators;

public class Exam8 {
	public static void main(String[] args) { //비트 연산자
		// 하드웨어 쪽에서 많이 쓰는 문법
		// 1비트 : 하나의 데이터를 담을 수 있는 공간. 
		// 0,1 = 이진수
		
		int data1 = 55, data2 =22, or = 0, and = 0, xor = 0;
		// 55의 이진수의 값: 0011 0111
		// 22의 이진수의 값: 0001 0110
		//==========================
		// or  연산 결과  : 0011 0111 
		// and 연산 결과  : 0001 0110
		// xor 연산 결과  : 0010 0001            //같은 수면 0, 다르면 1.
		
		
		or = data1 | data2;
		and =  data1 & data2;
		xor = data1 ^ data2;
		
		System.out.println("data1 | data2 : " + or);
		System.out.println("data1 & data2 : " + and);
		System.out.println("data1 ^ data2 : " + xor);
	}
	
}
