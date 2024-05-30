package ex05metod;

/*
메서드 오버로딩(Overloading) : 동일한 이름의 메서드를 2개이상 정의하는 것
- 매개변수의 개수, 자료형이 다를 때 성립
- 컴파일러는 메서드 호출 시 전달되는 인수를 통해 호출할 메서드 구분
*/
public class E07Overloading {
	
//	int타입 매개변수 두개가 들어올때 호출
	static void person(int juminNum, int milNum) {
		System.out.println("군필자 이시군요");
		System.out.println("주민번호: "+juminNum);
		System.out.println("군번: " + milNum);
	}
	
//	int 타입 매개변수 하나가 들어오면 호출
//	static void person(int juminNum) {
//		System.out.println("미필자이거나 여성이군요");
//		System.out.println("주민번호:" + juminNum);
//	}
	
//	반환타입이 달라도 매개변수가 같은 int타입 하나를 받기때문에 오버로딩 성립X
//	- why? :person(10)으로 호출 시 어떤 메서드를 호출할지 모호함
	static int person(int juminNum) {
		System.out.println("미필자이거나 여성이시군요");
		System.out.println("주민번호: " + juminNum) ;
		return 1;
	}
	
	public static void main(String[] args) {
		
//		인수의 개수를 통해 호출할 메서드가 구분됨
		person(123456, 7890123);
		System.out.println("============");
		person(987654);
		
//		print()가 대표적인 오버로딩 메서드 -> 정수,실수 등 모든 타입대응가능
		System.out.println(10);
		System.out.println(3.14);
		System.out.println('A');
		System.out.println("오버로딩");
		System.out.println(true);
	}
	
}
