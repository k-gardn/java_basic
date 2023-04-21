package conditions;

public class Exam1 {

	public static void main(String[] args) {
		/*
		 * 조건식은 최종결과가 true 또는 false, 그 외에 안됨.
		 * if(조건식) {
		 * 	실행할 문장, 종속문장;
		 * 	실행할 문장, 종속문장;
		 * 	실행할 문장, 종속문장;
		 * }
		 */
		
		if(true) {
			System.out.println("조건식이 참이면 실행할 문장.");
		}
		System.out.println("다음문장. if문의 종속문장이 아님.");
		
		if(false) {
			System.out.println("조건식이 거짓이기에 실행이 될일이 없음.");
		}
		System.out.println("다음문장. if문의 종속문장이 아님.");


	}

}
