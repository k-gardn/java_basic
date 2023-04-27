package sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Quiz01 {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
//		HashSet을 이용하여 로또 번호 6개 출력하기(1-45)
		
		while(hs.size() <6 ) {
			hs.add((int)(Math.random() * 45) + 1);
		}
		
		System.out.println(hs);
		
		ArrayList<Integer> list = new ArrayList<>(hs);
		list.sort(null);
		System.out.println(list); //오름차순 정렬.
		
		//쌤 풀이
//		Random r = new Random();
//		HashSet<Integer> lotto = new HashSet<>();
//		
//		while(lotto.size() != 6)
//			lotto.add(r.nextInt(45) + 1);
		
	}
}
