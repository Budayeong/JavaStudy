package ex08class;

/*
추상화(Abstraction) : 현실셰계 사물을 클래스로 형상화하는 것
- Person클래스는 "사람"의 일반적인 속성을 클래스로 추상화한 것

클래스 네이밍 규칙
- 선언 시 class 예약어 사용
- 첫글자는 대문자
- public 클래스는 하나의 java 파일에 하나만 존재
- 파일명과 public 클래스 명은 동일


*/
public class E01PersonMain {

	public static void main(String[] args) {
		
//		Person 클래스를 통해 인스턴스 생성. 생성시 할당된 주소값을 반환하고, 좌측항의 참조변수가 그 값을 할당받게 됨.
		Person person = new Person();
//		person객체 저장 주소 반환(참조값)
		System.out.println("person=" + person);
		
//		인스턴스 변수를 통해 멤버메서드 호출
		person.eat();
		person.sleep();
		
//		참조변수없이 호출 가능
		new Person().eat();
		new Person().sleep();

	}

}

class Person {
	
//	멤버 변수: 클래스에서 속성(데이터) 표현
	String name ="김무열";
	int age = 47;
	String gender ="남자";
	String job = "영화배우";

//	멤버 메서드: 클래스에서 객체의 동작(행위) 표현. 클래스 외부에서 호출 시 .(닷)으로 접근
//	- 멤버 변수는 멤버 메서드 내에서 즉시 사용 가능
	void eat() {
		System.out.printf("%s이 식사를 한다\n" , name);
	}
	
//	넓은 지역(클래스)에서 생성된 멤버변수는 좁은지역(멤버메서드)에서 사용 가능
	void sleep() {
		System.out.printf("나이가 %d인 %s이 잠자고 있다.\n", age, name);
	}
}
