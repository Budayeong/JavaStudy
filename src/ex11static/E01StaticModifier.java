package ex11static;

/*
statc 멤버
	- static멤버는 JVM(에 의해 프로그램이 시작되는 시점에 초기화됨
	- main() 메서드가 실행되기 전 초기화되므로 main 메서드 실행 시 사용가능
	
접근방법
	- 클래스 내부 : 변수명으로 접근 (일반 멤버변수와 동일)
	- 클래스 외부 : 
		1. 객체생성 후 변수를 통해 접근
		2. 인스턴스 생성없이 클래스명.static멤버명 으로 접근 (권장)
*/
class MyStatic {
//	일반 멤버는 인스턴스를 생성하는 시점에 메모리에 로드됨 
	int instanceVar;
//	static멤버 - 인스턴스 생성 없이 클래스명으로 바로 접근가능한 멤버. JVM이 프로그램을 시작할때 미리 메모리(Method영역)에 로드됨.
	static int staticVar;
	
//	인스턴스형 멤버메서드 : 모든 멤버 사용 가능 (static 포함)
	void instanceMethod() {
		System.out.println("instanceVar= " + instanceVar);
		System.out.println("staticVar= " + staticVar);
		staticMethod();
	}
	
//	static 메서드 : static 멤버만 사용가능 (* main메서드에서도 static으로 선언된 메서드만 호출가능)
	static void staticMethod() {
//		System.out.println("instanceVar= " + instanceVar); //에러
		System.out.println("staticVar= " + staticVar);
//		instanceMethod(); //에러
	}
}

public class E01StaticModifier {
	public static void main(String[] args) {
	
//		일반 멤버에 접근하는 방법: 클래스 객체 생성 후 참조변수를 통해 접근
		MyStatic myStatic = new MyStatic();
		myStatic.instanceVar = 100;
		System.out.println("myStatic.instanceVar= " + myStatic.instanceVar);
		
//		static 멤버에 접근하는 방법 : 클래스 객체 생성없이 바로 클래스명을 통해 접근
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar= " + MyStatic.staticVar);
		
//		static 멤버도 참조변수를 통해 접근할 수 있지만 권장하지 않음 (=static 멤버로 선언한 이유가없음)
		myStatic.staticVar = 300;
		System.out.println("myStatic.staticVar= " + myStatic.staticVar);
		
		//////////////////////////
		
//		두개의 인스턴스 생성
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
//		각 인스턴스 내부에 존재하는 멤버변수에 100과 1000을 할당
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		System.out.println("ms1.instanceVar= " + ms1.instanceVar); //100
 		System.out.println("ms2.instanceVar= " + ms2.instanceVar); //1000
		
// 		static은 메모리(Method영역)에 한번만 생성. 같은 클래스의 인스턴스를 여러번만들어도 메모리를 공유함
// 		따라서 객체생성 후 참조변수를 통한 접근은 권장하지않음 (서로다른 변수에 값을 할당하는 것으로 보임)
//		ms1.staticVar = 800;
//		ms2.staticVar = 900;
		MyStatic.staticVar = 800;
		MyStatic.staticVar = 900;
		
		System.out.println("ms1.staticVar= " + ms1.staticVar);
		System.out.println("ms2.staticVar= " + ms2.staticVar);

		myStatic.instanceMethod();
		myStatic.staticMethod(); //권장 X
		
//		MyStatic.instanceMethod(); //에러
		MyStatic.staticMethod(); //권장 O
		
// 일반 멤버는 인스턴스 생성 후 참조변수를 통해, static멤버는 인스턴스 생성없이 클래스명을 통해 접근		
	}
}
