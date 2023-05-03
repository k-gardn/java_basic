package constructor;

public class PartTime {

	//3명의 이름, 시간, 시급 입력
	private String name;
	private int time;
	private int salary;
	
	public PartTime(String name, int time, int salary) {
//		super(); // 부모의 생성자를 호출. 부모 인스턴스의 참조값을 가짐.
//		this();  // 자신의 생성자를 호출.
		this.name = name; // 자신의 인스턴스의 참조값을 가짐.
		this.time = time;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return time * salary;
	}
	
}
