package maps;

// Data Transfer Object
public class DTO {
	private String id;
	private String pw;
	private String name;
	
	private int num;
	private boolean block; // 블랙
	private double distance; // 배달의 거리
	
	//Alt + Shift + s => 메뉴가 나옴.
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public boolean isBlock() {
		return block;
	}
	public void setBlock(boolean block) {
		this.block = block;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}


	
}
