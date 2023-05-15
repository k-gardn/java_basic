package dbConcept3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbConcept2.QuizDTO2;

public class MemberDAOImpl implements IMemberDAO{
	/*
	 * 데이터베이스 연결
	 * 데이터베이스로 CRUD(Create, Read, Update, Delete)
	 */
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	private Connection con; 
	
	public MemberDAOImpl() {
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

	@Override
	public int isExists(String email) {
		int count = 0;
		String sql = "SELECT count(email) FROM concept3 WHERE email=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			if(rs.next())
				count = rs.getInt(1); // 1 or 0
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public void insert(MemberDTO member) {
		String sql = "INSERT INTO concept3 VALUES(?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getEmail());
			ps.setString(2, member.getName());
			ps.setString(3, member.getMobile());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public MemberDTO selectEmail(String email) {
		sql = "SELECT email, name, mobile FROM concept3 WHERE email=? ";
		MemberDTO dto = new MemberDTO();
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			
			rs = ps.executeQuery();
			if(rs.next()) {
//				dto.setEmail(rs.getString(1));
				dto.setEmail(rs.getString("email"));
//				dto.setName(rs.getString(2));
				dto.setName(rs.getString("name"));
//				dto.setMobile(rs.getString(3));
				dto.setMobile(rs.getString("mobile"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

	@Override
	public int delete(String email) {
		sql = "DELETE FROM concept3 WHERE email=?";
		int result = 0;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		
		ArrayList<MemberDTO> members = new ArrayList<>();
		sql = "SELECT * FROM concept3";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				
				dto.setEmail(rs.getString(1));
				dto.setName(rs.getString(2));
				dto.setMobile(rs.getString(3));
				
				members.add(dto);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return members;
	}

	@Override
	public void update(MemberDTO member) {
		String sql = "UPDATE concept3 SET name=?, mobile=? WHERE email=?";
		PreparedStatement ps = null;
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getName());
			ps.setString(2, member.getMobile());
			ps.setString(3, member.getEmail());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void disconnection() {
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}







