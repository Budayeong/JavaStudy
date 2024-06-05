package ex12inheritance;

/*
상속관계에서 오버로딩 vs 오버라이딩
- 오버로딩 : 자식 클래스에서 부모 클래스의 메서드를 받았기때문에 같은 이름의 메서드르 정의하려면 오버로딩해야함
- 오버라이딩: 부모클래스로부터 받은 메서드를 자식에서 재정의한 것. 오버로딩하게되면 부모 클래스의 메서드를 가리게 됨.
*/

class Atest {
	private void ride() {
		System.out.println("[A클래스] ride()");
	}
	
	public void getRide() {
		ride();
	}
	
}


class Btest extends Atest {
	public void ride() {
		System.out.println("[B클래스] ride()");
	}

}

class Ctest extends Btest {
	

}

public class test {
	public static void main(String[] args) {
		Btest b = new Btest();
		b.ride();
		Atest ab = new Btest();
		ab.getRide();
//		
	}
}
