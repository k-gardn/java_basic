package arrays;


public class Exam7 {

	public static void main(String[] args) {
		
		int arr[][] = new int[][] {
			{10, 20, 30, 40},
			{50, 60},
			{70, 80, 90}
		};
		
		System.out.println("행의 개수 : " + arr.length);
		System.out.println("0번째 행의 열 개수 : " + arr[0].length);
		System.out.println("1번째 행의 열 개수 : " + arr[1].length);
		System.out.println("2번째 행의 열 개수 : " + arr[2].length);
		
		for(int i=0; i < arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
	}
}



