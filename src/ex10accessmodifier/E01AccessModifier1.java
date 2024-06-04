package ex10accessmodifier;

 
//class에는 public/default만 사용 가능
//private class PrivateClass1 {
//	void myFunc() {
//		System.out.println("private 클래스는???");
//	}
//}

//접근 지정자 생략 -> default 클래스 : 동일한 패키지 내에서만 사용가능
class DefaultClass1 {
	void myFunc() {
		System.out.println("DefaultClass1 클래스의 myFunc() 메서드 호출됨");
	}
}

/*
public 클래스 = 해당 .java파일을 대표하는 클래스로 파일명과 동일해야함
	- public 클래스는 자바 파일당 하나만 정의 가능
	- public으로 지정하는 경우 다른 패키지에서도 접근 허용 -> 하나의 java파일에 하나의 class만 정의하는 것 권장
*/
public class E01AccessModifier1 {
//	멤버변수 접근지정자
	private int privateVar;
	int defaultVar;
	public int publicVar;
//	protected는 상속관계에 있을때 접근 허용
	
//	멤버메서드 접근지정자
	private void privateMethod() {
//		private 지정자는 클래스 내부에서 사용가능하기때문에 접근 허용됨
		privateVar = 100;
		System.out.println("privateMethod() 메서드 호출");
	}
	
	void defaultMethod() {
		privateVar = 200;
		System.out.println("defaultMethod() 메서드 호출");
	}
	
	public void publicMethod() {
		privateVar = 300;
		System.out.println("publicMethod() 메서드 호출");
//		private으로 선언되면 같은 클래스 내부에서만 호출가능 -> 외부에서 호출해야하면 public 메서드를 통해 간접호출해야함
		privateMethod();
	}
}
