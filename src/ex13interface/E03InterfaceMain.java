package ex13interface;

/*
인터페이스(interface)
: 클래스가 객체의 설계도라면, 인터페이스는 클래스간의 설계도
- 인터페이스는 다중구현 가능
- 상속을 목적으로 제작됨
- 멤버로는 추상메서드와 상수만 선언 가능
	메서드: public abstract
	상수: public static final 
- 생성자 선언 불가(= 객체 생성 불가)
*/

interface MyInterface1 {
//	인터페이스는 생성자 사용불가 (= 객체생성 불가)
//	public MyInterface1() {}
	
//	멤버상수: 인터페이스에 선언되는 변수는 상수로 선언됨 (자동 public static final -> 생략가능)
	public static final int MAX_INT = Integer.MAX_VALUE;
	double MAX_DBL = Double.MAX_VALUE;
	
//	멤버메서드: 인터페이스에 존재하는 메서드는 추상메서드만 가능 (자동 public abstract)
	public abstract void absFunc1();
	void absFunc2();
}

interface MyInterface2 {
	void absFunc2();
}

class SimpleClass {
	int simple = 1;
	void mySimple() {
		System.out.println("simple= "+ simple);
	}
}


// 인터페이스는 , 를 이용해 다중 implements 가능
// 상속(extends)과 구현(implements) 동시 사용 가능
class MyClass extends SimpleClass implements MyInterface1, MyInterface2 {

//	인터페이스에 동일한 이름의 추상메서드가 존재하는 경우, 하나만 오버라이딩하면 됨
//	오버라이딩은 항상 자식쪽의 메서드가 호출되므로 아무런 문제도 발생하지 않는다.
	@Override
	public void absFunc1() {
		System.out.println("absFunc1() 호출됨");
	}

	@Override
	public void absFunc2() {
		System.out.println("absFunc2() 호출됨");
	}
	
//	SimpleClass 클래스의 멤버메서드는 필요한 경우에만 오버라이딩. (필수X)
}


public class E03InterfaceMain {
	public static void main(String[] args) {
		
//		구현한 인터페이스 타입으로 참조변수 선언 가능
		MyInterface1 my1 = new MyClass();
//		오버라이딩한 메서드는 자식클래스에서 정의한 메서드가 호출된다.
		my1.absFunc1();
		my1.absFunc2();
		((SimpleClass)my1).mySimple();
		
//		extends한 클래스, implements한 인터페이스 모두 MyClass의 부모 (->부모타입으로 선언 가능)
		MyInterface2 my2 = new MyClass();
		SimpleClass simpleClass = new MyClass();
	}
}
