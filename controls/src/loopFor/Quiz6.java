package loopFor;


public class Quiz6 {

	public static void main(String[] args) {
		
		int i, j, total = 0;
		for( i = 1 ;i <= 5 ; i++ ) { //조건식이 없으면 true, 무한반복
			for( j = 1 ;j <= 5 ; j++ ) {
				System.out.print( i * j +"\t");
			} 
			System.out.println();
		}
		System.out.println();
		
		for( i = 1 ;i <= 5 ; i++ ) { //조건식이 없으면 true, 무한반복
			for( j = 1 ;j <= 5 ; j++ ) {
				total += 1;
				System.out.print(total+"\t");
			} 
			System.out.println();
		}
		
		//쌤 풀이.
//		System.out.println();
//		for(i = 1; i <= 21; i+=5) {
//			for(j = 0; j < 5; j++) {
//				System.out.print(i+j + "\t");
//			}
//			System.out.println();
//		}
		
		
	}
}
