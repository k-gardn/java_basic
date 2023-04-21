package operators;

public class Exam9 {
	public static void main(String[] args) { //비트 연산자
		// 1byte = 8bit
		int data = 1;
		//shift 비트 연산 (조건 : 1의 비트를 잃어버리지 않는다.)
		
		//  << 1 : 비트를 왼쪽으로 한칸 밀어주세요. (= X2 )
		/*
		 * 0000 0010
		 *  data = data << 1 
		 * 0000 0001 
		 * 
		 * data <<= 1; 
		 * 0000 0100 
		 * data <<= 3; 
		 * 0010 0000
		 */		
		data = data << 1;
		System.out.println("1. data <<= 1 : " + data);
		data <<= 1;
		System.out.println("2. data <<= 1 : " + data);
		data <<= 3;
		System.out.println("3. data <<= 3 : " + data);
		
		/* 
		 *   >>= : 비트를 오른쪽으로 한칸 밀어주세요. (= %2)
		 * 
		 * 0010 0000(32)
		 * 
		 * data >>= 1;
		 * 0001 0000(16)
		 * 
		 * data >>= 1;
		 * 0000 1000(8)
		 *  */
		
		System.out.println();
		data >>= 1;
		System.out.println("1. data >>= 1 : " + data);
		data >>= 1;
		System.out.println("2. data >>= 1 : " + data);
		data >>= 1;
		System.out.println("3. data >>= 1 : " + data);
	}
	
}
