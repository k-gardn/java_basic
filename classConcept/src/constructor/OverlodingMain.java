package constructor;

public class OverlodingMain {

	public static void main(String[] args) {
		ArrayPrint ap = new ArrayPrint();
		int[] arr1 = {10,20,30};
		String[] arr2 = {"가", "나", "다"};
		double[] arr3 = {1.1, 2.2, 3.3};
		
		ap.print(arr1);
		ap.print(arr2);
		ap.print(arr3);
	}

}
