package dbConcept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
public class QuizDAO2 {
	private Connection con; //초기값 null을 설정하지 않아도 null이 들어감.
	
	public QuizDAO2() { 
		//  생성자에 oracle 로그인을 넣어두면
		// new QuizDAO2(); 호출시 바로 oracle db 로그인이 이루어짐.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void add(QuizDTO2 quizDto) {	
		String sql = "INSERT INTO concept2 VALUES(?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, quizDto.getId());
			ps.setString(2, quizDto.getPassword());
			ps.setString(3, quizDto.getName());
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public QuizDTO2 get(String id) {
		String sql = "SELECT * FROM concept2 WHERE id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if(rs.next()) {
				QuizDTO2 quizDto = new QuizDTO2();
				
				quizDto.setId(rs.getString("id"));
				
				String password = rs.getString("password");
				quizDto.setPassword(password);
				
				quizDto.setName(rs.getString("name"));
				
				return quizDto;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public void remove(String id) {	
		String sql = "DELETE FROM concept2 WHERE id = ?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			int result = ps.executeUpdate();
			
			if (result == 1) {
				System.out.println("회원정보 삭제되었습니다.");
			} else {
				System.out.println("등록되지 않은 회원 입니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void set(QuizDTO2 quizDto) {
		String sql = "UPDATE concept2 SET password=? WHERE id=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, quizDto.getPassword());
			ps.setString(2, quizDto.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<QuizDTO2> getAll() {
		ArrayList<QuizDTO2> members = new ArrayList<>();
		
		String sql = "SELECT * FROM concept2";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			rs =  ps.executeQuery();
			while(rs.next()) { //모든 행을 돌아야해
				QuizDTO2 quizDto = new QuizDTO2();
				
				String id = rs.getString("id");
				String password = rs.getString("password");
				
				quizDto.setId(id);
				quizDto.setPassword(password);
				quizDto.setName(rs.getString("name"));
				
				members.add(quizDto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}
	
	public void disconnection() {
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


