package arrays;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arr= new int[6];
		int lotto;
		
		for(int i = 0; i < arr.length; i++ ) {
			if(i == 0)
				arr[0] = (int) (Math.random() * (45)) + 1;
			else {
				for(int j = 0; j < i; j++) {
					while(true) {
						lotto = (int) (Math.random() * (45)) + 1;
						if(arr[j] != lotto)
							arr[i] = lotto;
							break;
					}
				}
			}
			
		}
		//쌤 풀이
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = r.nextInt(45) + 1;
//			
//			for(int j = 0; j < i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;
//				}
//			}
//		}
		
		int i, j, tmp;
		for(i = 0; i<arr.length-1; i++ ) {
			for(j = i+1; j < arr.length ; j++) {
				if(arr[i] > arr[j]) { //오름차순
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.print("번호 : ");
		
		for(i = 0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		
		input.close();
	}
}



