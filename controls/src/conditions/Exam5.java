package conditions;

import java.util.Scanner;

public class Exam5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data1, data2, max, min; 
		
		System.out.println("두 수 입력 : ");
		data1 = sc.nextInt();
		data2 = sc.nextInt();
		
		if(data1 > data2) {
			max = data1;
			min = data2;
		}else {
			min = data1;
			max = data2;
		}
		
		System.out.println("max : " + max + ", min : "  + min);
		
		sc.close();
	}

}
