package strings;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		/*
		 * String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		 * 아래와 같이 출력하시오.
		 * 
		 * */
		Scanner input = new Scanner(System.in);
		
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
//		System.out.println(str);
		
		String[] person = str.split("\n");
		for(int i = 0; i < person.length ; i++) {
			person[i] = person[i].replaceAll("-",": ");
			System.out.println(person[i]);
		}
		
		System.out.println();
		System.out.println("원하는 년도를 입력해주세요.");
		String year = input.next();
		
		for(int i = 0; i < person.length ; i++) {
			String newYearStr = person[i].split(" ")[0] + " : " + year + "년";
			System.out.println(newYearStr);
		}
		System.out.println();
		
		//쌤 정규식 풀이
		str = str.replaceAll("-",": ");
		str = str.replaceAll("[0-9][0-9][0-9][0-9]", year);
		System.out.println(str);
		
	
		
	}
}
