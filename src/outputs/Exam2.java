package outputs;

public class Exam2 {

	public static void main(String[] args) {
		System.out.println(100 + 100);
		System.out.println(200.22 + 200);
		System.out.println(200.11 + 100.22);
		// CPU상 오차가 발생할 수 밖에 없음. 300.33000000000004
		
		//"" 쌍따옴표로 데이터를 표현하면 문자열 데이터
		//+ 는 문자열 이어붙이기.
		System.out.println("100" + 100);
		System.out.println("200.22" + 200);
		System.out.println(200.11 + "100.22");
		
		//10000자리에는 주로 변수 데이터가 올 예정.
		System.out.println("결과 : " + 10000 + "원");
		System.out.printf("결과 : %d원", 10000);

	}

}
