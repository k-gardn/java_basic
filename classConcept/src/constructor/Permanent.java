package constructor;

public class Permanent {
	private String name;
	private int salary;
	
	public Permanent(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

}
