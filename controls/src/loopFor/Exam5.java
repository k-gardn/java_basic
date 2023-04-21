package loopFor;


public class Exam5 {

	public static void main(String[] args) {
		int i, j, sum = 0;
		for( i = 1 ;i <= 3 ; i++ ) { //조건식이 없으면 true, 무한반복
			for( j = 1 ;j <= 5 ; j++ ) {
				sum += 1;
			}
		} 
		System.out.println("sum: " + sum);
	}
}
