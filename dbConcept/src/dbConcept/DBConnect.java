package dbConcept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

	public static void main(String[] args) {
		/*
		 * IP Address 와 Port Number
 		 * IP : Internet Protocol
 		 * IP : 컴퓨터의 주소
 		 * IP : 서울특별시 마포구 백범로 3길
 		 * Port : 4층 5강의장, (401호) // 프로세스로 구분. 프로그램 식별
 		 * 
 		 * IP : xxx.xxx.xxx.xxx / 192.168.0.83
 		 * Port : 0 ~ 65535 / 1521
 		 * 
 		 * 자기 자신: this
 		 * IP 주소 == 자기자신 == localhost == 127.0.0.1 // 무조건 나야. 외우기 힘드니까 문자열 localhost로 씀.
		 * */
		
		//드라이버 실행(로드, Load)
		try {
			Class.forName("oracle.jdbc.OracleDriver"); // 어떤 ojdbc를 쓸것인지.
		} catch (ClassNotFoundException e) { // 외부의 class를 찾지 못했을 경우 예외처리.
			e.printStackTrace();
		} 
		
		// URL로 DB에 접근하여 user/password 입력 후 로그인 함.
		String url = "jdbc:oracle:thin:@localhost:1521:xe"; 
		// 자바 데이터 베이스, 오라클로 연결할것이고, 예전에 비해 얇아졌다. DB IP . port. SID서비스 이름(?)
		// jdbc:oracle:thin == http
//		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "oracle"; 	// DB 아이디
		String password = "oracle"; //  DB 비밀번호
		Connection con = null;
		
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 데이터 베이스와 데이터를 주고 받는 코드
		
		// 디비 연결 종료
		try {
			if(con != null)
				con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("다음 코드");
	}
}
