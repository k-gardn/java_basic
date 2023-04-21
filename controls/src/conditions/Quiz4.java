package conditions;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
//		세 수 중 최대/최소 값 출력.
		System.out.println("세 수 중 최대/최소 값 구하는 프로그램 작성하세요");
		System.out.print("세 수 입력 : ");
		int data1 = input.nextInt();
		int data2 = input.nextInt();
		int data3 = input.nextInt();
		
		int max = data1, min = data2;
		
		if(max < data2) { // data1(max) < data2
			max = data2;
			min = data1;
			if(max < data3) max = data3;
			if(min > data3) min = data3;
			
		} else { // data2 < data1(max) 
			if(max < data3) max = data3; // data2 < data1(max) < data3
			if(min > data3) min = data3; // data3 <data2 < data1(max)
			
		} 
		
		//쌤
//		max = data1;
//		min = data2;
		
//		if (data1 < data2) {
//			max = data2;
//			min = data1;
//		}
//		
//		if (max < data3) // max가 data1이던지, data2이던지  상관없이 data3가 더 크면 max가 바뀌도록.
//			max = data3;
//		else if(min > data3) //  min이 data1이던지, data2이던지  상관없이 data3가 젤 작으면 min이 바뀌도록.
//			min = data3;
		System.out.println("최대값 : " + max + ", 최솟값: " + min);
		
		
//		정수를 입력받아 3의 배수, 4의 배수 조건에 맞게 출력하시오.
		System.out.println("3의 배수, 4의 배수 조건에 맞게 출력하시오.");
		System.out.print("입력 : ");
		data1 = input.nextInt();
		
//		if(data1 == 0) {
//			while(true) {
//				System.out.println("다시 입력해주세요.");
//				System.out.print("입력 : ");
//				data1 = input.nextInt();
//				
//				if(data1 != 0) break;
//			}
//		}
		
		//data1 == 0 는 어느것으로 나누어도 0으로 나누어 떨어지기 때문에 제일 먼저 해줘야함.
		while(data1 == 0) {
			System.out.println("다시 입력해주세요.");
			System.out.print("입력 : ");
			data1 = input.nextInt();
			
			if(data1 != 0) break;
		}
		
			
		if(data1 % 3 == 0 && data1 % 4 == 0) {
			System.out.println("[" + data1 + "]" + "는/은 3의 배수 이면서, 4의 배수입니다. ");
		} else if(data1 % 3 == 0) {
			System.out.println("[" + data1 + "]" + "는/은 3의 배수입니다. ");
		} else if(data1 % 4 == 0) {
			System.out.println("[" + data1 + "]" + "는/은 4의 배수입니다. ");
		} else {
			System.out.println("[" + data1 + "]" + "는/은 3의 배수도 4의 배수도 아닙니다. ");
		} 
		
		
		
		
//		if(data1 != 0) {
//			if(data1 % 3 == 0 && data1 % 4 == 0) {
//				System.out.println(data1 + "는/은 3의 배수 이면서, 4의 배수입니다. ");
//			} else if(data1 % 3 == 0) {
//				System.out.println(data1 + "는/은 3의 배수입니다. ");
//			} else if(data1 % 4 == 0) {
//				System.out.println(data1 + "는/은 4의 배수입니다. ");
//			} else {
//				System.out.println(data1 + "는/은 3의 배수도 4의 배수도 아닙니다. ");
//			} 
//		} else
//			System.out.println("0을 입력하셨습니다. 다시 입력해주세요.");
		
		
		
		input.close();
	}

}
