package arrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam05 {

	public static void main(String[] args) {
		//indexOf()
		
		Scanner sc = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();
		
		String data1 = "김변수";
		String data2 = "이변수";
		String data3 = "박변수";
		
		list.add(data1);
		list.add(data2);
		list.add(data3);
		list.add("최변수");
		
		System.out.println("list.indexOf(\"최변수\"): " + list.indexOf("최변수"));
		System.out.println("list.indexOf(\"최상수\"): " + list.indexOf("최상수")); //indexOf data가 없으면 -1을 반환함.
		System.out.print("데이터 확인 : ");
		String tmp = sc.next();
		
		int index = list.indexOf(tmp);
		if(index != -1) {
			System.out.println(list.get(index) + "는 존재합니다.");
		}else
			System.out.println(tmp +"는 존재하지 않습니다.");
		
	}

}
