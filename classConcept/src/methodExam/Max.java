package methodExam;

public class Max {

	private int data1, data2;

	public int getData1() {
		return data1;
	}
	public int getData2() {
		return data2;
	}

	public void setData1(int data1) {
		this.data1 = data1;
	}
	
	public void setData2(int data2) {
		this.data2 = data2;
	}
	
	public int largeNumber() {
		return data1 > data2 ? data1 : data2 ; //삼항 연산자
//		if(data1 > data2) 
//			return data1;
//		return data2;
	}
	
	
	
}
