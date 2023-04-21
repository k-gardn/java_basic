package operators;

public class Exam4 {
	public static void main(String[] args) { //논리 연산자
		
		 System.out.println("false || false : " + (false || false));
		 System.out.println("false || true : " + (false || true));
		 System.out.println("true || false : " + (true || false)); // bad coding.왼쪽이 true이기 때문에 뒤에 볼 필요가 없이 true.
		 System.out.println("true || true : " + (true || true));	// bad coding.왼쪽이 true이기 때문에 뒤에 볼 필요가 없이 true.
		 System.out.println();
		 
		 System.out.println("false && false : " + (false  &&  false));	// bad coding.왼쪽이 false이기 때문에 뒤에 볼 필요가 없이 false.
		 System.out.println("false && true : " + (false  &&  true));	// bad coding.
		 System.out.println("true && false : " + (true  &&  false));
		 System.out.println("true && true : " + (true  &&  true));
		 System.out.println();
		 
		 System.out.println("!true : " + !true );
		 System.out.println("!false : " + !false );
		 
		 
	}
	
}
