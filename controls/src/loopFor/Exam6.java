package loopFor;


public class Exam6 {

	public static void main(String[] args) {
		int i, j;
		for( i = 1 ;i <= 5 ; i++ ) { //조건식이 없으면 true, 무한반복
			for( j = 1 ;j <= 5 ; j++ ) {
				System.out.println("i: " + i + ", j: " + j);
			} 
			System.out.println();
		}
	}
}
