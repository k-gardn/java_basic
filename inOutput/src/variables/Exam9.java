package variables;

public class Exam9 {
	public static void main(String[] args) {
		byte b = 97; // byte : 1byte
		short s = 20; // short : 2byte
		char c = 'A'; // char : 2byte
		
		float f = 1.23f; // float : 4byte
		
		s = b;
		
		c = (char)b; //char(0 ~ 65535), byte(-128 ~ 127) 
		// char는 음수를 커버하지 못해.
		s = (short)c; // char(0 ~ 65535), short(-32768 ~ 32767)
		
		double d = 5.11; // double : 8byte
		f = (float)5.11;
		f = (float)d; //변수 뒤에 f를 쓸 수는 없기 때문에. cast연산을 써주는 것.
		
		f = 1.123456789123123f;
		d = 1.123456789012345678;
		System.out.println(f); //float으로 변환했기 때문에 알아서 잘림.
		System.out.println(d);
		
		
	}

}
