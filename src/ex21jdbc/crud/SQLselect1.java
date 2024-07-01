package ex21jdbc.crud;

import java.sql.Date;
import java.sql.SQLException;

import ex21jdbc.MyConnection;

public class SQLselect1 extends MyConnection {

	public SQLselect1(String user, String pass) {
		super(user, pass);
	}
	
	@Override
	public void dbExecute() {
		try {
			stmt = con.createStatement();
//			정적쿼리문 작성.SQLselect1 to_char 함수를 통해 날짜의 서식을 지정한 컬럼은 d1이라는 별칭 부여
			String query = "SELECT id, pass, name, regidate, "
					+ " to_char(regidate, 'yyyy.mm.dd hh24:mi') d1 "
					+ " FROM member";
//			테이블의 변화가 발생되지않는 select문 -> executeQuerty() 사용
//			조건에 맞는 레코드가 반환되므로 ResultSet 타입의 인스턴스가 return됨 
			rs = stmt.executeQuery(query);
			
//			몇개의 데이터가 반환될지 모르기때문에 while, next()메서드로 인출할 레코드가 있는지 판단함
			while(rs.next()) {
//				select절의 첫번째 컬럼이므로 id컬럼이 지정됨
				String id = rs.getString(1); 
//				컬럼을 지정할때 인덱스/컬럼명 둘다 사용가능
				String pw = rs.getString("pass");
				String name = rs.getString("name");
				
				/*				
				오라클의 date타입을 getDate()로 인출하면 0000-00-00 형식으로 출력됨.
				또한 자료형이 Date이므로 java.sql패키지의 클래스를 사용해야함.
				*/				
				Date regidate = rs.getDate("regidate");
//				날짜를 getString()으로 인출: 시간까지 포함돼서 출력 (0000-00-00 00:00:00 형식)
//				문자열 처리 메서드를 통해 적절히 잘라낼수 있음
				String regidate2 = rs.getString("regidate");
				String regidate3 = rs.getString("regidate").substring(0,13);
				/*
				오라클의 변환함수를 통해 출력하고자 하는 형태로 포매팅한 후 문자형식으로 출력
				- 쿼리문에 별칭을 사용한 경우 그대로 사용가능
					즉 컬럼명, 인덱스, 별칭을 통해 컬럼을 지정하여 인출가능
				*/
				String regidate4 = rs.getString("d1");
				
				System.out.printf("%s %s %s %s %s %s %s\n", id, pw, name, regidate, regidate2, regidate3, regidate4);
			}
		}
		catch(SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SQLselect1("study", "12345").dbExecute();
	}
	
}
