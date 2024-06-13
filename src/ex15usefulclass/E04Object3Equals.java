package ex15usefulclass;

class MyClass {
	int data;
	public MyClass(int data) {
		this.data = data;
	}
	
//	toString(): 인스턴스가 가진 데이터를 String타입으로 반환해줌, print()가 호출될때 자동 호출됨
	@Override
	public String toString() {
//		정수를 String으로 변환해서 반환
		return "data=" + String.valueOf(data);
	}

//	equals를 오버라이딩 해 인스턴스 간 내용비교가 되도록 함
	@Override
	public boolean equals(Object obj) {
		/*
		매개변수로 전달된 인스턴스를 Object로 받음 
		-> 받은 인스턴스가 비교하려는 인스턴스와 같은 타입이어야 비교가 가능하기때문에 (부모타입으로 자식멤버 접근 불가능)
		다운캐스팅 여부 먼저 판단 (instanceOf)
		*/
		if(obj instanceof MyClass) {
			MyClass mc = (MyClass)obj;
//			클래스타입이 동일하게 된 후 인스턴스 내용비교 (멤버변수의 값 비교) 
			if(mc.data == this.data) {
				System.out.println("MyClass-멤버동일함");
				return true;
			}
			else {
				System.out.println("MyClass-멤버다름");
				return false;
			}
		}
//		다운캐스팅이 안되면 인스턴스 내용 비교가 불가
		else {
			System.out.println("MyCalss 객체아님");
			return false;
		}
	}
}

public class E04Object3Equals {
	public static void main(String[] args) {
		
//		내용이 동일한 인스턴스 2개 생성
		MyClass mc1 = new MyClass(10);
		MyClass mc2 = new MyClass(10);
		
		System.out.println("[두 객체를 비교연산자를 통해 비교]");
//		== 는 stack(참조자료형의 주소값)을 비교하게됨
		if(mc1==mc2)
			System.out.println("인스턴스 참조값이 같다");
		else
			System.out.println("인스턴스 참조값이 다르다");
		
//		오버라이딩한 equals를 사용해 인스턴스의 내용 비교
		System.out.println("[두 객체를 equals()메서드로 비교]");
		System.out.println(mc1.equals(mc2) ? "같다" : "다르다");
		
		System.out.println("[두 객체의 toString()메서드 호출]");
		System.out.println("mc1.toString()=> " + mc1.toString());
		System.out.println("mc2 => " + mc2);
		
	}
}
