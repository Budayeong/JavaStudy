package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.MyConnection;

public class InsertProcCall extends MyConnection{
	public InsertProcCall() {
		super("study", "12345");
	}
	
	@Override
	public void dbExecute() {
		try {
			/* 프로시저는 함수와는 다르게 반환값이 별도로 없으므로 호출시 좌측항이 
			 필요하지않음. 3개의 인파라미터와 1개의 아웃파라미터를 설정. */
			csmt = con.prepareCall("{call MyMemberInsert(?,?,?,?)}");
//			in파라미터는 Java에서 입력한 값으로 설정
			csmt.setString(1, inputValue("아이디"));
			csmt.setString(2, inputValue("패스워드"));
			csmt.setString(3, inputValue("이름"));
//			아웃파라미터는 타입을 숫자로 지정
			csmt.registerOutParameter(4, Types.NUMERIC);
//			프로시저 실행
			csmt.execute();
//			아웃파라미터는 4번 인덱스이므로 값 저장
			int affected = csmt.getInt(4);
//			결과확인
			if(affected == 0)
				System.out.println("오류발생: 입력실패");
			else
				System.out.println(affected + "행 입력성공");
		}
		catch(SQLException e) {
			System.out.println("쿼리실행 중 예외발생");
			e.printStackTrace();
		}
		finally {
			dbClose();
			
		}
	}
	
	public static void main(String[] args) {
		new InsertProcCall().dbExecute();
	}
	
}	
