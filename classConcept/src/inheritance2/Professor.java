package inheritance2;

public class Professor extends Person {
	
	private String major;
	
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void info() {
		System.out.println("이름 : " + getName());
		System.out.println("나이 : " + getAge());
		System.out.println("전공 : " + major);
	}
}
