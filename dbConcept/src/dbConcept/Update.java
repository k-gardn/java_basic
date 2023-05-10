package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// 아이디, 비밀번호 입력 받아 비밀번호 수정
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("### 회원 정보 수정 ###");
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("비밀번호 : "); String pw = sc.next();
		
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("UPDATE test SET pw=? WHERE id=?"); 
			ps.setString(1, pw);
			ps.setString(2, id);
			
			int rowCount = ps.executeUpdate();
			System.out.println();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}
}

//package dbConcept;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.util.Scanner;
//
//public class Update {
//
//	public static void main(String[] args) {
//		// 아이디, 비밀번호 입력 받아 비밀번호 수정
//		Scanner sc = new Scanner(System.in);
//		Connection con = null;
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String user = "oracle";
//		String password = "oracle";
//		try {
//			Class.forName("oracle.jdbc.OracleDriver");
//			con = DriverManager.getConnection(url, user, password);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		PreparedStatement ps = null;
//		ResultSet rs = null;
//		try {
//			String sql = "SELECT pw FROM test WHERE id = ?";
//			ps = con.prepareStatement(sql);
//			System.out.print("아이디 : "); String id = sc.next();
//			ps.setString(1, id);
//			rs = ps.executeQuery();
//			String dbPw = null;
//			if(rs.next()) {
//				dbPw = rs.getString(1);
//			}
//			
//			if(dbPw == null) {
//				System.out.println("아이디 정보를 찾을 수 없습니다.");
//			}else {
//				System.out.print("현재 비밀번호 : "); String currentPw = sc.next();
//				if(dbPw.equals(currentPw)) {
//					sql = "UPDATE test SET pw=? WHERE id=?";
//					ps = con.prepareStatement(sql);
//					System.out.print("새로운 비밀번호 : ");
//					ps.setString(1, sc.next());
//					ps.setString(2, id);
//					ps.executeUpdate();
//					System.out.println("비밀번호가 수정되었습니다.");
//				}else {
//					System.out.println("비밀번호가 틀렸습니다.");
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			if(con != null)
//				con.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
//
//}

