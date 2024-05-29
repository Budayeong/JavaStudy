package ex02variable;

public class E05ConstantVar {
	public static void main(String[] args) {
		
		/*
		상수: 저장된 값이 변하지 않는 메모리의 한 종류
			- final 키워드롤 앞에 붙여 선언
			- 상수는 한번만 초기화되고 이후에는 갑을 변경할 수 없음
			- 선언 시 전체를 대문자로 기술. 연결은 _(언더스코어)사용
			- 주로 프로그램에서 코드의 가독성을 높여주는 역할을 함
		*/
		
		final double PI = 3.14;
		System.out.println("PI(원주율)=" +PI);
		
//		상수이기때문에 한번 초기화 후 변경 불가 (에러)
//		PI = 3.141592;
		
//		선언과 초기화 분리 가능
		final String NICK_NAME;
//		초기화가 안된 상태에서는 사용할 수 없어 에러 발생
//		System.out.println("우리는" + NICK_NAME);
		NICK_NAME = "개발자";
		System.out.println("우리는"+ NICK_NAME);
		
	
//		가위, 바위, 보 게임 제작을 위해 개발자가 1, 2, 3을 정한 후 진행한다고 가정하면..	
		final int SCISSOR = 1;
		final int ROCK = 2;
		final int PAPER = 3;
		int computer, user;
		
		
//		1과 3이 각각 어떤것을 의미하는지 개발자만 알 수 있는 내용 -> 가독성 저하/코드 분석 절차를 필요로 함
		computer = 1;
		user = 3;
		System.out.println("컴퓨터가 이겼습니다");
		
//		PAPER, SCISSOR 등의 단어는 누가봐도 이해가능 -> 가독성 높고 명시적인 코드라고 할 수 있음
		computer = SCISSOR;
		user = PAPER;
		System.out.println("Computer Win");
	}
}
