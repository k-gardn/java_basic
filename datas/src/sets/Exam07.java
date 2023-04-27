package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Exam07 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1. 대부"); 
		hs.add("2. 반지의 제왕"); 
		hs.add("3. 겨울왕국"); 
		hs.add("4. 다크 나이트"); 
		hs.add("5. 해리포터"); 
		hs.add("6. 공공의 적"); 
		
		ArrayList<String> list = new ArrayList<>(hs);
		System.out.println(list);
//		list.sort(null);	//오름 차순으로 정렬해줌.
//		System.out.println(list);
		
		System.out.println("sort");
		Collections.sort(list); //오름 차순으로 정렬해줌.
		System.out.println(list);
		
		System.out.println("reverse");
		Collections.reverse(list); //오름 차순 되어 있는 데이터를 내림 차순으로 변경.
		System.out.println(list);
	}
}
