package lambdas;

interface ILambdaEx2{
	void lambda();
}

public class LambdaEx2 {
	public static void main(String[] args) {
		// 익명 중첩 => JAVA에서 주로 사용.
		// 구현 없이 쓰기 때문에 익명이라고 함.
		// 1. 메서드의 구현 내용이 자주 변경되는 경우
		// 2. 이 안에서만 인스턴스를 사용할 것이다.
		
		// 추상 메서드가 구현되어있지 않기 때문에 인스턴스를 만들고 그 안에 구현함.
		ILambdaEx2 ex2 = new ILambdaEx2() {
			@Override
			public void lambda() {
				System.out.println("메서드 호출");
			}
		};
		ex2.lambda();
		
		ex2 = new ILambdaEx2() {
			@Override
			public void lambda() {
				System.out.println("다른 내용으로 변경하여 구현된 메서드 호출");
			}
		};
		ex2.lambda();
	}

}
