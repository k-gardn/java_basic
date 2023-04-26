package strings;

public class Exam2 {

	public static void main(String[] args) {
		String data1 = "Java is Easy. 그리고 programming 할만하다2222.";
		String data2;
		
		System.out.println("출력 : "+ data1);
		data2 = data1.toUpperCase();
		System.out.println("변환 후 : " + data2);
		
		data2 = data1.toLowerCase();
		System.out.println("변환 후 : " + data2);
		
		data1.toLowerCase();
		System.out.println("출력 : " + data1);
	}

}
