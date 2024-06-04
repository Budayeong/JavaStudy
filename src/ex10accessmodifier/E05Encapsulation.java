package ex10accessmodifier;
 
/*
캡슐화(Encapsulation) : 여러가지 업무 로직을 하나로 묶는다 / 업무의 순서까지 고려한 형태의 로직을 구성한다
	=> 관련있는 로지글 하나로 묶어주는 것
*/

// 다음 클래스의 메서드들은 번호 순서대로 진행해야함
class MemberRegist {
	void doMemberRegist() {
		System.out.println("1.회원가입을 진행합니다.");
	}
}
class CongratulationPoint {
	void doCongratulationPoint() {
		System.out.println("3.가입축하 10포인트를 지급합니다.");
	}		
}
class AutoLogin {
	void doAutoLogin() {
		System.out.println("2.자동로그인");
	}		
}
class FirstLoginEvent {
	void doFirstLoginEvent() {
		System.out.println("4.첫 로그인 이벤트 페이지로 이동합니다. ");
	}		
}
 
//업무의 순서를 고려하여 관련된 메서드를 하나의 클래스로 정의 -> 차후 별도의 분석절차없이 doProcess메서드만을 호출해 업무 가능
class EncapsulLogic {	
	MemberRegist memberRegist = new MemberRegist();
	FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
	AutoLogin autoLogin = new AutoLogin();
	CongratulationPoint congratulationPoint = new CongratulationPoint();
	
//	업무의 순서를 고려해 캡슐화된 메서드를 정의
	void doProcess() {
		memberRegist.doMemberRegist();
		autoLogin.doAutoLogin();
		congratulationPoint.doCongratulationPoint();
		firstLoginEvent.doFirstLoginEvent();
	}
}

public class E05Encapsulation {
	
	public static void main(String[] args) {
 
		System.out.println("캡슐화 전 코드");
		
//		캡슐화 이전 코드에서는 업무의 진행순서가 지켜지지않은 상태에서도 코드가 실행됨 -> 업무에 차질이 발생될 수 있음
		MemberRegist memberRegist = new MemberRegist();
		FirstLoginEvent firstLoginEvent = new FirstLoginEvent();
		AutoLogin autoLogin = new AutoLogin();
		CongratulationPoint congratulationPoint = new CongratulationPoint();
		
		memberRegist.doMemberRegist(); //회원가임
		firstLoginEvent.doFirstLoginEvent(); //이벤트페이지이동
		congratulationPoint.doCongratulationPoint(); //자동로그인
 		autoLogin.doAutoLogin(); //축하포인트 지급
		
		System.out.println("==============================");
		
//		캠슐화된 메서드를 통해 업무 순서에 맞게 진행
		System.out.println("캡슐화 이후 코드");
		new EncapsulLogic().doProcess();
	}
}

