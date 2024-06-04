package ex10accessmodifier;

//E01AccessModifier2클래스는 현재 파일과 다른 패키지에 정의됨 -> 사용을 위해 임포트 필요
import ex10accessmodifier.sub.E01AccessModifier2;

public class E01AccessModifierMain {
	public static void main(String[] args) {
	
		System.out.println("E01AccessModifierMain 객체 생성 및 접근");
		
//		동일한 패키지에 선언된 클래스는 임포트없이 사용 가능
		E01AccessModifier1 one = new E01AccessModifier1();
		
//		private접근지정자는 선언된 클래스 안에서만 접근가능.
//		System.out.println("one.privateVar= " + one.privateVar);
//		default -> 동일한 패키지임으로 접근가능
		System.out.println("one.defaultVar= " + one.defaultVar);
//		public -> 어디서든 접근가능
		System.out.println("one.publicVar= " + one.publicVar);
		
//		one.privateMethod();
		one.defaultMethod();
		one.publicMethod();
		
//		동일한 패키지 내에서 선언된 클래스 -> import 없이 사용가능
		System.out.println("DefaultClass 객체 생성 및 접근");
		new DefaultClass1().myFunc();
		
		////////////////////////////////////////////////
		
		System.out.println("E01AccessModifier2 객체 생성 및 접근");
		
//		E01AccessModifier2 는 다른 패키지에서 선언된 클래스 -> 사용 시 import 필요
		E01AccessModifier2 two = new E01AccessModifier2();
		
//		선언된 패키지와 다른 곳에서 멤버 사용은 public만 가능
//		System.out.println("two.privateVar= " + two.privateVar);
//		System.out.println("two.defaultVar= " + two.defaultVar);
		System.out.println("two.publicVar= " + two.publicVar);
		
//		two.privteMethod();
//		two.defaultMethod();
		two.publicMethod();
		
//		다른 패키지에 선언도니 default 클래스이기때문에 사용불가(import 자체도 불가)
		System.out.println("Defaultclass 객체 생성 및 접근");
//		new Defaultclass2().myFunc();
	}
}
