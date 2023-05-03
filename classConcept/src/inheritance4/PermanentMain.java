package inheritance4;

import java.util.ArrayList;

public class PermanentMain {

	public static void main(String[] args) {
		
		//다형성
//		Employee emp1 = new Permanent("김변수", 3000000);
//		Employee emp2 = new Permanent("이상수", 3000000);
//		Employee emp3 = new Permanent("박참조", 3000000);
//		Employee emp4 = new PartTime("김파트", 160, 9500);
//		Employee emp5 = new PartTime("이파트",  160, 10000);
//		Employee emp6 = new PartTime("박파트",  160, 15000);
		
		ArrayList<Employee> emps = new ArrayList<>();
		
		emps.add(new Permanent("김변수", 3000000));
		emps.add(new Permanent("이상수", 4000000));
		emps.add(new Permanent("박참조", 5000000));
		emps.add(new PartTime("김파트", 160, 9500));
		emps.add(new PartTime("이파트",  160, 10000));
		emps.add(new PartTime("박파트", 160, 15000));
		
		for(Employee emp : emps) {
			System.out.println("이름 : " + emp.getName());
			
			// 1. 오버라이드(부모에는 없는 자식의 메서드를 정의 해줘서, 자식이 오버로드 메서드가 정의되도록.
//			System.out.println("급여 : " + emp.getSalary()+ "원");
			
			// 2. 형변환
			if(emp instanceof Permanent) {
				Permanent p = (Permanent)emp;
				System.out.println("급여 : " + p.getSalary()+ "원");
			}else {
				PartTime p = (PartTime) emp;
				System.out.println("급여 : " + p.getSalary()+ "원");
			}
		}
		
		
//		System.out.println("이름 : " + emp1.getName()); //참조값에서 매서드 찾기.
//		System.out.println("급여 : " + emp1.getSalary()+ "원");
//		
//		System.out.println("이름 : " + emp2.getName());
//		System.out.println("급여 : " + emp2.getSalary()+ "원");
//		
//		System.out.println("이름 : " + emp3.getName());
//		System.out.println("급여 : " + emp3.getSalary()+ "원");
//		
//		System.out.println("이름 : " + emp4.getName()); //참조값에서 매서드 찾기.
//		System.out.println("급여 : " + emp4.getSalary()+ "원");
//		
//		System.out.println("이름 : " + emp5.getName());
//		System.out.println("급여 : " + emp5.getSalary()+ "원");
//		
//		System.out.println("이름 : " + emp6.getName());
//		System.out.println("급여 : " + emp6.getSalary()+ "원");
	}

}
