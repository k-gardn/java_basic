package inheritance1;

public class Student {
	private String name;
	private int age;
	private String subject;
	
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void info() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("과목 : " + subject);
	}
	
}
