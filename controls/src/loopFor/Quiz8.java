package loopFor;


public class Quiz8 {

	public static void main(String[] args) {
		//2에서 부터 입력된 어떤 수까지 내에 있는 소수를 찾는 프로그램을 작성하라.
		
		int i, j;
		/*
		 * 1 ~ 1000 사이에 있는 자연수에 대하여 자기 자신의 수를 제외한
		 *  모든 약수의 합이 자신과 같아지는 수(완전수)를 구하여라. 
		 *  예) 6의약수 = 1, 2, 3, 6 
		 *  1+2+3 = 6(완전수)
		 */
		
		for(i = 1; i <= 1000; i++) {
			int total = 0;
			for(j = 1; j < i; j++) {
				if(i % j == 0) {
					total += j; // 약수의 합 
				}
			}
			if(total == i)
				System.out.print(i + " ");
		}
		
	}
	
	
}



	
