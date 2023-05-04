package inheritance5;

// 추상 메서드들을 갖고있는 클래스를 인터페이스라고 함. -> 가이드(스케치)를 잡는다는 개념.
// 반드시 구형해야하는 메서드.(강제성)

// 내용이 구현되지 않기 때문에 클래스가 아니라 인터페이스라고 함.
public interface IEmployee {
	
	/* 
	 *  public abstract void method1(); 
	 *  public abstract 생략가능
	 * 
	 */
	// 머리를 만들어줄테니, 내용은 구현해라.
	// 개발자들 사이에 약속 같은 느낌.
	void method1();
	void method2();
	int getSalary();
	
	/* 
	 * 상수와 같은 형식의 데이터를 변수로 만들어 쓸 때 사용함. 
	 * public static final double PI = 3.14;
	 * public static final는 생략 가능.
	 */
	
//	double PI; 존재의 의미가 없음
	double PI = 3.14;
}

