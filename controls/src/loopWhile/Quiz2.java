package loopWhile;


public class Quiz2 {

	public static void main(String[] args) {
		
		 //쌀 102통(1통 = 1kg). 쌀을 먹고 증가함. 0으로 떨어짐. 현재 쥐는 2마리. 하루에 20kg씩 먹음. 10일마다 2배씩 증가.
		//쥐는 총 몇마리인가?
		// 2마리 
		// 10일
		int mouse = 2; 
		int rice = 102000;
		 while(rice > 0) {
			 int day = 10;
			 while(day > 0) {
				 rice = rice - mouse * 20;
				 day--;
				 
//				 System.out.println(day);
//				 System.out.println(count);
			 }
//			 System.out.println(day);
			 mouse = mouse * 2; 
		 }
		 System.out.println("쥐는 총 " + mouse + " 마리 이다.");
		// 쌤 풀이 
//		 int rice = 102 * 1000;
//			int mouse = 2;
//			int day = 0;
//			while(true) {
//				day++;
//				rice = rice - mouse * 20;
//				
//				if(day % 10 == 0)
//					mouse *= 2;
//				
//				if(rice <= 0) 
//					break;
//			}
		 
		 // 1*2 - 2*3 + 3 *4 - 와 같은 규칙으로 합계를 구할 때 합이 100이 넘는 마지막 수 2개를 구하는 프로그램 작성하라.
		 //앞에가 짝수이면 - , 앞이 홀수이면 +
		 // 
		 int sum = 0;
		 int n = 0;
		 while(sum <= 100) {
			 n++;
			 if(n % 2 != 0) {
				 sum +=  n * (n+1);
			 }
			 else {
				 sum -=  n * (n+1);
			 }
//			 System.out.println(sum + n);
			 
		 }
		 
		 //쌤 풀이
//		 while(true) {
//				if(data % 2 == 1) {
//					total = total + data * (data+1);
//				}else {
//					total = total - data * (data+1);
//				}
////				System.out.println(data + " x " + (data+1) + " = " + total);
//				if(total > 100)
//					break;
//				
//				data++;
//			}
		 System.out.println(n +" 과 " + (n+1) +"이다." );
//		 System.out.println(sum);
		 
	}

}
