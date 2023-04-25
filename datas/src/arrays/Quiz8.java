package arrays;

import java.util.Random;
import java.util.Scanner;

public class Quiz8 {

	public static void main(String[] args) {
		/*
		 * 5 * 6의 2차원 배열을 만들고 난수를 입/출력하세요.
		 * 1 ~ 45
		 * 각 행은 중복되지 않는 난수 구성.
		 * */
		Scanner input = new Scanner(System.in);
		
		Random ran = new Random();
		
		int[][] arr = new int[5][6];
		
		int i, j, k;
		
		for(i=0; i < arr.length; i++) {
			for(j=0; j < arr[i].length; j++) {
				arr[i][j] = (int) ran.nextInt(45) + 1; // 1 ~ 45난수.
				for(k = 0; k < j; k++) {
					if(arr[i][j] == arr[i][k]) { //중복제거.
						j--;
						break;
					}
				}
			}
		}
		
		for(i=0; i < arr.length; i++) {
			for(j=0; j < arr[i].length -1; j++) {
				for(k = j; k < arr[i].length; k++) {
					if(arr[i][j] > arr[i][k]) {
						int tmp = arr[i][j];
						arr[i][j] = arr[i][k];
						 arr[i][k] = tmp;
					}
				}
				
			}
		}
		
		for(i=0; i < arr.length; i++) {
			for(j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		input.close();
	}
}



