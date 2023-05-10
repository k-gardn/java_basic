package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {
	public static void main(String[] args) {
	//아이디,비밀번호 입력 받아 비밀번호가 일치하면 삭제, 아니면 삭제 안함.
	Scanner sc = new Scanner(System.in);
	Connection con = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "oracle";
	String password = "oracle";
	
	try {
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection(url, user, password);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	try {
		System.out.println("아이디 : "); String id =  sc.next();
		System.out.println("비밀번호 : ");  String pw = sc.next();
		
//		String sql = "DELETE FROM test WHERE id=?";
		String sql = "SELECT pw FROM test WHERE id = ?";
		ps = con.prepareStatement(sql);
		ps.setString(1, id);
		rs = ps.executeQuery();
		
		String dbPw = null;
		if(rs.next()) {
			dbPw = rs.getString(1);
		}
		if(dbPw == null) {
			System.out.println("아이디 정보를 찾을 수 없습니다.");
		}else {
			if(dbPw.equals(pw)) {
				sql = "DELETE FROM test WHERE id=?";
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				ps.executeUpdate();
				System.out.println("회원이 삭제되었습니다.");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		if(con != null)
			con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
}
