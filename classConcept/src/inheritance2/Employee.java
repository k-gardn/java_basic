package inheritance2;

public class Employee extends Person {
	private String dept;
	
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void info() {
		System.out.println("이름 : " + super.getName()); // 부모를 명시해줄수도 있음.
		System.out.println("나이 : " + getAge());
		System.out.println("부서 : " + dept);
	}
}
