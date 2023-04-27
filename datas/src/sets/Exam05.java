package sets;

import java.util.HashSet;
import java.util.Iterator;

public class Exam05 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1. 대부"); 
		hs.add("2. 반지의 제왕"); 
		hs.add("3. 겨울왕국"); 
		hs.add("4. 다크 나이트"); 
		hs.add("5. 해리포터"); 
		hs.add("6. 공공의 적"); 
		

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			String data2 = it.next();
			System.out.println(data2);
		}
		System.out.println();
		
		//향상 for문이 더 나중에 나온 메서드. 이게 더 코드가 간결해서 이거를 쓰면 됌.
		for(String data : hs) {
			System.out.println(data);
		}
	}
}
