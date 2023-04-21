package loopWhile;

import java.util.Random;

public class Exam4 {

	public static void main(String[] args) {
		 // 램덤 데이터를 만드는 방법
		Math.random(); // 실수형, double
		
		
		int begin = 11;
		int end = 30;
		for(int i = 0; i <5; i++) {
			System.out.println(Math.random());
		}
		for(int i = 0; i <5; i++) {
//			System.out.println((int) (Math.random() * 10)); // 0 ~ 9
//			System.out.println((int) (Math.random() * 10 + 10)); // 10 ~ 19
//			System.out.println((int) (Math.random() * 20)); // 0 ~ 19
//			System.out.println((int) (Math.random() * 20) + 50 ); // 50 ~ 69
//			System.out.println((int) (Math.random() * (3788 - 21 + 1)) + 21 ); // 21 ~ 3788
			System.out.println((int) (Math.random() * (end - begin + 1)) + begin ); // begin ~ end // 공식.
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		Random r = new Random(); 
		r.nextBoolean();
		r.nextDouble();
		r.nextFloat();
		r.nextInt();
		r.nextLong();
		
		for(int i=0; i < 5; i++) {
			System.out.println(r.nextInt(10)); // 0 포함 10개. 0~9
			System.out.println(r.nextInt(10) + 10); // 0 포함 10개. 0~9
			System.out.println(r.nextInt(end - begin + 1) + begin); // 0 포함 10개. 0~9
		}
		
	}
}

