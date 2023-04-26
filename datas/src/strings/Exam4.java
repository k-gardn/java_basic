package strings;

public class Exam4 {

	public static void main(String[] args) {
		String str = " Have a nice day   ";
		
		String result = str.trim();
		
		System.out.println("--" + str + "--");
		System.out.println("--" + result + "--");
		System.out.println();
		
		String[] split = result.split(" "); //공백을 기준으로 나눠줘. 배열로 반환
		
		for(int i = 0; i < split.length ; i++) {
			System.out.println(split[i]);
			}
		System.out.println();
		// 향상 for문
//			for(변수 : 데이터들) {
//				
//			}
		System.out.println("향상 for문 결과");
		for( String data : split) { // index가 필요한 경우는 사용하지 못함.
			System.out.println(data);
		}
		
		System.out.println();
		
		String replace = result.replace(" ", "^");
		System.out.println("result : " + result);
		System.out.println("replace : " + replace);
		
	}
}
