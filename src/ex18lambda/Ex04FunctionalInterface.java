package ex18lambda;

/*
함수형 인터페이스
: 람다식은 추상메서드가 하나인 인터페이스로만 사용할 수 있다.
이렇게 람다식을 만들기 위한 인터페이스를 '함수형 인터페이스' 라고 한다.

@FunctionalInterface: 함수형 인터페이스임을 선언
	- 함수형 인터페이스의 조건을 갖추어야함으로 추상 메서드가 하나를 초과해 작성되면 에러
*/

@FunctionalInterface
interface ISchool4 {
	void studyLambda(String str);
//	함수형인터페이스에는 추상메서드 하나만 존재 가능
//	void studyLambda2(String str);
}

public class Ex04FunctionalInterface {
	
//	main 메서드에서 정의한 람다식의 참조변수는 ISchool4 타입이므로 아래와 같이 매개변수로 전달받은 후 studyLambda() 호출 가능
	static void execute(ISchool4 school4, String s) {
		school4.studyLambda(s);
	}
	
	public static void main(String[] args) {
		ISchool4 sch = (str) -> System.out.println("ISchool4를 구현받아 정의한 람다입니다." + str);
		
//		앞서 정의한 람다식을 메서드의 인수로 전달 -> 람다식 참조값이 전달되어 람다식의 기능을 호출 가능
		execute(sch, "\n람다를 매개변수로 전달합니다");
		
	}
}
