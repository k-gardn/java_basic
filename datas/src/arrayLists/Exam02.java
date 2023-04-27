package arrayLists;

import java.util.ArrayList;

public class Exam02 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>(); //주로 자료형 하나를 지정해서 사용하는걸 권고함.
		
		/*
		 * list.add("1")
		 * list.get(0)
		 * list.size()
		 * */
		
		list.add("1");
		list.add("1.1");
		list.add("문자열");
		list.add("문");

		System.out.println("데이터 : " + list.get(0));
		System.out.println("데이터 : " + list.get(1));
		System.out.println("데이터 : " + list.get(2));
		System.out.println("데이터 : " + list.get(3));
		
		System.out.println();
		for(int i = 0; i < list.size(); i++) {
			System.out.println("데이터 : " + list.get(i));
		}
		
		System.out.println();
		for(String s : list) {
			System.out.println("데이터 : " + s);
		}
	}

}
