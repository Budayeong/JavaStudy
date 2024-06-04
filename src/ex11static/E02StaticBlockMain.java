package ex11static;

/*
static 블럭 : 동일 클래스 내 main()메서드보다 먼저 실행되는 블럭으로 main메서드의 실행코드가 없어도 먼저 실행됨. (생성자보다도 먼저 실행)
	- 프로그램 전처리가 필요한 경우 사용
*/
public class E02StaticBlockMain {
	 
//	인스턴스형 멤버
	int instanceVar;
	void instanceMethod() {}
 
//	정적 멤버
	static int staticVar;
	static void staticMethod() {
		int localVar = 0;
		System.out.println("정적메소드");
	}
 
//	static 블럭 정의
	static {
 
//		블럭내에서 정적멤버변수에 접근 가능
		staticVar = 1000;		
 
//		블럭내에서만 사용할 수 있는 변수. 블럭내에서는 일반변수를 생성 후 사용할 수 있다.
		int localVar;
		localVar = 1000;
		System.out.println("localVar="+ localVar); 
		
//		static 블럭 내에서 인스턴스형 멤버 사용불가
//		System.out.println("instanceVar="+ instanceVar);  
//		instanceMethod();
 
		System.out.println("staticVar="+ staticVar);
		staticMethod();
		
		System.out.println("===static block 끝===");
	}
 
//	생성자
	public E02StaticBlockMain() {
 
		staticVar = -1;
		System.out.println("==StaticBlock의 생성자==");
	}
	
	public static void main(String[] args) {
		
		System.out.println("==메인메소드==");		
	 
//		static 블럭내에서 선언된 변수는 지역변수
//		System.out.println("localVar="+ localVar);
		 
//		new를 통해 해당클래스의 인스턴스 생성
		new E02StaticBlockMain();
	}
}

