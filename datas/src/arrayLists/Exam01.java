package arrayLists;

import java.util.ArrayList;

public class Exam01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList(); //주로 자료형 하나를 지정해서 사용하는걸 권고함.
		
		/*
		 * 제너릭 형식=> 꺽쇠에 자료형을 지정하는 방법.
		 * <자료형> : Generic 
		 * */
		
//		list.add(1); // 제너릭을 지정해두면 정수, 실수, 문자 모두 에러남.
		
		list.add("1");
		list.add("1.1");
		list.add("문자열");
		list.add("문");
		
		System.out.println("데이터 : " + list.get(0));
		System.out.println("데이터 : " + list.get(1));
		System.out.println("데이터 : " + list.get(2));
		System.out.println("데이터 : " + list.get(3));
		
		Object data1 = 1;	//Object 는 자바에서 최상위 클래스.
		Object data2 = 1.1; // 
		
		int data3 = (int) data1;	// Object는 형변환을 해줘야함.
		double data4 = (double) data2;	// Object는 형변환을 해줘야함.
	}

}
