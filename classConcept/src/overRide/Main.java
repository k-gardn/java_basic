package overRide;

public class Main {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
//		test1(child1);
//		test2(child2);
		
		test(child1);
		System.out.println();
		test(child2);
	}
	
	public static void test(Parent p) {
		p.method1();
		p.method2();

//		Exception in thread "main" java.lang.ClassCastException
//		Child1 child1 = (Child1)p;
//		Child2 child2 = (Child2)p;
//		child1.method3();
//		child2.method3();
		
		if (p instanceof Child1) {
			Child1 child1 = (Child1)p;
			child1.method3();
		}else if(p instanceof Child2) {
			Child2 child2 = (Child2)p;
			child2.method3();
		}
//		p.method3();
	}
	
//	public static void test1(Child1 child1) {
//		child1.method2();
//		child1.method3();
//	}
//	public static void test2(Child2 child2) {
//		child2.method2();
//		child2.method3();
//
//	}

}
