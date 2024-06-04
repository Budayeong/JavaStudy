package ex10accessmodifier.sub;
//E01AccessModifier1와 동일한 내용, 다른 패키지

class Defaultclass2 {
	
	void myFunc() {
		System.out.println("Defaultclass2 클래스의 myFunc()메서드 호출");
	}
	
}


public class E01AccessModifier2 {

	private int privateVar;
	int defaultVar;
	public int publicVar;
	

	private void privateMethod() {
		privateVar = 400;
		System.out.println("privateMethod() 메서드 호출");
	}
	
	void defaultMethod() {
		privateVar = 500;
		System.out.println("defaultMethod() 메서드 호출");
	}
	
	public void publicMethod() {
		privateVar = 600;
		System.out.println("publicMethod() 메서드 호출");
		privateMethod();
	}
	
}
