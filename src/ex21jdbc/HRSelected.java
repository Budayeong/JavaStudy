package ex21jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HRSelected {
	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String id = "hr";
			String pass = "1234";
			
//			연결성공시 반환되는 Connection객체를 통해 JDBC작업을 수행함
			Connection con = DriverManager.getConnection(url, id, pass);
			
			if(con!=null) {
				System.out.println("Oracle 연결성공");
				
//				1. 쿼리문 작성: 작성시 줄바꿈을 할때 앞뒤로 스페이스를 삽입하는 것이 좋음
//					- 그렇지않으면 문장이 서로 이어지게 되어 Syntax에러가 발생할 확률 높음
				String sql="select * from employees "
						+ " where department_id=50 "
						+ " order by employee_id desc ";
//				2. 쿼리문 전송을 위해 Statement 인터페이스의 인스턴스 생성
				Statement stmt = con.createStatement();
//				3. 쿼리문을 오라클로 전송. 실행된 결과는 ResultSet인스턴스를 통해 반환받음
				ResultSet rs = stmt.executeQuery(sql);
				
//				4. 반환된 결과의 개수만큼 반복해 출력. next() 메서드는 출력할 레코드가 남았는지 확인,
//				더이상 레코드가 없다면 false를 반환해 while문을 탈출함
				while(rs.next()) {
//					5.getter()메서드를 통해 각 컬럼에 접근. 오라클의 자료형은 문자, 숫자, 날짜 3가지 형태이므로
//					메서드도 이와 동일한 형태를 가짐. 각 컬럼에 접근할때 아래와 같이 인덱스와 컬럼명 두가지를 사용할 수 있다
					
//					인덱스1 이므로 employee_id
					String emp_id = rs.getString(1);
					String f_name = rs.getString("first_name");
					String l_name = rs.getString("last_name");
//					날짜형식으로 데이터를 얻어옴
					Date h_date = rs.getDate("hire_date");
//					숫자형식으로 데이터를 얻어옴
					int sal = rs.getInt("salary");
					System.out.printf("%s %s %s %s %s\n", emp_id, f_name, l_name, h_date, sal);
				}
//				6. 자원반납: 모든 작업을 마친후에는 메모리 절약을 위해 연결했던 자원을 모두 반납함.
				rs.close();
				stmt.close();
				con.close();
			}
			else
				System.out.println("Oracle 연결실패");
		}
		catch(Exception e) {
			System.out.println("Oracle 연결 시 예외발생");
			e.printStackTrace();
		}
		
	}
}
