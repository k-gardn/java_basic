package operators;

public class Exam1 {

	public static void main(String[] args) {
		int data1 = 9, data2 = 2;
		
		System.out.println(data1 + " + " + data2 + " = " + (data1 + data2));
		System.out.println(data1 + " - " + data2 + " = " + (data1 - data2));
		System.out.println(data1 + " * " + data2 + " = " + (data1 * data2));
		System.out.println(data1 + " / " + data2 + " = " + (data1 / data2));
		System.out.println(data1 + " % " + data2 + " = " + (data1 % data2));

		/* 
		 * x % 2 = 0
		 * x % 3 = 0
		 * x % 4 = 0
		 * x % 5 = 0
		 * 
		 * 
		 * x % 3 = 0,1,2
		 * x % 4 = 0,1,2,3
		 * x % 100 = 0~99
		 * 
		 * x % 7 = 0~6
		 * 
		 * 7 % (2~6) = 0이 아닌 값만 나머지로 나온다면, 소수다.
		 * 8 % (2~7) = 0이 나머지로 나온다면 소수가 아니다.
		 * 
		 * 암호학 쪽에서 쓸 일이 있을 수 있음.
		 *  */
	}

}
