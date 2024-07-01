package ex21jdbc.crud;

import java.sql.SQLException;

import ex21jdbc.MyConnection;

public class SQLdelete extends MyConnection {

	public SQLdelete(String user, String pass) {
		super(user, pass);
	}
	
	String query;
	int result;
	
	@Override
	public void dbExecute() {
		try {
//			정적쿼리 실행을 위한 인스턴스 생성
			stmt = con.createStatement();
//			레코드 삭제를 위한 delete쿼리문 작성
			query = "delete from member where id='test2'";
			/*
			delete, insert, update와 같은 DML문을 실행할때는 executeUpdate()를 호출. 
			이 3개의 쿼리문은 행의 변화가 생기게 되므로 실행한 후 적용된 행의 개수를 int로 반환함
			*/
			result = stmt.executeUpdate(query);
			System.out.println(result + "행 삭제됨");
			
			/////////////////////////////////////////
			
//			인파라미터가 있는 동적 쿼리문
			query = "delete from member where id=?";
//			쿼리문을 인자로 prepared 인스턴스를 생성
			psmt = con.prepareStatement(query);
//			인파라미터를 입력값으로 설정
			psmt.setString(1, inputValue("삭제할아이디"));
//			쿼리문을 실행
			System.out.println(psmt.executeUpdate() + "행 삭제됨");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SQLdelete("study", "12345").dbExecute();
	}
	
	
}
