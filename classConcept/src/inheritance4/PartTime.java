package inheritance4;

public class PartTime extends Employee{
	private int time;
	private int salary;
	
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
}
