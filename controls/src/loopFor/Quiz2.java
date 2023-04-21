package loopFor;


public class Quiz2 {

	public static void main(String[] args) {
		
		// 1~1000까지의 합을 구하시오. 단 3의 배수는 제외하고 3의 배수이면서 5의 배수는 제외하지 않는 조건으로 구하시오.
		int i = 1, total = 0;
		
		for(i = 1 ; i<= 1000 ; i++) { 
			if(i % 3 != 0)
				total = total + i;
			else if(i % 15 == 0) //else if(i % 5 ==0)으로 해도 같은 말임. 이미 3의 배수 인 수이기 때문에.
				total = total +i;
		} 
		System.out.println(total);
		
		
		// 1 부터 시작하여 홀수의 합을 구하면서 그 합이 10000을 넘지 않는 마지막 홀수를 구하는 프로그램을 작성하시오.
		total = 0;
		for(i = 1 ; total <= 10000 ; ++i) { 
			if(i % 2 != 0) {
				total += i;
			}
//			if(total >= 10000) {
//				System.out.println(i);
//				break;
//			}
		} 
		System.out.println(i-3);
		
		//쌤 풀이
//		for(i = 1; ; i+=2) {
//			total +=i;
//			if(total >= 10000)
//				break;		// 소속되어있는 for문 한개만 탈출한다.
//		}
		total = 1;
		for(i = 1; ; i+=2) {
		total +=i;
		if(total >= 8)
			break;		// 소속되어있는 for문 한개만 탈출한다.
		}
		System.out.println(i);
		
		// 1+ 3 + 5 + ... + 199 = 10000 이때, 
		// 200은 total을 바꾸지 못하고. 201로 넘어감.
		// 201까지 더했더니 total = 10201 이 나옴. 
		// 조건식 -> 실행문 -> 증감식 이기 때문에 i가 1증가해서 202. 
		// 조건식의 참/거짓 여부를 가림.
		
		
	}

	
}
