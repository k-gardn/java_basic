package maps;

import java.util.HashMap;
import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<>(); // 없는 키를 get하려고해도 에러가 나지 않는다.
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.print("키 입력 : "); String key = sc.next();
		System.out.print("값 입력 : "); int value = sc.nextInt();
		
		System.out.println(map);
		System.out.println(key + "키 검색 결과 : " + map.containsKey(key));
		System.out.println(value + "값 검색 결과 : " + map.containsValue(value));
		
	}
}
