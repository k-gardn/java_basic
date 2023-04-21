package loopFor;


public class Quiz5 {

	public static void main(String[] args) { //구구단
		int i, j;
		for( i = 1 ;i <= 9 ; i++ ) { //조건식이 없으면 true, 무한반복
			for( j = 1 ;j <= 9 ; j++ ) {
			
				System.out.println( i + " x "+  j + " = " + (i * j));
			} 
			System.out.println();
		}
		// 디버거 도구로 디버깅: 버그를 잡는 용도, 문법 에러 X.
		// 변수들이 왜 이렇게 되는지 모르겠을 때
		// 남의 코드를 해석할 때 사용하기도 좋음. 왜 이렇게 나오는건지.
		/*
		 * 디버깅 순서 
		 * 1. 브레이크 포인트 설정(Ctrl + Shift + b) 
		 * 2. 디버깅 시작(F11) 
		 * 3. 한 줄씩 실행(F6)
		 * 4. 디버깅 종료(Ctrl +F2)
		 */
		
	}
}
