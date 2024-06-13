package ex18lambda;

/*
인터페이스 -> 추상 클래스로 변경가능 (인터페이스에는 abstract 메서드만 존재가능하기때문)
abstract class ISchool1 {
	abstract void studyLambda(String str);
}

인터페이스의 필드에는 public static final, 메서드에는 public abstract이 자동으로 붙는다
*/

//1. 인터페이스와 클래스를 활용한 가장 일반적인 오버라이딩
interface ISchool1 {
	void studyLambda(String str);
}

class Student1 implements ISchool1 {
	@Override
	public void studyLambda(String str) {
		System.out.println(str + "을 공부합니다");
	}
}

public class Ex01NormalClass {
	public static void main(String[] args) {
	
//		메서드 하나를 사용하기 위해 인터페이스 implements 한 클래스 -> 오버라이딩 -> 인스턴스 생성의 과정을 거쳐야함
		ISchool1 sch = new Student1();
		sch.studyLambda("람다식");
		
	}
}
