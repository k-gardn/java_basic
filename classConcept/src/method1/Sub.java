package method1;

public class Sub {

		 
		// 접근제어자 ( 예약어 ) 반환자료형 메서드이름(매개변수들){
		//	메서드가 수행할 기능
		//	}
		public void printMethod() {
			System.out.println("method1 안에 printMethod()");
		}
		
		public String printMethod2(String data) {
			if(data.isEmpty()) {
				System.out.println("문자열이 비어있다.");
				return "빈문자열은 허용되지 않아"; //return 을 만나는 순간 메서드를 빠져나간다.
			}else if(data.equals(" "))
				return "공백은 안됨";
			System.out.println("매개변수 : "+ data);
			return "조건에 맞는 데이터가 입력 됨";
		}
		public int add(int data1, int data2) {
			System.out.println("매개변수1 : "+ data1);
			System.out.println("매개변수2 : "+ data2);
			int total = data1 + data2;
			return total;
		}
}
