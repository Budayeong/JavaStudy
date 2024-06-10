package ex12inheritance;

/*
다형성 (Polymorphism)
: 하나의 인스턴스를 여러 타이의 참조변수를 통해 참조할 때, 
참조변수의 타입에 따라 다양한 형태의 인스턴스를 이용할 수 있는 특성

1. 부모 타입의 참조변수로 자식 인스턴스를 참조 
	- 부모 클래스에 정의되 멤버까지만 접근 가능 (자식에서 확장한 멤버는 접근 불가)
	- 자식에서 오버라이딩 한 메서드가 호출
	- 이질화(Heterogeneous: 헤테로지니어스) 라고 표현
2. 동일한 타입의 참조변수로 인스턴스 참조
	- 인스턴스 전체에 접근 가능
	- 동질화(Homogeneous : 호모지니어스) 라고 표현
*/

class MyParent {
	int parentMember;
	void parentMethod() {
		System.out.println("부모의 메서드: paraentMethod()");
	}
}

class MyChild extends MyParent {
	int childMember;
	void childMethod() {
		System.out.println("자식의 메서드: childMethod()");
	}
//	부모에서 정의한 메서드를 오버라이딩
	@Override
	void parentMethod() {
		System.out.println("자식에서 Overriding한 메서드 parentMethod()");
	}
	
//	매개변수의 개수가 다른 같은 이름의 메서드 정의 -> 오버로딩
	void parentMethod(int childMember) {
		this.childMember = childMember;
		System.out.println("Overloading: 자식에서 확장한 메서드: parentMethod(param1)");
	}
	
}

public class E11Polymorphism {
	public static void main(String[] args) {
		
//		동질화 : 참조변수와 인스턴스의 타입이 동일
		MyChild myChild = new MyChild();
		
//		동질화의 경우 인스턴스 전체 멤버에 접근할 수 있다
		myChild.childMember = 10;
		myChild.parentMember = 100;
		myChild.childMethod();
//		오버로딩한 메서드
		myChild.parentMethod(1000);
//		오버라이딩한 메서드 (자식쪽의 메서드)
		myChild.parentMethod();

		
//		이질화: 부모타입의 참조변수로 자식인스턴스를 참조하는 것
		MyParent parent1 = myChild;
		parent1.parentMember = 1;
//		자식에서 새롭게 정의한 멤버 접근 불가 (접근이필요하다면 다운캐스팅)
//		parent1.childMember = 1;
//		오버라이딩한 메서드 -> 자식쪽이 호출됨
		parent1.parentMethod();
		
		MyParent myParent = new MyChild();
//		부모멤버 접근 가능
		myParent.parentMember = 1;
		myParent.parentMethod();
//		부모타입에서 자식멤버에 접근하려면 -> 다운캐스팅.
//		소괄호를 통해 우선수위 변경 필요
		((MyChild)myParent).childMember= 1;
		((MyChild)myParent).childMethod();
		((MyChild)myParent).parentMethod();
		
		MyChild child2 = (MyChild)myParent;
		child2.childMember = 1;
		child2.childMethod();
		child2.parentMethod(1);
		
		
//		Java의 최상위 클래스 Object
		Object object = new MyChild();
		((MyParent)object).parentMethod();
	}
}
