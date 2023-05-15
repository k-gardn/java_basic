package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SelectAll {

	public static void main(String[] args) {
		// 드라이버 실행(로드, load)
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		// URL로 DB에 접근하여 user/password 입력 후 로그인 함.
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "oracle";
		String password = "oracle";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		String sql = "SELECT * FROM test";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<VO> members = new ArrayList<>();
		
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(); //sql 변수의 명령어를 디비로 전달 후 결과를 반환 // 데이터를 반환
			
			while(rs.next()) { //다음 행이 존재하니? O: true
				int num = rs.getInt("num"); // 컬럼 값.
				String id = rs.getString("id");
				String pw = rs.getString("pw");
				String name = rs.getString("name");
				
				VO vo = new VO(id,name, pw, num);
				
				members.add(vo);
			}
			//ps.executeUpdate(); // sql 변수의 명령어를 디비로 전달 한 후  결과를 반환. 행을 반환
			
			/* SELECT 명령
			 * ps.executeQuery();
			 * 
			 * INSERT, UPDATE, DELETE
			 * ps.executeUpdate();
			 * 
			 *  */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 디비 연결 종료
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(members.isEmpty()) {
			System.out.println("등록 후 이용하세요.");
		}else {
			for(VO vo: members) {
				System.out.println("이름\t: " + vo.getName());
				System.out.println("아이디\t: " + vo.getId());
				System.out.println("비밀번호\t: " + vo.getPw());
				System.out.println("회원번호\t: " + vo.getNum());
				System.out.println();
			}
		}
		
	}

}
