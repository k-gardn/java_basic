package operators;

public class Exam7 {
	public static void main(String[] args) {
		
		/*
		 * 조건 연산자(조건부 연산자, 삼항연산자)
		 * 
		 * (조건식) ? 참일때 반환할 문장들 : 거짓일 때 반환할 문장들;
		 * 
		 * 반환 형식은 같아야함. 자료형을 지정해주기 때문에.
		 */
		
		int data = 10;
		String result = (data >= 10 || data < 5) ?
				"참일 때 반환할 문장" : "거짓일 때 반환할 문장";
		
		System.out.println(result);
		
		result = (data % 2 == 0) ? "짝수" : "홀수";
		System.out.println(data + " = " + result);
		
		data = 9;
		int total = (data % 2 == 0) ? --data : ++data;
		System.out.println(data + " = " + total);
	}
	
}
