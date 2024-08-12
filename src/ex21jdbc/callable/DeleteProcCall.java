package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.MyConnection;

public class DeleteProcCall extends MyConnection {
	public DeleteProcCall() {
		super("study", "12345");
	}
	
	@Override
	public void dbExecute() {
		try {
			csmt = con.prepareCall("{call MyMemberDelete(?,?)}");
			csmt.setString(1, inputValue("삭제할 아이디"));
			csmt.registerOutParameter(2, Types.VARCHAR);
			csmt.execute();
			System.out.println("삭제프로시저 실행결과:");
//			실행결과는 두번째 파라미터를 통해 확인
			System.out.println(csmt.getString(2));
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
	}
	
	public static void main(String[] args) {
		new DeleteProcCall().dbExecute();
	}
}
