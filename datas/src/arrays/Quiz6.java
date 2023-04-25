package arrays;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {
		/*
		 * 5명의 이름과 나이를 저장하고 출력하는 프로그램 작성
		 * 나이순으로 정렬되어 출력되도록 기능 추가.
		 * */
		Scanner input = new Scanner(System.in);
		
		String[] nameArr= new String[5];
		int[] ageArr= new int[5];
		
		int i, j, tmpAge;
		String tmpName;
		
		for(i = 0; i < nameArr.length; i++) {
			System.out.println(i+1 + "번째 정보 입력");
			System.out.print("이름 : ");
			nameArr[i] = input.nextLine();
			System.out.print("나이 : ");
			ageArr[i] = input.nextInt();
			input.nextLine();
		}
		
		for( i=0; i< nameArr.length-1 ; i++) {
			for(j = i+1; j<nameArr.length; j++ ) {
				if(ageArr[i] > ageArr[j]) {// 나이순 : 오름차순
					tmpAge = ageArr[i]; 
					tmpName = nameArr[i];
					
					ageArr[i] = ageArr[j];
					nameArr[i] = nameArr[j];
					
					ageArr[j] = tmpAge;
					nameArr[j] = tmpName;
				}
			}
		}
		
		for(i=0; i<nameArr.length ; i++ ) {
			System.out.println(i+1 + "정보");
			System.out.println("이름 : " + nameArr[i] + ", 나이 : " + ageArr[i]) ;
		}
		input.close();
	}
}



