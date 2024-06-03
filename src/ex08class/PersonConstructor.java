package ex08class;

/*
생성자(Constructor) : 클래스를 인스턴스화 할때 자동으로 호출되는 메서드
- 자동으로 호추로디며 임의로 호출할 수 없다
- 반환값이 없다. void 사용 X
- 생성자 내부에서 또 다른 생성자 호출 가능 ( this() )
- 오버로딩 가능
*/
public class PersonConstructor {
	String name;
	int age;
	String addr;
	
//	생성자 메서드
//	- 개발자가 직접 정의하지않으면 아래와 같은 '기본 생성자'(매개변수없음) 컴파일러에 의해 자동 삽입됨
//	- new 클래스명() -> 기본 생성자를 호출하는 것
//	public PersonConstructor() {}
	
//	생성자1. 매개변수가 없는 형태
	public PersonConstructor() {
//		매개변수가 없음 -> 지정된 값으로만 고정적으로 초기화됨
		name = "이름없음";
		age = 1;
		addr = "미상";
		System.out.println("나는 기본생성자 입니다");
	}
	
//	생성자2. 매개변수가 있는 형태 
	public PersonConstructor(String name) {
//		this : 클래스 자기자신을 가리킴. 
//		- 여기서는 멤버변수와 매개변수를 구분하기 위해 사용됨
		this.name = name;
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다");
	}
	
//	생성자3.
	public PersonConstructor(String name, int age) {
//		this() : 생성자에서 또 다른 생성자를 호출할때 사용
//			- 생성자 내에서만 사용 가능함 (일반 멤버메서드에서 사용 불가)
		this(name, age, "미상");
		System.out.println("나는 인자생성자[2]입니다");
	}
	
//	생성자4.
	public PersonConstructor(String _name, int age, String addr) {
		name = _name;
		
//		이름이 동일한 경우 this사용 권고
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3]입니다");
	}
	
//	멤버메서드 : 멤버변수 초기화 목적으로 정의함
	void initialize(String name, int age, String addr) {
//		this()는 생성자내에서만 사용 가능함 -> 에러발생
//		생성자는 인스턴스 생성 시 딱 한버난 호출되며 임의로 호출불가능하지만 멤버메서드는 언제든지 호출 가능 (-> 즉, 멤버메서드 안에 생성자 존재불가)
//		this(name, age, "미상"); 
		
//		멤버변수 구분을 위한 this는 사용가능
		this.name = name;
		this.age = age;
		this.addr =addr;
	}
	

	void showPersonInfo() {
		System.out.printf("%s 님의 정보\n" , this.name);
		System.out.printf("나이: %d\n" , age);
		System.out.printf("주소: %s\n", addr);
	}
	
}
