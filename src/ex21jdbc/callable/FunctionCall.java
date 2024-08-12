package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.MyConnection;

public class FunctionCall extends MyConnection {
//	생서자에서 DB연결 처리
	public FunctionCall() {
		super("study", "12345");
	}
	
	@Override
	public void dbExecute() {
		try {
			/*
			? = call 오라클함수명(?)
			- 첫번째 파라미터는 함수의 반환값을 저장하는 용도
			- 두번째 파라미터는 함수호출시 전달하는 인수
			*/
			csmt = con.prepareCall("{? = call fillAsteric(?)}");
//			함수의 반환타입은 문자이므로 이와같이 지정
			csmt.registerOutParameter(1, Types.VARCHAR);
//			전달하는 인수도 문자타입. 사용자가 입력한 값으로 설정한다.
			csmt.setString(2, inputValue("아이디"));
//			함수 실행
			csmt.execute();
//			첫번째 파라미터를 통해 값을 반환
			System.out.println("함수의 반환값: "+ csmt.getString(1));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new FunctionCall().dbExecute();
	}
}
