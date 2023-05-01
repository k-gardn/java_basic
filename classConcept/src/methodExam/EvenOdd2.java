package methodExam;

public class EvenOdd2 {
	//private : 현재 인스턴스 안에서만 접근 가능
	//인스턴스 : 클래스를 실행한 상태
	// 안에서만 접근 가능 : 멤버 메서드와 같은 멤버들만 접근 가능
	private int data;
	 
	//멤버필드, 멤버변수 값을 입력하는 기능
	public void setData(int data) {
		this.data = data;
	}
	
	//멤버필드, 멤버변수 값을 출력하는 기능
	public int getData() {
		return data;
	}
	
	 public boolean tests() {
		 
		 // 짝수 또는 홀수를 판별하는 데이터( 매개변수의 자료형 및 개수)
		 // 짝수 홀수 판별하는 기능
		 if(data % 2 == 0) {
			 return true;
		 }else {
			 return false;
		 }
		 // 결과는 어떻게 돌려줄지? boolean, 출력, 출력 문자열
		 
	 }
}
