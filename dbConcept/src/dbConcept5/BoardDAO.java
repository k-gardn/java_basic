package dbConcept5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDAO implements IBoardDAO {

	private Connection con;
	private String sql;
	public BoardDAO() {
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
	@Override
	public int selectMaxNum() {
		PreparedStatement ps = null;
		ResultSet rs = null; 
		int num = 0;
		try {
			ps = con.prepareStatement("SELECT nvl(max(num), 0)+1 FROM dbConcept5");
			rs = ps.executeQuery();
			if(rs.next()) {
				num = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return num;
	}

	@Override
	public void insert(BoardDTO board) { // 1. 게시글 등록
		PreparedStatement ps = null;
		int num = selectMaxNum();
		try {
			sql = "INSERT INTO  dbConcept5 (num, subject, content, writer, write_time, hit) VALUES(?,?,?,?,?,0)";
			ps = con.prepareStatement(sql);
			
			Date nowDate = new Date();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
			String strNowDate = simpleDateFormat.format(nowDate);
			
			ps.setInt(1, num);
			ps.setString(2, board.getSubject());
			ps.setString(3, board.getContent());
			ps.setString(4, board.getWriter());
			ps.setString(5, strNowDate);
//			ps.setInt(6, 0); //첫 등록은 조회수 : 0
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public BoardDTO selectNum(int num) { //2. 게시글 번호 검색
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		updateHit(num); //글 조회수 증가
		try {
			BoardDTO dto = new BoardDTO();
			sql = "SELECT * FROM dbConcept5 WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto.setNum(rs.getInt("num"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setWriter(rs.getString("writer"));
				dto.setWriteTime(rs.getString("write_time"));
				dto.setHit(rs.getInt("hit"));
				
				return dto;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateHit(int num) { // num은 글 번호
		PreparedStatement ps = null;
		ResultSet rs = null;
		int currentHit = 0;
		try {
			
			sql = "SELECT hit FROM dbConcept5 WHERE num=?"; //현재 글의 조회수 가져오기.
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			rs = ps.executeQuery();
			if(rs.next()) {
				currentHit = rs.getInt(1);
			}
			sql = "UPDATE dbConcept5 SET hit=? WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, ++currentHit);
			ps.setInt(2, num);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<BoardDTO> selectSubject(String subject) { //3. 게시글 제목 검색
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BoardDTO> selectList = new ArrayList<>();
		try {
			sql = "SELECT * FROM dbConcept5 WHERE subject LIKE ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, "%"+ subject+"%");
			rs = ps.executeQuery();
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setWriter(rs.getString("writer"));
				dto.setWriteTime(rs.getString("write_time"));
				dto.setHit(rs.getInt("hit"));
				
				selectList.add(dto);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return selectList;
	}

	@Override
	public ArrayList<BoardDTO> selectAll() {// 4. 게시글 모두 보기
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<BoardDTO> list = new ArrayList<>();
		
		sql = "SELECT * FROM dbConcept5";
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				BoardDTO dto = new BoardDTO();
				dto.setNum(rs.getInt("num"));
				dto.setSubject(rs.getString("subject"));
				dto.setContent(rs.getString("content"));
				dto.setWriter(rs.getString("writer"));
				dto.setWriteTime(rs.getString("write_time"));
				dto.setHit(rs.getInt("hit"));
				
				list.add(dto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public int delete(int num) {//5. 게시글 삭제
		PreparedStatement ps = null;
		int result = 0;
		sql = "DELETE FROM dbConcept5 WHERE num=?";
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, num);
			result = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public void update(BoardDTO board) {//6. 게시글 수정
		PreparedStatement ps = null;
		try {
			sql = "UPDATE dbConcept5 SET subject=?, content=? WHERE num=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, board.getSubject());
			ps.setString(2, board.getContent());
			ps.setInt(3, board.getNum());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	

}

//쌤 풀이
//package dbConcept5;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
//public class BoardDAO implements IBoardDAO{
//	private Connection con;
//
//	public BoardDAO() {
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "oracle";
//		String password = "oracle";
//		
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection(url, user, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//	
//	@Override
//	public int selectMaxNum() {
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		int num = 0;
//		try {
//			ps = con.prepareStatement("SELECT nvl(max(num), 0) FROM concept5");
//			rs = ps.executeQuery();
//			if(rs.next())
//				num = rs.getInt(1);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return num;
//	}
//
//	@Override
//	public void insert(BoardDTO board) {
//		PreparedStatement ps = null;
//		try {
//			ps = con.prepareStatement("INSERT INTO concept5 VALUES(?,?,?,?,?,0)");
//			ps.setInt(1, board.getNum());
//			ps.setString(2, board.getSubject());
//			ps.setString(3, board.getContent());
//			ps.setString(4, board.getWriter());
//			ps.setString(5, board.getWriteTime());
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public BoardDTO selectNum(int num) {
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		try {
//			ps = con.prepareStatement("SELECT * FROM concept5 WHERE num=?");
//			ps.setInt(1, num);
//			rs = ps.executeQuery();
//			if(rs.next()) {
//				BoardDTO board = new BoardDTO();
//				board.setNum(rs.getInt("num"));
//				board.setSubject(rs.getString("subject"));
//				board.setContent(rs.getString("content"));
//				board.setWriter(rs.getString("writer"));
//				board.setWriteTime(rs.getString("write_time"));
//				board.setHit(rs.getInt("hit"));
//				return board;
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return null;
//	}
//
//	@Override
//	public void updateHit(int num) {
//		PreparedStatement ps = null;
//		try {
//			ps = con.prepareStatement("UPDATE concept5 SET hit=hit+1 WHERE num=?");
//			ps.setInt(1, num);
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public ArrayList<BoardDTO> selectSubject(String subject) {
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		ArrayList<BoardDTO> boards = new ArrayList<>();
//		try {
//			ps = con.prepareStatement("SELECT * FROM concept5 WHERE subject like ?");
//			ps.setString(1, "%" + subject + "%");
//			
//			rs = ps.executeQuery();
//			while(rs.next()) {
//				BoardDTO board = new BoardDTO();
//				board.setNum(rs.getInt("num"));
//				board.setSubject(rs.getString("subject"));
//				board.setContent(rs.getString("content"));
//				board.setWriter(rs.getString("writer"));
//				board.setWriteTime(rs.getString("write_time"));
//				board.setHit(rs.getInt("hit"));
//				
//				boards.add(board);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return boards;
//	}
//
//	@Override
//	public ArrayList<BoardDTO> selectAll() {
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		ArrayList<BoardDTO> boards = new ArrayList<>();
//		try {
//			ps = con.prepareStatement("SELECT * FROM concept5");
//			rs = ps.executeQuery();
//			while(rs.next()) {
//				BoardDTO board = new BoardDTO();
//				board.setNum(rs.getInt("num"));
//				board.setSubject(rs.getString("subject"));
//				board.setContent(rs.getString("content"));
//				board.setWriter(rs.getString("writer"));
//				board.setWriteTime(rs.getString("write_time"));
//				board.setHit(rs.getInt("hit"));
//				
//				boards.add(board);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return boards;
//	}
//
//	@Override
//	public int delete(int num) {
//		PreparedStatement ps = null;
//		int result = 0;
//		try {
//			ps = con.prepareStatement("DELETE FROM concept5 WHERE num=?");
//			ps.setInt(1, num);
//			result = ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return result;
//	}
//
//	@Override
//	public void update(BoardDTO board) {
//		PreparedStatement ps = null;
//		try {
//			ps = con.prepareStatement("UPDATE concept5 SET subject=?, content=? WHERE num=?");
//			ps.setString(1, board.getSubject());
//			ps.setString(2, board.getContent());
//			ps.setInt(3, board.getNum());
//			ps.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
//	}
//
//	public void disconnection() {
//		try {
//			if(con != null)
//				con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//}





