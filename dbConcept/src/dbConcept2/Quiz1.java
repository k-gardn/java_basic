package dbConcept2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class Quiz1 {
	
	private Connection con;
	private PreparedStatement ps;
	private ResultSet rs;
	
	public static void main(String[] args) {
		
		/*
		 * 회원 등록 : 이름(중복 허용), 전화번호(중복 허용), 이메일(중복 허용 안됨) 
		 * 회원 확인 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 출력 / 없으면 없음 출력 
		 * 회원 삭제 : 이메일로 검색하여 있으면 이름, 전화번호, 이메일 삭제 / 없으면 없음 출력 
		 * 회원 수정 : 이메일로 검색하여 있으면 이름과 전화번호 수정 / 없으면 없음 출력
		 */

		Scanner in = new Scanner(System.in);
//		ArrayList<String> mobile = new ArrayList<String>();
//		ArrayList<String> email = new ArrayList<String>();
//		ArrayList<String> name = new ArrayList<String>();
		/*
		 *  ArrayList가 아닌 데이터베이스에 테이블 생성해서 
			아래와 같은 메뉴의 등록,확인,삭제,모두보기, 수정 등 기능이 동작되도록 구현
			테이블 이름 concept 
 			컬럼(필드) 이름 자유,
 			자료형 크기 자유
		 */
		int index;
		String em = "", name ="";
		int	mobile = 0;
		
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
		
		while (true) {
			System.out.println("1. 회원 등록");
			System.out.println("2. 회원 확인");
			System.out.println("3. 회원 삭제");
			System.out.println("4. 회원 모두 보기");
			System.out.println("5. 회원 수정");
			System.out.println("6. 프로그램 종료");
			System.out.print("선택 > ");
			int select;
			
			try {
				select = Integer.parseInt(in.next());
			} catch (Exception e) {
				continue;
			}
			
			String sql;
			PreparedStatement ps = null;
			ResultSet  rs = null;
			
			switch (select) {
			case 1:
				System.out.println("=== 회원 등록 ===");
				System.out.print("이메일 : "); em = in.next();
				
				//회원 존재 여부.확인
				sql = "SELECT name FROM concept WHERE email = ?";
//				sql = "SELECT * FROM concept WHERE email = ?";
//				sql = "SELECT count(email) FROM concept WHERE email = ?";
				try {
					ps = con.prepareStatement(sql);
					ps.setString(1, em);
					rs = ps.executeQuery();
					
					String dbName = null;
					if(rs.next()) {
						System.out.println("이미 존재하는 이메일 입니다.");
					}else if( dbName == null){
						System.out.print("이름 : "); name = in.next();
						System.out.print("전화번호 : "); mobile = in.nextInt();
						sql = "INSERT INTO concept VALUES(?,?,?)";
						ps = con.prepareStatement(sql);
						ps.setString(1, em); // 첫번째 물음 표에 name 넣어줘.
						ps.setString(2, name); 
						ps.setInt(3, mobile); 
						ps.executeUpdate(); // 명령문을 db에 전달하여 회원정보 등록.
					}
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				break;
			case 2:
				System.out.println("=== 회원 검색 ===");
				System.out.print("이메일 : ");em = in.next();
				
				try {
					sql = "SELECT * FROM concept WHERE email = ?";
					ps = con.prepareStatement(sql);
					ps.setString(1, em);
					rs = ps.executeQuery();
					
					if(rs.next()) {
						em = rs.getString("email");// 컬럼 값.
//						em = rs.getString(1);// 인덱스값
						
						name = rs.getString("name");
//						name = rs.getString(2);// 인덱스값
						
						mobile = rs.getInt("mobile");
//						mobile = rs.getString(3);// 인덱스값
						
						System.out.println("이름 : " + name);
						System.out.println("전화번호 : " + mobile);
//						VO vo = new VO(em, name, mobile);
						
//						members.add(vo);
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				

				break;
			case 3:
				System.out.println("=== 회원 삭제 ===");
				System.out.print("이메일 : ");
				em = in.next();
				
				sql = "DELETE FROM concept WHERE email = ?";
				try {
					ps = con.prepareStatement(sql);
					ps.setString(1, em);
					int result = ps.executeUpdate();
					
					if (result == 1) {
						System.out.println("회원정보 삭제되었습니다.");
					} else {
						System.out.println("등록되지 않은 회원 입니다.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;

			case 4:
				sql = "SELECT * FROM concept";
				try {
					ps = con.prepareStatement(sql);
					rs = ps.executeQuery();
					int count = 0;
					
					while(rs.next()) {
						count++;
						System.out.print("이메일 : " + rs.getString(1) + "\t");
						System.out.print("이  름 : " + rs.getString(2) + "\t");
						System.out.print("전화번호 : " + rs.getString(3) + "\t");
						System.out.println();
					}
					
					if(count == 0) {
						System.out.println("회원 등록 후 이용하세요.");
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				break;
				
			case 5:
				System.out.println("=== 회원 수정 ===");
				System.out.print("이메일 : "); em = in.next();
				System.out.println("이  름 : " ); name = in.next();
				System.out.println("전화번호 : " ); mobile = in.nextInt();
				sql = "UPDATE concept SET mobile =?, name=? WHERE email = ?";
				
				try {
					ps = con.prepareStatement(sql);
					ps.setInt(1, mobile);
					ps.setString(2, name);
					ps.setString(3, em);
					int result = ps.executeUpdate();
					
					if (result == 1) {
						System.out.println("회원정보 수정이 완료 되었습니다.");
					} else {
						System.out.println("등록되지 않은 회원 입니다.");
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			default:
				System.out.println("메뉴 확인 후 다시 입력하세요.");
			}
			System.out.println();
		}

	}
}






