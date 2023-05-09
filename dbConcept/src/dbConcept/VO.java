package dbConcept;

public class VO {
	private String id;
	private String name;
	private String pw;
	private int num;
	
	public VO(String id, String name, String pw, int num) {
		super();
		this.id = id;
		this.name = name;
		this.pw = pw;
		this.num = num;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
	public int getNum() {
		return num;
	}
	public String getPw() {
		return pw;
	}
}
