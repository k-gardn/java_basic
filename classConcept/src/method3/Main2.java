package method3;

public class Main2 {

	public static void main(String[] args) {
		
		/*
		 * static 
		 * : 프로그램이 시작 후 바로 준비됨
		 * 준비됨 == 메모리에 올려두어서 바로 실행 가능한 상태
		 * 사용목적 : 공용, 여러 곳에서 바로 접근해서 사용하기 위해
		 * 장점 : 바로 접근해서 사용.
		 * 메모리 공간자체는 작게 확보함.static붙은 것만 메모리위에올리기 때문에
		 * 단점 : 프로그램 시작부터 종료까지 메모리를 확보함.
		 * 메모리 - 장기간 소규모
		 * 
		 * new Sub2();
		 * 메모리에 Sub2안에 메서드를 모두 메모리 공간 확보.
		 * 장점 : 필요한 순간에 메모리 공간 확보,
		 * 사용되지 않으면 알아서 정리함(Garbage Collection)
		 * 단점 : 클래스가 갖고 있는 멤버들이 모두 메모리 공간 확보 
		 * 메모리 - 단기간 대규모
		 */
		
		//static 예약어를 사용하지 않은 경우
//		Sub2.method1(); // 사용 불가능
		Sub2 sub2 = new Sub2();	// 여러번 생성할 경우 static을 쓰는 것이 더 나음.
		
		Sub2 sub22 = new Sub2();  //가비지 컬렉터가 정리함
		Sub2 sub222 = new Sub2(); //가비지 컬렉터가 정리함
		
		sub2.method1();
		
		//static 예약어를 사용한 경우
		Sub2.method2(); // 사용가능
		
		/*
		 * new Sub2(); 
		 * 위와 같이 인스턴스 생성 후에도
		 * 사용가능하나 권장하지 않음.
		 */
		sub2.method2();
	}

}
