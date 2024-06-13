package ex18lambda;

//3. 람다식으로 구현 : oop에서는 메서드를 선언하기 위해 반드시 클래스 정의필요. 
//이러한 불편함 때문에 함수형 프로그래밍(Funtional Programming)장점 대두, 이런 JAVA의 단점보완을 위해 JDK1.8부터 람다식 지원
interface ISchool3 {
	void studyLambda(String str);
}


public class Ex03Lambda {
	public static void main(String[] args) {
		
//		2번예제 익명클래스를 다음과 같이 람다식으로 표현 가능
		
//		1. 함수명 제거. 부모 인터페이스로부터 오버라이딩했으므로 동일한 이름임을 알고있음
//		2. 람다식을 표현하기 위해 소괄호와 중괄호 사이 화살표 삽입, 좌측 sch1가 우측 자식영역을 참조하는 개념
		ISchool3 sch1 = (String str) -> {
			System.out.println(str + "을 드디어 써보네요!!");
		};
		sch1.studyLambda("람다식");
		
//		인터페이스의 abstract 메서드를 통해서 매개변수의 타입을 알 수 있기때문에 생략가능
//		실행문이 한줄 -> {} 생략가능
		ISchool3 sch2 = str -> System.out.println(str + "완전 간단..!!");
		sch2.studyLambda("람다식");
	}
}
