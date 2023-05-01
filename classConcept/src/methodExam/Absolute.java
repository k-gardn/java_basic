package methodExam;

public class Absolute {
	private int num;
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public int absNum() {
		if(num < 0)
			return -num;
		return num;
	}
}
