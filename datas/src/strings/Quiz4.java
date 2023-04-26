package strings;

public class Quiz4 {

	public static void main(String[] args) {
		/*
		 * FF590-2DX83-M81LZ-XDM7E-MKUT4 문자열에 있는 정수의 합계를 구하세요.
		 * ex) 590 + 283 + 81 + 7+ 4 = 965
		 * */
		
		String str = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		String[] strArr = str.toUpperCase().split("-");
		 
		int sum = 0;
		
		
		for(int i = 0; i < strArr.length; i++) {
			String tmp = strArr[i].replaceAll("[^0-9]", ""); //정규표현식. (^ : 제외하기)
			sum = sum + Integer.parseInt(tmp);
		}
		
		System.out.println("합계 : " + sum);
		
	}
}
