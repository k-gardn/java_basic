package arrays;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		// 못 품..ㅎㅎㅎ
		// 기존 배열 백업하는 방법도 떠오를랑 말랑 했었음....
		// arr에  추가할 때 계속 0번째에 추가해서 초기화되는 현상이 있었는데, 그것을 dataCount로 바꿔주면 되는 거였음!...Wow
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 배열의 길이를 입력하세요.");
		int len = input.nextInt();
		int[] arr = new int[len];
		int[] totalArr = new int[len];
		int count = 1;
		
		while(true) {
			count++;
			for(int i = 0; i < len; i++) {
				System.out.print("입력(현재길이: " + len + ") : ");
				int inputNum = input.nextInt();
				arr[i] = inputNum;
				for(int j = 0; j <= i; j++) {
					System.out.print(arr[j] + " ,");
				}
				System.out.println();
			}
			
			for(int i = 0; i < len; i++) {
				totalArr[i] = arr[i];
				System.out.print(totalArr[i] + " "); 
			}
			System.out.println();
			len *= count;
			arr = new int[len];
			totalArr = new int[len];
			
		}
		//쌤 풀이
//		Scanner sc = new Scanner(System.in);
//		
//		int dataCount = 0;
//		int[] arr = new int[3];
//		while(true) {
//			for(int i = dataCount; i < arr.length; i++) {
//			
//				while(true) {
//					try {
//						System.out.print("입력(현재길이:" + arr.length + ") : ");
//						arr[i] = sc.nextInt();
//					} catch (Exception e) {
//						sc.nextLine();
//						continue;
//					}
//					break;
//				}
//				
//				dataCount++;
//				for(int j = 0; j < dataCount;j++)
//					System.out.print(arr[j] + ",");
//				System.out.println();
//			}
//			
//			int[] tmp = arr;
//			arr = new int[dataCount+3];
//			
//			for(int i = 0; i < tmp.length; i++) {
//				arr[i] = tmp[i];
//			}
//			
//		}
	}
}




