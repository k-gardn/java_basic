package lambdas;

interface ILambdaEx4{
	void lambda(int data);
}

public class LambdaEx4 {
	public static void main(String[] args) {
		
		ILambdaEx4 ex4 = (tmp) -> {
			for(int i = 0; i < tmp; i++)
				System.out.println( i + 1 + "메서드 호출");
		};
		ex4.lambda(5);
		
		ex4 = tmp -> {	//매개 변수가 1개일 때는 소괄호 하지 않아도 잘 된다.
			for(int i = 0; i < tmp; i++)
				System.out.println( i + 1 + "메서드 호출");
		};
		ex4.lambda(5);
	}
}
