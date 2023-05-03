package constructor;

public class Student {

	private String name; //class는  null이 기본적으로.
	private int kor, eng , math, total ; // 0이 초기에 담김.
	double average;
	// GUI에 첫 화면에 보여주고 싶은게 있을 때, 생성자를 사용해서 준비단계를 거칠수 있다.
	
	//ctrl + space
	// 생성자 : new Student(); 클래스를 인스턴스로 만들때 한번 동작. 
	// 메서드와 달리 -> 반환 값이 없다.
	// 데이터는 딱한번만 입력 가능
	
	// 기본 생성자(default Constructor)
	// - 생성자 한 개도 없으면 자동으로 만들어짐
	// - 생성자가 한 개라도 있다면 자동으로 만들어지지 않음.	
	public Student() {  }
	public Student(String name) {  }	// 똑같은건 허용할 수 없음. 매개변수가 달라야함.
	
//	public Student(String kor) {  }	// 매개변수의 개수가 같을 때, 자료형이 달라야함.
	public Student(int kor) {  }	// 이러한 것을 오버로딩이라고 함.
	
	/* 
	 * 오버로딩(over loding) 
	 * 메서드 또는 생성자에서 사용되고 있음
	 * 매개변수의 개수가 다르다면 동일한 이름으로 작성가능.
	 * 
	 * 매개변수의 개수가 같으면 자료형으로 구분되어야함
	 * 매개변수의 개수가 같고, 자료형이 같을 때 변수이름으로는 구분할 수 없음.
	 * */
	
	
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public String getName() {
		return name;
	}
	public String getName(String name) {
		return name;
	}
	public String getName(int korea) {
		return "";
	}
	
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
	
	public int getTotal() {
		total = kor + eng + math;
		return total;
	}
	
	public double getAverage() {
		average = total / 3.0;
		String tmp = String.format("%.2f", average);
		average = Double.parseDouble(tmp);
		return average;
	}
	
	
}
