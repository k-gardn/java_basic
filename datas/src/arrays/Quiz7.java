package arrays;

import java.util.Scanner;

public class Quiz7 {

	public static void main(String[] args) {
		/*
		 * 5 * 5의 2차원 배열을 만들고 난수를 입/출력하세요.
		 * */
		Scanner input = new Scanner(System.in);
		
		int[][] arr = new int[5][5];
		
		int i, j;
		
		for(i=0; i < arr.length; i++) {
			for(j=0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * (9));
				System.out.print(arr[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		System.out.println();
		
		char[][] alpha = new char[5][5];
		
		for(i=0; i < alpha.length; i++) {
			for(j=0; j < alpha[i].length; j++) {
				alpha[i][j] = (char) (Math.random() * (122 - 97 + 1) + 97); // 97 ~ 122
				System.out.print(alpha[i][j] + "\t");
			}
			
			System.out.println();
		}
// 쌤풀이.	
//		Random ran = new Random();
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = ran.nextInt(26) + 97;
//			}
//		}
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				System.out.print((char)arr[i][j] + "\t"); // 출력에서만 바꿔줘도 됌.
//			}
//			System.out.println();
//		}
		
		input.close();
	}
}



