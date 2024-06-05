package ex12inheritance.map;

//부모 클래스 : 자식클래스와 다른 패키지에 선언
public class Korea {
	
	private String name;
	public Korea(String name) {
		this.name= name;
	}
	
	public void publicMethod(String loc) {
//		public으로 선언된 메서드는 어디서든 접근 가능
		System.out.println(loc + "publicMethod() 호출");
//		default로 선언된 메서드는 다른 패키지의 클래스에서 호출불가 -> public메서드를 통해 간접호출해야함
		defaultMethod("publicMethod->");
	}
	
	protected void protectedMethod(String loc) {
//		서로다른 패키지에 있는 클래스여도 상속관계라면 protected에 접근가능
		System.out.println(loc + "protectedMethod() 호출");
		privateMethod("protectedMethod->");
	}
	
	void defaultMethod(String loc) {
//		동일한 패키지 내 클래스에서 접근가능
		System.out.println(loc + "defaultMethod() 호출");
	}
	
	private void privateMethod(String loc) {
//		private -> 선언된 클래스 내부에서만 접근가능
		System.out.println(loc + "privateMehotd() 호출");
	}
	
}
