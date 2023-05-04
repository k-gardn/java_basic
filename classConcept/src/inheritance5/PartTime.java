package inheritance5;

//  implements IEmployee 반드시 구현해야하는 것.
public class PartTime extends Employee implements IEmployee{
	// 클래스는 단일 상속 가능. (Object + 개발자가 선택한 class)
	// 인터페이스는 다중 상속 가능.
	private int time;
	private int salary;
	public static final double PI = 3.14; // 대문자로 표현. final: 바꿀 수 없음.
	
	public PartTime(String name, int time, int salary) {
//		super(); // 부모의 생성자를 호출. 부모 인스턴스의 참조값을 가짐.
//		this();  // 자신의 생성자를 호출.
		super.setName(name); // 자신의 인스턴스의 참조값을 가짐.
		this.time = time;
		this.salary = salary;
	}


	public int getSalary() {
		return time * salary;
	}


	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void method2() {
		// TODO Auto-generated method stub
		
	}
}
