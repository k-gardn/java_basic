package inheritance4;

/*
 * 추상(abstract) 클래스 : 추상 메서드는 한개 이상 포함하고 있을 때
 */

public abstract class Employee {
	//부모임.
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 * 추상메서드: 내용이 구현되지 않은 메서드
	 * - 자식에게 내용을 '강제'로 구현하도록 만든다는 의미. 
	 * 자식은 오버라이드를 반드시 해야함.
	 */	
	public abstract int getSalary();
	
	// 메서드 : 강제성이 없다.
//	public int getSalary() {
//		return 0;
//	}

}
