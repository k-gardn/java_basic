package sets;

import java.util.HashSet;

public class Exam03 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		boolean bool;
		bool = hs.add("라면"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		bool = hs.add("현대인"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		
		System.out.println("HashSet : " + hs);
		System.out.println(hs.remove("라면")); //true
		System.out.println(hs.remove("김밥")); //false
		System.out.println("HashSet : " + hs);
	}

}
