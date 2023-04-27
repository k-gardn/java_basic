package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>();
		
		hs.add("1. 대부"); 
		hs.add("2. 반지의 제왕"); 
		hs.add("3. 겨울왕국"); 
		hs.add("4. 다크 나이트"); 
		hs.add("5. 해리포터"); 
		hs.add("6. 공공의 적"); 
		System.out.print(hs);
		
		Scanner input = new Scanner(System.in);
		System.out.print("삭제 할 책 : ");
		String name = input.nextLine();

		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			if(name.equals(it.next())){
				System.out.println("삭제 완료");
				it.remove();
			}
		}
		System.out.println();
		
//		hs.remove(name); //이거랑 사실상 같은 거임.
		input.close();
	}
}
