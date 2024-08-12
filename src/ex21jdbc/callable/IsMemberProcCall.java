package ex21jdbc.callable;

import java.sql.SQLException;
import java.sql.Types;

import ex21jdbc.MyConnection;

public class IsMemberProcCall extends MyConnection {
	public IsMemberProcCall() {
		super("study", "12345");
	}
	
	@Override
	public void dbExecute() {
		try {
			csmt = con.prepareCall("{call MyMemberAuth(?,?,?)}");
//			인파라미터: 아이디, 패스워드
			csmt.setString(1, inputValue("회원 아이디"));
			csmt.setString(2, inputValue("회원 패스워드"));
//			아웃파라미터: 인증 결과(0,1,2)
			csmt.registerOutParameter(3, Types.NUMERIC);
			csmt.execute();
			
			int outParamResult = csmt.getInt(3);
			switch(outParamResult) {
			case 0:
				System.out.println("회원아이디가 없습니다");
				break;
			case 1:
				System.out.println("패스워드가 일치하지않습니다.");
				break;
			case 2:
				System.out.println("반갑습니다. 회원님~~!!!");
				break;
				 
			}
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
		IsMemberProcCall mapc = new IsMemberProcCall();
		mapc.dbExecute();
	}
}
