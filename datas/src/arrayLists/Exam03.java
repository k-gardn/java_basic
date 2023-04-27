package arrayLists;

import java.util.ArrayList;

public class Exam03 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>(); //주로 자료형 하나를 지정해서 사용하는걸 권고함.
		
		/*
		 * 기본 자료형을 써도됌.
		 * < Wrpper Class > : 기본 자료형이 아닌, 객체 자료형 = 클래스 자료형
		 * - Byte
		 * - Short
		 * - Character
		 * - Integer
		 * - Long 
		 * - Float
		 * - Double
		 * */
		
		Integer data1 = 10;
		Integer data2 = 20;
		
		int data5 = 100; // 기본 자료형으로도 쓸 수 있음.
		
		Double data3 = 1.1;
		Double data4 = 2.2;
		
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(10);
		list.add(data2);
		list.add(data5); //알아서 Integer로 변환함.

		System.out.println("리스트의 저장된 데이터 수 : " + list.size());
		System.out.println(list);
		
		int[] arr = {1,2,3,4};
		System.out.println(arr);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println("데이터 : " + list.get(i));
		}
		
		System.out.println();
		for(int i : list) {
			System.out.println("데이터 : " + i);
		}
	}

}
