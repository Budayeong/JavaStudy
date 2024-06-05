package ex12inheritance;

/*
오버라이딩(Overriding) : 자식클래스에서 부모 클래스의 멤버 메서드와 완전히 동일한 모양으로 메서드를 재정의 하는 것
- 오버로딩은 매개변수가 달라야하지만, 오버라이딩은 매개변수까지 모든 것이 동일해야함
- 자식클래스에서 오버라이딩한 메서드는 부모 클래스의 메서드를 가리게 됨 -> 항상 자식 클래스에서 오버라이딩 한 메서드가 호출됨
*/

//부모클래스 : 일반적인 스피커 추상화
class Speaker {
	
	private int volumnRate;
	
//	멤버변수가 private -> 외부에서 값을 설정할 수 있도록 setter메서드 정의
	public void setVolumn(int vol) {
		volumnRate = vol;
	}
	public void showState() {
		System.out.println("스피커의 볼륨크기: " + volumnRate);
	}
}

//자식클래스: 스피커 기능  + 베이스 보강된 스피커 추상화
class BaseSpeaker extends Speaker {
//	멤버변수와 setter정의
	private int baseRate;
	public void setBase(int bas) {
		baseRate = bas;
	}
	
	
//	@Override : 어노테이션, 오버라이딩 된 메서드에 추가하여 컴파일러에게 알려주는 역할 (생략가능)
	@Override
	public void showState() {
//		super를 통해 부모클래스에 정의된 멤버메서드 호출 -> 오버라이딩된 showState가 아니라 부모의 showState를 호출
		super.showState();
		System.out.println("베이스의 볼륨크기: " + baseRate);
	}
	
	
}

public class E06Overriding {
	public static void main(String[] args) {
		
//		자식생성자로 인스턴스 생성 -> 부모/자식 멤버에 모두 접근 가능
		BaseSpeaker baseSpeaker = new BaseSpeaker();
		baseSpeaker.setVolumn(10);
		baseSpeaker.setBase(20);
//		자식생성자로 만든 인스턴스에서 오버라이딩 된 메서드를 호출하면 자식의 showState가 호출됨 (부모의 showState가 덮어씌워짐)
		baseSpeaker.showState(); //볼륨과 베이스 출력
		
		System.out.println();
		
//		부모클래스 타입 -> 자식인스턴스 중 부모인스턴스까지 접근가능
		Speaker speaker = new BaseSpeaker();
		speaker.setVolumn(30);
//		자식 멤버 접근 불가능
//		speaker.setBase(40);
//		접근과 별개로 자식인스턴스가 생성되면서 메서드가 오버라이딩된 상태이기 때문에 showState는 자식의 메서드가 호출된다
		speaker.showState();
	}
}
