package ex05metod;

/*
Method(메서드): 객체지향 프로그램이에서 행동 혹은 동작 - 하나의 업무를 처리하기 위한 모듈(부속품)
- 메서드는 반드시 class내부에 정의
- 메서드 내부에 또 다른 메서드를 정의할 수 없다
*/

/*
Java에서 Naming rule(이름 작성 규칙)
- 클래스명: GoodMorning => 대문자로 시작하는 Camel case
- 메서드/변수명: goodMorning => 소문자로 시작하는 Camel case
- 상수명: GOOD_MORNING => 전체 대문자,연결 시 _ 로 구분
- 패키지명: good.morning => 전체 소문자, 연결 단어 . 으로 구분
*/


/*
[메서드형태1] 매개변수 X 반환값 X
	: 주로 단순출력기능 정도로 사용
*/
public class E02MethodType01 {
	static void menuPrint() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기, 2.계속하기, 3.종료");
		System.out.println("================");
	}
	
	static void returnError() {
		int returnValue = 10;
		System.out.println("[Return문 이전]");
		
//		메서드 중간에 return이 들어오면즉시 종료(따라서 조건문과 함께 기술되어야함)
//		return;
		
		if(returnValue%2==0) {
			System.out.println(returnValue + "는 짝수");
			return;
		}
		
		System.out.println(returnValue + "는 홀수");
		System.out.println("[return문 이후]");
	}
	
	public static void main(String[] args) {
		menuPrint();
		returnError();
	}
}
