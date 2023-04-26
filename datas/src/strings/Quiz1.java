package strings;

public class Quiz1 {

	public static void main(String[] args) {
		/*
		 * Have a nice day Have a nice day Have a nice day
		 * 위 문자열에서 a의 위치를 저장하여 출력하시오.
		 * 결과 : 1,5,13
		 * */
		String str = "Have a nice day Have a nice day Have a nice day";
		String[] split = str.split("");
		
		System.out.print("결과 : ");
		int answer = 0;
		
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("a")) {
				answer = i;
				System.out.print(answer + ", ");
			}
		}
		
	}
}
