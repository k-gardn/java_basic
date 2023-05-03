package constructor;

public class ArrayPrint {
	
	/* 
	 * 오버로딩(over loding) 
	 * 매개변수의 개수가 같으면 자료형으로 구분되어야함
	 * 매개변수의 개수가 같고, 자료형이 같을 때 변수이름으로는 구분할 수 없음.
	 * */
	
	public void print(int[] arr) {
		for(int i : arr)
			System.out.println(i + " ");
		System.out.println();
	}

	public void print(String[] arr) {
		for(String s : arr)
			System.out.println(s + " ");
		System.out.println();
		
	}

	public void print(double[] arr) {
		for(double d : arr)
			System.out.println(d + " ");
		System.out.println();
	}

}
