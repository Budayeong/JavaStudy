package ex14innerclass;

/*
익명클래스(Anonymous class)
- 이름이 없는 클래스
- 내부클래스처럼 이벤트 기반의 프로그래밍에서 많이 사용
//- 부모클래스의 메서드를 오버라이딩하는 것이 목적
- 마지막에 세미콜론!

형식]
	부모클래스명 참조변수 = new 부모클래스명(){
		익명클래스의 실행부;
		부모클래스의 메서드 오버라이딩;
		};

- 이름없는 자식클래스를 생성하는 개념으로, {} 안쪽 영역은 "자식"의 영역.
*/

//가수 클래스
class Singer {
	String name;
	public Singer(String name) {
		this.name = name;
	}
	
//	toString: Object 클래스에 정의됨. 객체가 가진 값을 문자열로 반환
	@Override
	public String toString() {
		return "이름: "+name; 
	}
}

//걸그룹 클래스
class GirlGroup extends Singer {
	String team;
	
	public GirlGroup(String name, String team) {
		super(name);
		this.team = team;
	}

//	부모의 toString을 호출하기위해 super 사용
	@Override
	public String toString() {
//		이름, 팀명 반환
		return super.toString() +", 팀명: " + team;
	}
}

//메서드에 public abstract 자동 생성됨
interface ISinger {
	public void dancing();
}

public class E02AnonymousClass {
	public static void main(String[] args) {
		
//		부모클래스를 통해 인스턴스 생성
		Singer s1= new Singer("조용필");
//		toString을 오버라이딩했기때문에 toString 메서드의 내용이 출력됨
		System.out.println(s1);
		
//		자식클래스를 통해 인스턴스 생성
		Singer s2 = new GirlGroup("츄","이달의소녀");
		System.out.println(s2);
		
		/*
		GirlGroup클래스를 상속받은 익명클래스 정의
		: Singer타입 변수에 GirlGroup을 상속받은 익명클래스를 생성해 그 참조값을 할당함
		개념적으로 new GirlGroup() {}; = 익명 extends GirlGroup 과 같다
		이름없는 인스턴스이므로 부모 클래스의 이름을 빌려서 자식의 영역을 만든다고 생각하면 됨
		*/
		Singer s3 = new GirlGroup("아이린", "레드벨벳") {
//			자식에서 확장한 멤버변수
			boolean mic = true;
			@Override
			public String toString() {
				return super.toString() + ", 소속사: SM";
			}
		};
		
//		부모의 참조변수로 자식을 참조할 수 있지만, 접근범위가 부모까지로 제한됨 
//		사용하기 위해서는 다운캐스팅이 필요한데 익명이기때문에 다운캐스팅 불가 -> 즉, 익명클래스 밖에서 멤버변수 사용 불가
//		System.out.println(s3.mic);
		System.out.println(s3);
		
		/*
		오버라이딩은 부모에서 생성한 메서드를 자식에서 재정의하는 것 -> 재정의 할 것이기때문에 기능이 있는 메서드가 필요하지않다
		따라서 인터페이스에 정의된 추상메서드를 구현하여 익명클래를 만드는 경우가 많다.
		*/
		ISinger s4 = new ISinger() {
			@Override
			public void dancing() {
				System.out.println("춤추는게 좋아요");				
			}
		};
		s4.dancing();
		
	}
}
