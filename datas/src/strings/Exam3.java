package strings;

public class Exam3 {

	public static void main(String[] args) {
		String str = "abc defg";
		
		System.out.println(str.length());
		System.out.println(str.charAt(str.length()-1));
		System.out.println(str.charAt(0) == 'a');
		System.out.println(str.charAt(0) == 'c');
		System.out.println(str.charAt(0) - 32);
		System.out.println((char) (str.charAt(0) - 32));
		
		String addStr;
		addStr = "";
		System.out.println(addStr);
		addStr += "b";
		System.out.println(addStr);
	}

}
