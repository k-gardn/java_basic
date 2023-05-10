package dbConcept2;

public class VO {
	private String email;
	private String name;
	private int mobile;
	
	public VO(String email, String name, int mobile) {
		super();
		this.email = email;
		this.name = name;
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public String getName() {
		return name;
	}
	public int getMobile() {
		return mobile;
	}
	
	
}
