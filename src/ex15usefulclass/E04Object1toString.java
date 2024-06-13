package ex15usefulclass;

/*
Object 클래스
- 개발자가 정의한 모든 클래스는 Object를 상속받음
- Ex) Object obj = new Person() 혹은 void myFn(Object obj){}

toString() 메서드
- Object에 정의된 메서드로 print()문이 문자열을 출력하기전에 자동으로 호출됨
- 인스턴스 변수를 문자열 형태로 변환하여 반환함
*/

class myFriends extends Object {
	String myName;
	public myFriends(String name) {
		myName = name;
	}
	
//	toString을 객체의 내용을 반환하도록 오버라이딩
	@Override
	public String toString() {
		return "이름: " + myName;
	}
}

//toString 오버라이딩 X -> Object의 기본 toString내용 사용
class yourFriends extends Object {
	String myName;
	public yourFriends(String name) {
		myName = name;
	}
}

public class E04Object1toString {
	public static void main(String[] args) {
		
		myFriends fnd1 = new myFriends("성유겸");
		yourFriends fnd2 = new yourFriends("헬로비너스");
		
//		둘다 toString이 호출되지만, fnd1는 오버라이딩되었기때문에 객체의 내용이 출력됨
		System.out.println(fnd1);
		System.out.println(fnd2);
		
	}
}
