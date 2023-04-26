package strings;

public class Quiz3 {

	public static void main(String[] args) {
		/*
		 * FF590-2DX83-M81LZ-XDM7E-MKUT4 문자열에 있는 정수의 합계를 구하세요.
		 * ex) 590 + 283 + 81 + 7+ 4 = 965
		 * */
		
		String str = "FF590-2DX83-M81LZ-XDM7E-MKUT4";
		String[] strArr = str.toUpperCase().split("-");
		 
//		System.out.println((int) 'A');
//		System.out.println((int) 'Z');
		
		//각 문자열에서 알파벳을 replace한다.
		// 그러려먼 split("")을 하고
		int sum = 0;
		
		
		for(int i = 0; i < strArr.length; i++) {
//			System.out.println(strArr[i]);
			String numStr = "";
			String[] eachAlpha = strArr[i].split("");
			for(int j = 0; j < eachAlpha.length ; j++) {
				if((char) eachAlpha[j].charAt(0) < 65 || (char) eachAlpha[j].charAt(0) > 90) {
					numStr += eachAlpha[j];
				}
//				System.out.println(eachAlpha[j]);
			}
//			strArr[i].replace(0, 0);
//			System.out.println(numStr);
			sum += Integer.parseInt(numStr);
		}
		
		System.out.println(sum);
		
	}
}
