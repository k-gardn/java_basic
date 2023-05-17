package disassemble.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import disassemble.DTO.MemberDTO;

public class MemberDAO implements IMemberDAO{
	
	private Connection con;
	private String sql;
	
	public MemberDAO() {
		connection();
	}
	
	public void connection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "testing";
		String password = "testing";
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Collection<MemberDTO> selectAll() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		Collection<MemberDTO> members = new ArrayList<>();
		try {
			sql = "SELECT * FROM disassemble";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setEmail(rs.getString(1));
				dto.setPassword(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setRegisterDate(rs.getString(4));
				members.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return members;
	}

	@Override
	public MemberDTO selectEmail(String email) { // 이메일 존재 여부
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			sql = "SELECT * FROM disassemble WHERE email=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setEmail(email);	
				dto.setName(rs.getString("name"));
				dto.setPassword(rs.getString("password"));
				dto.setRegisterDate(rs.getString("register_date"));
				
				return dto;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public void insert(MemberDTO member) {
		PreparedStatement ps = null;
		
			try {
				sql = "INSERT INTO disassemble VALUES(?,?,?,?)";
				ps = con.prepareStatement(sql);
				
				ps.setString(1, member.getEmail());
				ps.setString(2, member.getPassword());
				ps.setString(3, member.getName());
				ps.setString(4, member.getRegisterDate());
				
				ps.executeUpdate();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void update(MemberDTO member) { // 비밀번호 변경
		PreparedStatement ps = null;
		try {
			sql = "UPDATE disassemble SET password=? WHERE email=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, member.getPassword());
			ps.setString(2, member.getEmail());
			
			ps.executeUpdate();
			
		} catch (Exception e) {
		}
		
	}

	@Override
	public void delete(String email) {
		PreparedStatement ps = null;
		try {
			sql="DELETE FROM disassemble WHERE email=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, email);
			ps.executeUpdate();
		} catch (Exception e) {
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

}
