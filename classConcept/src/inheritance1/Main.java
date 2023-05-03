package inheritance1;

public class Main {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("김변수");
		emp.setAge(30);
		emp.setDept("직원");
		
		Professor pro = new Professor();
		pro.setName("이참조");
		pro.setAge(40);
		pro.setMajor("IT");
		
		Student stu = new Student();
		stu.setName("박객체");
		stu.setAge(50);
		stu.setSubject("자바");
		
		emp.info();System.out.println();
		pro.info();System.out.println();
		stu.info();
	}
}
