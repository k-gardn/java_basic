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
		connection();
	}
	
	public void connection(){
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
		sql = "SELECT count(id) FROM concept4 WHERE id=?";
		int count = -1;
		try {
			
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		if(count == 1) {
			sql = "SELECT * FROM concept4 WHERE id=? ";
			MemberDTO dto = new MemberDTO();
			try {
				ps = con.prepareStatement(sql);
				ps.setString(1, id);
				
				rs = ps.executeQuery();
				if(rs.next()) {
					dto.setId(id);
					dto.setPw(rs.getString("pw"));
					dto.setName(rs.getString("name"));
					dto.setEmail(rs.getString("email"));
					dto.setNum(rs.getInt("num"));
				}
				
				return dto;
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return null; // 이거 없으면 에러남.
	}

	@Override
	public int insertMember(MemberDTO member) {
		PreparedStatement ps = null;
		ResultSet rs = null;
		sql = "INSERT INTO concept4 (id, pw, name, email, num) VALUES(?,?,?,?,?)";
		int maxNum = 0; // 
		try {
			ps = con.prepareStatement(sql);
			String maxSql = "SELECT max(num) as max_num FROM concept4"; 
			// 초기값은 null이기 때문에. null + 1은 에러남.
			//String maxSql = "SELECT  nvl(max(num), 0)+1 FROM concept4"; 
			// nvl(max(num), 0) 
			// = null value left
			// 왼쪽이 null 이면 오른쪽을 반환하게하는 함수. null이 아니면 왼쪽을 반환해
			// 처음에만 동작함.
			// nvl(max(num), 0)+1 여기에서 1증가 시켜줄 수도 있음.
			
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
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<MemberDTO> selectAll() {
		sql = "SELECT * FROM concept4";
		ArrayList<MemberDTO> members = new ArrayList<MemberDTO>();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setId(rs.getString(1));
				dto.setPw(rs.getString(2));
				dto.setName(rs.getString(3));
				dto.setEmail(rs.getString(4));
				dto.setNum(rs.getInt(5));
				
				members.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return members;
	}

	@Override
	public int updateMember(MemberDTO member) {
		PreparedStatement ps = null;
		int result = 0;
		try {
			sql = "UPDATE concept4 SET pw=?, name=?, email=? WHERE id=?";
			ps = con.prepareStatement(sql);
			
			ps.setString(1, member.getPw());
			ps.setString(2, member.getName());
			ps.setString(3, member.getEmail());
			ps.setString(4, member.getId());
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int deleteMember(String id) {
		PreparedStatement ps = null;
		int result = 0;
		try {
			sql = "DELETE concept4 WHERE id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
		
			result = ps.executeUpdate(); //삭제하는 행의 개수
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
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
