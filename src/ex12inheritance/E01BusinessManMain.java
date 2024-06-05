package ex12inheritance;

/*
상속(Inheritance) : 기존에 정의된 클래스에 새로운 클래스를 확장해 정의하는 것. 
	- extends 키워드 사용
*/


//부모(상위)클래스 : 일반적인 사람 추상화
class Man {
	
//	private -> Man 클래스 내부에서만 접근가능
	private String name;
	
//	생성자 오버로딩으로 2개 정의
	public Man() {
		System.out.println("Man클래스 디폴트 생성자 호출");
	}
	
	public Man(String name) {
		this.name = name;
		System.out.println("Man 클래스 인자 생성자 호출");
	}
	
//	같은 클래스이기때문에 private 멤버에도 접근가능
	public void tellYourName() {
		System.out.println("내 이름은 " + name + "입니다");
	}
}


//Man의 자식클래스 : 회사원 추상화
class BusinessMan extends Man {
	
	private String company;
	private String position;

	
//	상속받은 자식 클래스는 부모클래스의 생성자를 호출해 부모 인스턴스가 메모리에 먼저 생성되도록 해야함.
//	super()는 부모클래스의 생성자로, 기술하지않으면 자동 호출됨
	public BusinessMan(String name, String company, String position) {
//		부모 클래스의 매개변수 1개인 생성자 호출. 남은 두개의 매개변수로 자식 멤버변수 초기화.
		super(name);
		this.company = company;
		this.position = position;
		System.out.println("BusinessMan 생성자 호출");
	}
	
	public void tellYourInfo() {
		System.out.println("회사명은" + company + "입니다");
		System.out.println("직급은" + position + "입니다");
//		부모클래스의 private 변수는 접근불가. 
//		System.out.println("이름은" + name + "입니다");
//		부모클래스 public 메서드를 통해 간접적으로 접근가능
		tellYourName();
	}
	
}



public class E01BusinessManMain {
	public static void main(String[] args) {
		
		BusinessMan man1 = new BusinessMan("김천국", "NAVER", "팀장");
		BusinessMan man2 = new BusinessMan("이낙원", "DAUM", "부장");
		
		man1.tellYourInfo();
		man1.tellYourName();
		
		man2.tellYourInfo();
		man2.tellYourName();
	}
}
