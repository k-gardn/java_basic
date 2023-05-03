package inheritance1;

public class Professor {
	private String name;
	private int age;
	private String major;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("전공 : " + major);
	}
}
