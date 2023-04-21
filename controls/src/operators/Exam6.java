package operators;

public class Exam6 {
	public static void main(String[] args) {
		int data1, data2, data3;
		
		data1 = 10;
		data2 = ++data1; // 연산자부터 처리함. data1이 +1 증가하고(= 11), data2에 대입
		
		data1 = 10; 
		data3 = data1++; // 연산자는 나중에 처리함. data3에 넣고, data1이 +1 증가(= 11)
		
		System.out.println("data1 =  " + data1);
		System.out.println("data2 =  " + data2);
		System.out.println("data3 =  " + data3);
		
		data1 = 10;
		data2 = 20; 
		
		int total = ++data1 + data2++; 
		// data2++ 후치 연산자는 제~~~일 나중에. 
		// 31 = 11 + 20
		System.out.println("total : " + total);
		System.out.println("data2 =  " + data2);

		
		for(int i = 0; i < 10; ++i) { //각각의 문장이기 때문에 전치, 후치 상관이 없음.
			System.out.print(i);
		}
	}
	
}