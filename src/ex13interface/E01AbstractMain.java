package ex13interface;

/*
추상클래스
 - 상속을 목적을 제작됨, 인스턴스 생성은 허용되지 않음
 - 대부분 추상메서드를 포함하고 있음
 - 클래스의 상속관계에서 설계도와 같은 역할

추상메서드
- 오버라이딩 목적으로 선언
- 실행부 없음
*/

//추상 클래스 1. 추상메서드 포함 X
abstract class AbsClass1 {
//	int형으로 표현 가능한 최대값을 표현한 정적상수
	public static final int MAX_INT = Integer.MAX_VALUE;
	
	void instanceMethod() {}
	static void staticMethod() {}
}

//1-1. 추상메서드가 없는 추상클래스 상속 -> 오버라이딩 필수 X, 필요한 경우에만 오버라이딩
class AbsClasschild1 extends AbsClass1 {
	@Override
	void instanceMethod() {
		System.out.println("선택적 오버라이딩");
	}
}

//추상 클래스 2. 추상메서드 포함 O
//추상메서드를 포함하고있기때문에 반드시 abstract class 로 선언해야함
abstract class AbsClass2 {
//	메서드 실행부가 없음 ( {} ) -> abstract 메서드로 선언해야함
	abstract void absMethod(int number);
}

//추상클래스를 상속하면 부모가 가진 추상메서드를 상속받음 -> 자식 클래스도 abstract으로 선언하거나 추상메서드를 완성(Overriding)해야함.
//하지만 자식 클래스도 추상클래스로 선언하면 인스턴스를 생성할 수 없음 => 오버라이딩으로 메서드 완성시킬 것
class AbsClassChild2 extends AbsClass2 {

//	오버라이딩으로 미완성된 부모의 추상메서드를 완성시킴 -> 더이상 추상메서드를 포함하지않는 상태
	@Override
	void absMethod(int number) {
		System.out.println("필수 오버라이딩");
	}
	
	void newMethod() {
		System.out.println("확장한 메서드");
	}
	
}

public class E01AbstractMain {
	public static void main(String[] args) {
		
//		추상클래스는 인스턴스 생성 불가
//		AbsClass1 absClass1 = new AbsClass1();
		
//		추상클래스를 완성한 하위클래스는 인스턴스 생성 가능
		AbsClasschild1 absClassChild1 = new AbsClasschild1();
		
//		추상클래스는 인스턴스 생성불가, 타입으로 사용 가능 (부모타입 참조변수로 자식 인스턴스 참조)
		AbsClass2 absClass2 = new AbsClassChild2();
//		부모의 멤버메서드 호출 -> AbsClassChild2 에서 오버라이딩 되었기때문에 AbsClassChild2에서 재정의 된 내용으로 동작됨
		absClass2.absMethod(100);
//		부모타입으로 자식멤버에 접근하려면 다운캐스팅 필요
		((AbsClassChild2)absClass2).newMethod();
		
//		추상클래스 내 static메서드는 오버라이딩의 대상이되지않는다
		AbsClass1.staticMethod();
		AbsClasschild1.staticMethod();
		System.out.println("int형의최대값:" + AbsClass1.MAX_INT);
		System.out.println("int형의최대값:" + AbsClasschild1.MAX_INT);
		
	}
}
