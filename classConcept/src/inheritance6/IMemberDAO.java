package inheritance6;

public interface IMemberDAO {
	void insert(String email, String name, String mobile);
	void selectEmail(String email);
	void selectAll();
	void delete(String email);
	void update(String email, String name, String mobile);
}
