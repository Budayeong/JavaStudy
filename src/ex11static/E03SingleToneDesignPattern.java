package ex11static;

/*
싱글톤 디자인패턴 : 하나의 인스턴스(하나의 메모리)를 할당 한 후 이를 프로그램 전체에서 공유해서 사용할때 쓰는 패턴.
*/

//일반 클래스
class NoSingleTone {
	int instVar;
//	생성자가 public -> 외부에서 생성자 접근가능(=> new키워드로 객체생성가능)
	public NoSingleTone() {}
}

//싱글톤 패턴이 적용된 클래스
class SingleTone {
	int shareVar;
//	정의한 클래스와 동일한 타입으로 선언된 정적 멤버변수, JVM에 의해 프로그램이 시작될때 Method영역에 로드됨
	private static SingleTone single = new SingleTone();
	
//	생성자가 private -> 외부에서 접근 불가 (=> 외부에서 new키워드로 객체생성불가능 / 클래스 내부에서는 new로 객체생성가능)
	private SingleTone() {}
	
//	SingleTone 객체 외부에서 사용가능하게 하기위해 public static 메서드 정의
//	SingleTone 객체의 참조값을 반환함
	public static SingleTone getInstance() {
		return single;
	}
	
//	멤버변수 출력
	void print() {
		System.out.println(String.format("shareVar=%d", shareVar));
	}
}

public class E03SingleToneDesignPattern {
	public static void main(String[] args) {
		
//		일반클래스 인스턴스 생성 -> new로 생성할때마다 새로운 객체가 만들어짐 (새로운 메모리 할당)
		NoSingleTone nst1 = new NoSingleTone();
		nst1.instVar = 100;
		System.out.println("nst1=" + nst1); //100
		
		NoSingleTone nst2 = new NoSingleTone();
		nst2.instVar = 200;
		System.out.println("nst2=" + nst2); //200
		
//		SingleTone 클래스의 생성자가 private이기때문에 접근이 불가능 (생성자 not visible = 생성자가 보이지않는다)
//		SingleTone st1 = new SingleTone(); 
		
//		SingleTone 클래스의 public static 메서드를 통해서 이미 생성되어있는 private 싱글턴 인스턴스의 참조값을 얻어옴
		SingleTone st2 = SingleTone.getInstance();
		st2.shareVar = 100;
		st2.print();
		
		SingleTone st3 = SingleTone.getInstance();
		st3.shareVar = 200;
		st3.print();
		
//		st2, st3 모두 같은 참조값이므로 하나의 값이 출력됨
		System.out.println(String.format("st2의주소: %s" , st2));
		System.out.println(String.format("st3의주소: %s" , st3));

//		동일한 인스턴스를 사용한 것이므로 마지막에 할당된 200이 출력
		System.out.println(String.format("st2의 shareVar: %d" , st2.shareVar)); //200
		System.out.println(String.format("st3의 shareVar: %d" , st3.shareVar)); //200
		
	}
}
