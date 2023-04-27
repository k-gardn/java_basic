package sets;

import java.util.HashSet;

public class Exam02 {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(123); //return 값이 True/false
		hs.add(1.23);
		hs.add("순대");
		hs.add(1.23); //중복되면 false 리턴
		System.out.println("HashSet : " + hs);
	}

}
