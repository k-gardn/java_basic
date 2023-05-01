package methodExam;

public class Three {
	private int data;
	
	//멤버필드, 멤버변수 값을 입력하는 기능
	public void setData(int data) {
		this.data = data; // 매개변수와 같은 멤버 변수 이름을 사용할 경우 this를 사용.
		// this : 자기 자신, three 인스턴스, 
		// this는 자기자신의 인스턴스의 참조 값
		/*
		 * Three three = new Three(); //three 는 참조 변수.
		 * this == three;
		 */
	}
	
	//멤버필드, 멤버변수 값을 출력하는 기능
	public int getData() {
		return data;
	}
	
	 public boolean result() {
		 
		 // 짝수 또는 홀수를 판별하는 데이터( 매개변수의 자료형 및 개수)
		 // 짝수 홀수 판별하는 기능
		 if(data % 3 == 0) {
			 return true;
		 }else {
			 return false;
		 }
		 
		 //else없이 이렇게 써도 됨.
//		 if(data % 3 == 0) {
//			 return true;
//		 return false;
		 
	 }
}
