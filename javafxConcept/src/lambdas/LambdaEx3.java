package lambdas;

interface ILambdaEx3{
	void lambda();
}

public class LambdaEx3 {
	public static void main(String[] args) {
		// 람다식 사용 전제 조건 : 
		// 1. 하나 밖에 없는 추상메서드를 갖는 인터페이스를 갖는 경우
		// 2. 메서드의 구현 내용이 자주 변경되는 경우
		
		// 람다식을 사용할 수 있음.
		
		// () : 매개변수
		// -> : 람다
		// {} : 메서드 구현
		ILambdaEx3 ex3 = () -> {
			System.out.println("메서드 호출");
		};
		ex3.lambda();
		
		ex3 = () -> {
			System.out.println("다른 내용으로 변경하여 구현된 메서드 호출");
		};
		ex3.lambda();
	}

}
