package inheritance2;

public class Employee extends Person {
	
	/* extends를 사용하여 Person을 상속받겠다. 
	 * Employee : 자식
	 * Person : 부모
	 * */
	
	private String dept;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void info() {
		/*
		 * private String name; 에 접근할 수 없기 때문에 
		 * public String getName 으로 접근.
		 */	
		
		/* 예약어 : super, this 
		 * 부모와 자식이모두 같은이름의 메서드를 가지고 있을 경우
		 * */
		System.out.println("부서 : " + dept);
		System.out.println("이름 : " + super.getName()); // super로 부모를 명시해줄수도 있음.
		System.out.println("나이 : " + this.getAge());	
	}
}
