package arrays;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = 0;
		
		
		while(true) {
			System.out.print("생성할 배열의 길이를 입력: ");		
			try {
				length = input.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("정수를 입력해주세요.");
				input.nextLine();
				continue;
			}
		}
		int[] arr = new int[length];
		System.out.println(length + "개의 배열이 생성되었습니다.");
		System.out.println("데이터를 입력하세요.");
		
		for(int i = 0; i < length; i++) {
			while(true) {
				System.out.print( i+1 + "번째 데이터 : ");
				try {
					arr[i] = input.nextInt();
					break;
				} catch (Exception e) {
					System.out.println("정수를 입력해주세요.");
					input.nextLine();
					continue;
				}
			}
		}
		
		System.out.print("배열 데이터 : " );
		for(int i = 0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("입니다." );
		
		int i, j, tmp;
		for(i = 0; i<arr.length-1; i++ ) {
			for(j = i+1; j < arr.length ; j++) {
//				if(arr[i] > arr[j]) { //오름차순
				if(arr[i] < arr[j]) { //내림차순
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		System.out.println();

		System.out.print("정렬 후 값은 : " );
		for(i = 0; i<arr.length; i++ ) {
			System.out.print(arr[i] + " ");
		}
		System.out.print("입니다." );
		
		input.close();
	}
}



