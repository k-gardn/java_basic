package strings;

public class Quiz2 {

	public static void main(String[] args) {
		/*
		 * It is a fun java programming 문자열에서
		 * 위 문자열에서 a의 개수와 g의 개수와 문자(공백을 제외한)의 총 개수를 출력하시오.
		 * 
		 * */
		String str = "It is a fun java programming";
		String replace = str.replace(" ", "");
		String[] split = replace.split("");
		
		
		int answer = 0;
		
		for(int i = 0; i < split.length; i++) {
			if(split[i].equals("a") || split[i].equals("g")) {
				answer++;
			}
		}
		answer += split.length;
		System.out.print("결과 : " + answer);
	}
}
