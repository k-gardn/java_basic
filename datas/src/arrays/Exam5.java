package arrays;

public class Exam5 {

	public static void main(String[] args) {
		int[] arr = {4,8,2,7,6};
		int i, j, tmp;
		
		for(i=0; i< arr.length-1; i++) {
			for(j=i+1; j<arr.length;j++) {
//				if(arr[i] > arr[j]) { //오름차순
				if(arr[i] < arr[j]) { //내림차순
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		for(i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}



