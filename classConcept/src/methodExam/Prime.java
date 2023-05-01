package methodExam;

public class Prime {
	private int data;

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	public boolean isPrime() {
		if(data == 1 ) {
			return false;
		}else {
			for(int i = 2; i < data; i++) {
				if(data % i == 0) {
					return false;
				}
			}
			return true;
		}
	}
}
