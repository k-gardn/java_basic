package arrays;

public class Quiz1 {

	public static void main(String[] args) {
		int[] arr = {10,54,13,17,25,30};
		String[] msg = {"짝수", "홀수"};
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(msg[(arr[i] % 2)] +" : "+ arr[i]);
//			if(arr[i] % 2 == 0)
//				System.out.println("짝수 :" + arr[i]);
//			else
//				System.out.println("홀수 :" + arr[i]);
			
		}
	}
}



