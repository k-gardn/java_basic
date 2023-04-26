package strings;

public class Exam1 {

	public static void main(String[] args) {
		String data1 = "문자열";
		String data2 = new String("문자열");
		
		char[] datas = {'문', '자', '열'};
		String data3 = new String(datas);
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
	}

}
