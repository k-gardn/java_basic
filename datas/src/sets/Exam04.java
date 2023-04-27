package sets;

import java.util.HashSet;

public class Exam04 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		System.out.println("isEmpty() : " + hs.isEmpty());
		boolean bool;
		bool = hs.add("라면"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		bool = hs.add("현대인"); System.out.println(bool);
		bool = hs.add("고길동"); System.out.println(bool);
		
		System.out.println("isEmpty() : " + hs.isEmpty());
		
		if(hs.contains("고길동")) {
			System.out.println("데이터가 존재합니다.");
		}else {
			System.out.println("데이터가 존재하지 않습니다.");
		}
	}
}
