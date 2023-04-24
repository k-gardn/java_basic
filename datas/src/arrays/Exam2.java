package arrays;

public class Exam2 {

	public static void main(String[] args) {
		int[] arr = new int[5];
		
		for(int i = 0; i <5 ; i++) {
			arr[i] = 100 * (i + 1);
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("arr["+ i +"] : " + arr[i]);
		}
	}

}
