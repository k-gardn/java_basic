package sets;

import java.util.ArrayList;
import java.util.HashSet;

public class Exam01 {

	public static void main(String[] args) {
		// 순서 신경 쓰지 않음 => index 없음.
		// 중복 데이터 판별.
		// Iterator -> 향상 for문이 거의 대체함.
		// Hashset, treeset
		
		HashSet<String> hs = new HashSet<>();
		hs.add("라면"); //return 값이 True/false
		hs.add("김밥");
		hs.add("순대");
		hs.add("김밥"); //중복되면 false 리턴
		System.out.println("HashSet : " + hs);
		
		ArrayList<String> arr = new ArrayList<>();
		arr.add("라면");
		arr.add("김밥");
		arr.add("순대");
		arr.add("김밥");
		System.out.println("ArrayList : " + arr);
	}

}
