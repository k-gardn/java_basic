package variables;

public class Exam7 {
	public static void main(String[] args) {
		int data = 123, result;
		
		data = data + 10; //123 + 10
		
		// 컴퓨터는 내부에 숫자로 저장하고 있고, 문자로 보여준 것.
		char ch = 'D'; // 0044(16진수) = 68(10진수)
//		ch = ch + 3; //현재 java는 int로 생각함. 따라서 2byte 공간(char)에 4byte 공간이(int) 못들어가.
		ch = (char)(ch + 3); //D E F G
		result = data + ch; // 204 = 133 + 'G'(= 68+3 = 71);
		
		System.out.println("data : " + data);
		System.out.println("ch : " + ch);
		System.out.println("ch : " + (int)ch); // (자료형)변수 : cast 연산자, casting한다. // 괄호안의 자료형으로 바뀐다.
		System.out.println("result :" + result); // 133 + 71 = 204
	}

}
