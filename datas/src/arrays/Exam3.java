package arrays;

public class Exam3 {

	public static void main(String[] args) {
//		int[] arr = new int[] {10,20,30,40,50};
		int[] arr = {10,20,30,40,50};
		
		for(int i = 0; i < 5; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		}
		
		System.out.println();
		arr = new int[] {10,20,30,40};
		for(int i = 0; i < arr.length; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		}
		
		System.out.println();
		String[] strs = {"김변수", "이상수", "박참조"};
		for(int i = 0; i < strs.length; i++) {
			System.out.println("strs["+ i +"] : " + strs[i]);
		}
		
	}

}
