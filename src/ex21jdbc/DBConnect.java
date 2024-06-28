
package ex21jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	public static void main(String[] args) {
	
		try {
			/*
			JDBC 프로그래밍 절차
				1. 오라클용 JDBC 드라이버를 메모리에 로드
				: new를 사용하지 않고  클래명으로 직접 인스턴스 생성 후 메모리에 로드하는 forName()사용
			*/
			Class.forName("oracle.jdbc.OracleDriver");
			/*
			2. 오라클 연결을 위해 커넥션 URL, 계정아이디, 패스워드 준비
			: jdbc:oracle:@오라클서버의IP주소:포트번호:sid명
			서버환경에 따라 @뒷부분은 변경됨
			*/
			String url= "jdbc:oracle:thin:@localhost:1521:xe";
			String id ="hr";
			String pass = "1234";
			
			/*
			 3. DriverManager 클래스의 정적메서드를 호출해서 데이터베이스
			 연결을 시도하고, 성공하면 Connection인스턴스 반환 
			 */
			Connection con = DriverManager.getConnection(url, id, pass);
			/*
			4. 반환된 Connection 인스턴스를 통해 DB작업(CRUD)를 진행
			*/
			if(con!=null)
				System.out.println("Oracle 연결성공");
			else
				System.out.println("Oracle 연결실패");
		}
		catch(Exception e) {
			System.out.println("Oracle 연결 시 예외발생");
			e.printStackTrace();
		}
	}
}
