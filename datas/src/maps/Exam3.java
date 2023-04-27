package maps;

import java.util.HashMap;

public class Exam3 {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>(); // 없는 키를 get하려고해도 에러가 나지 않는다.
		
		map.put("선풍기", 10);
		map.put("에어컨", 100);
		map.put("건조기", 100);
		
		System.out.println("선풍기 : " + map.get("선풍기") + "만원");
		System.out.println("에어컨" + map.get("에어컨") + "만원");
		System.out.println("건조기 : " + map.get("건조기") + "만원");
		System.out.println("없는키 : " + map.get("없는키") + "만원");
		
	}
}
