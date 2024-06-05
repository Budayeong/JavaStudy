package ex12inheritance;

//외부 패키지 사용을 위해 import 필요. public으로 선언된 클래스만 import가능
import ex12inheritance.map.Korea;

//부모(Korea)와 다른 패키지에 선언된 자식 클래스 Seoul
class Seoul extends Korea {
	
	private String city;

	public Seoul(String name, String city) {
		super(name);
		this.city = city;
	}
	
//	4개의 접근지정자 접근가능 여부 확인 -> 부모와 다른 패키지에 선언되어있으므로 default, private은 접근불가
	public void callMethod() {
		super.publicMethod("callMethod->");
		super.protectedMethod("callMethod->");
//		super.defaultMethod();
//		super.privateMethod();
	}
}

public class E02ProtectedInheritanceMain {
	public static void main(String[] args) {
		
		Seoul seoul = new Seoul("대한민국", "서울");
		seoul.callMethod();
		
	}

}
