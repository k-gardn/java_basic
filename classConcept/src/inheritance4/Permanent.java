package inheritance4;

public class Permanent extends Employee {
	private int salary;
	
	public Permanent(String name, int salary) {
		setName(name);
		this.salary = salary;
	}


	// 재정의(오버 라이드) : 부모가 준 메서드의 머리는 그대로, 내용은 교체 할 수 있다.
	// 리던 자료형 재정의 못함.
	
	@Override
	public int getSalary() {
		return salary;
	}
}
