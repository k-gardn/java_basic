package sceneBuilders;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MemberDAO{
	
	private Connection con;

	public MemberDAO() {
		connection();
	}
	
	public void connection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void disconnection() {
		try {
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int join(String id, String pw) {
		String sql = "INSERT INTO scene(id, pw) VALUES(?, ?)";
		PreparedStatement ps = null;
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	};
	
	public boolean checkId(String id) {
		String sql = "SELECT id FROM scene";
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean isExist = false;
		ArrayList<String> All_Id = new ArrayList<>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				All_Id.add(rs.getString(1));
			}
			
			for(String existedId : All_Id) {
				if(id.equals(existedId)) {
					isExist = true;
				}
			}
		} catch (SQLException e) {
		}
		return isExist;
	}
	
	public String login(String id) {
		String sql = "SELECT pw FROM scene WHERE id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				return rs.getString("pw");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}










