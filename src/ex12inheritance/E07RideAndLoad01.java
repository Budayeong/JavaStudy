package ex12inheritance;

/*
상속관계에서 오버로딩 vs 오버라이딩
- 오버로딩 : 자식 클래스에서 부모 클래스의 메서드를 받았기때문에 같은 이름의 메서드르 정의하려면 오버로딩해야함
- 오버라이딩: 부모클래스로부터 받은 메서드를 자식에서 재정의한 것. 오버로딩하게되면 부모 클래스의 메서드를 가리게 됨.
*/

class A {
	public void rideMethod() {
		System.out.println("A의 rideMethod");
	}
	public void loadMethod() {
		System.out.println("A의 loadMethod");
	}
	
	private void ride() {
		System.out.println("private 오버라이딩메서드");
	}
}


class B extends A {
	@Override
	public void rideMethod() {
		System.out.println("B의 rideMethod");
	}
//	오버로딩 (부모와 매개변수의 개수가 다른 loadMethod 정의)
	public void loadMethod(int num) {
		System.out.println("B의 loadMethod");
	}

}

class C extends B {
	
	@Override
	public void rideMethod() {
		System.out.println("C의 rideMethod");
	}
//	loadMethod는 오버로딩 된 메서드 : 부모와 매개변수가 다름
	public void loadMethod(double num) {
		System.out.println("C의 loadMethod");
	}
//	따라서 C클래스로 인스턴스를 생성하면 오버로딩된 부모의 메서드는 가려지게되어 C클래스에서 오버라이딩 한 메서드만 남는다
}

public class E07RideAndLoad01 {
	public static void main(String[] args) {
//		부모타입의 참조변수로 자식 인스턴스 참조 가능
		A ref1 = new C();
		B ref2 = new C();
		C ref3 = new C();
		
//		참조변수의 타입과 상관없이 생성자의 클래스에서 오버라이딩 된 메서드가 호출됨
		System.out.println("오버라이딩 처리된 메서드");
		ref1.rideMethod(); //C
		ref2.rideMethod(); //C
		ref3.rideMethod(); //C
		
		System.out.println("오버로딩 처리된 메서드");
		
//		C타입 참조변수로 인스턴스 참조 -> 모든 영역 접근가능
		ref3.loadMethod();
		ref3.loadMethod(1);
		ref3.loadMethod(1.1);
		
//		B타입 참조변수로 인스턴스 참조 -> B 인스턴스까지 접근가능 
		ref2.loadMethod();
		ref2.loadMethod(1);
//		C에 정의된 메서드 접근불가
//		ref2.loadMethod(1.1);
		
//		A타입 참조변수로 인스턴스 참조 -> A 인스턴스까지 접근가능
		ref1.loadMethod();
//		B,C에 정의된 메서드 접근불가
//		ref1.loadMethod(1);
//		ref1.loadMethod(1.1);
	}
}
