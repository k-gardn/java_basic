package loopFor;


public class Quiz {

	public static void main(String[] args) {
		
		int i = 1, total = 0;
		
		for(i = 1 ; i<= 5 ; i++) { 
			System.out.println(i + ". hello");
		} 
		System.out.println();
		
		
		for(i = 1 ; i <= 100 ; i++) { 
			total = total + i;
			if( total == 528)
				System.out.println("i의 합은 "+ total + "이다.");
		} 
		System.out.println();
		
		
		for(i = 1 ; i <= 25 ; i++) { 
			System.out.print(i + "\t");
			if(i % 5 == 0)
				System.out.println();
		} 
	}

	
}
