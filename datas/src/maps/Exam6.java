package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Exam6 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>(); // 없는 키를 get하려고해도 에러가 나지 않는다.
		
		map.put("선풍기", "10");
		map.put("에어컨", "100");
		map.put("건조기", "100");
		
		Iterator<String> itk = map.keySet().iterator();
		while(itk.hasNext()) { //그 공간에 값이 있냐?  T/F.
			String key = itk.next(); // 그 공간 안의 데이터를 가져옴
			System.out.println(key + " : " + map.get(key));
		}
		
		System.out.println();
		for(String k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		System.out.println();
		Iterator<String> itv = map.keySet().iterator();
		while(itv.hasNext()) {
			String value = itv.next();
			System.out.println(value + " : " + map.get(value));
		}
		
		System.out.println();
		for(String v : map.values()) {
			System.out.println(v);
		}
		
	}
}
