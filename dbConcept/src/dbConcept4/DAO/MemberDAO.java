package dbConcept4.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbConcept4.DTO.MemberDTO;

public class MemberDAO implements IDAO{
	
	private Connection con;
	private String sql;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public MemberDAO() {
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
	public MemberDTO selectId(String id) {
		//id가 있으면 정보를 보내고, 없으면 null을 보내자.
		
		// id 존재 여부 확인.
//		sql = "SELECT count(id) FROM concept4 WHERE id=?";
//		int count = -1;
//		try {
//			
//			ps = con.prepareStatement(sql);
//			ps.setString(1, id);
//			
//			rs = ps.executeQuery();
//			if(rs.next()) {
//				count = rs.getInt(1);
//			}
//			
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		
//		if(count == 1) {
			sql = "SELECT * FROM concept4 WHERE id=? ";
			MemberDTO dto = new MemberDTO();
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				
				rs = ps.executeQuery();
				
				dto.setId(id);
				dto.setPw(rs.getString("pw"));
				dto.setName(rs.getString("name"));
				dto.setEmail(rs.getString("email"));
				dto.setNum(rs.getInt("num"));
				
//				return dto;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//		}
		
		return dto;
	}

	@Override
	public int insertMember(MemberDTO member) {
		sql = "INSERT INTO concept4 (id, pw, name, email, num) VALUES(?,?,?,?,?)";
		int maxNum = 0;
		try {
			ps = con.prepareStatement(sql);
			String maxSql = "SELECT max(num) as max_num FROM concept4";
			PreparedStatement maxPs = con.prepareStatement(maxSql);
			rs = maxPs.executeQuery();
			
			if(rs.next()) {
				maxNum = rs.getInt(1);
			}
			
			ps.setString(1, member.getId());
			ps.setString(2, member.getPw());
			ps.setString(3, member.getName());
			ps.setString(4, member.getEmail());
			ps.setInt(5, ++maxNum);
			
			return ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateMember(MemberDTO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String id) {
		// TODO Auto-generated method stub
		return 0;
	}


}
