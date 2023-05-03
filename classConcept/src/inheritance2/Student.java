package inheritance2;

public class Student extends Person {
	private String subject;
	

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void info() {
		System.out.println("이름 : " + super.getName());
		System.out.println("나이 : " + getAge());
		System.out.println("과목 : " + subject);
	}
	
}
