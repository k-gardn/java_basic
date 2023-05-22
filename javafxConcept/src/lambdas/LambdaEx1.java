package lambdas;

interface ILambdaEx1{
	void lambda();
}

class LambdaImplEx1 implements ILambdaEx1{
	@Override
	public void lambda() {
		System.out.println("메서드 호출");
	}
}

public class LambdaEx1 {
	public static void main(String[] args) {
		LambdaImplEx1 ex1 = new LambdaImplEx1();
		ex1.lambda();
	}
}
