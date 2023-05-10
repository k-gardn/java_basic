package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		
		Connection con = null;
		//오라클 드라이버를 로드해줘.
		try {
			Class.forName("oracle.jdbc.OracleDriver");	// 해당 위치에 파일이 없다면 에러남.
			con = DriverManager.getConnection(url, user, password); // 오라클 db에 로그인
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("### 회원 가입 ###");
		System.out.print("아이디 : "); String id = sc.next();
		System.out.print("비밀번호 : "); String pw = sc.next();
		System.out.print("이름 : "); String name = sc.next();
		
		PreparedStatement ps = null;
		ResultSet  rs = null;
		int maxNum = 0;
//		con.prepareStatement("INSERT INTO test VALUES('" + id + "','")");
		try {
			
			ps = con.prepareStatement("SELECT max(num) as max_num FROM test"); // 컬럼의 최대값. max(num)을 max_num으로 이름 변경
			rs = ps.executeQuery();
			if(rs.next()) { //데이터 존재유무 T/F
//				rs.getInt("max_num"); // getInt("max_num");getInt(1); 컬럼 이름, index 두 가지 존재
				maxNum = rs.getInt(1);
			}
			
			ps = con.prepareStatement("INSERT INTO test VALUES(?,?,?,?)"); //보안과 편리성을 위해서.
			ps.setString(1, id); // 첫번째 물음 표에 name 넣어줘.
			ps.setString(2, pw); 
			ps.setString(3, name); 
			ps.setInt(4, ++maxNum); 
			int rowCount = ps.executeUpdate(); // 명령문을 디비로 전달하고 결과를 받음

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
