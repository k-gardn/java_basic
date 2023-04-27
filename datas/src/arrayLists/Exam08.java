package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam08 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		System.out.println("======== 시작 ========");
		System.out.println(list);
		
		
		System.out.print("변경할 위치 : ");
		Scanner input = new Scanner(System.in);
		int index = input.nextInt();
		
		System.out.print("변경 데이터 : ");
		String element = input.next();
		list.set(index, element); // Update
//		list.add(index, element); // Insert
		
		System.out.println(list);
		System.out.println("======== 결과 ========");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
	}

}
