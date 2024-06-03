package ex08class;

/*
해당 예제에서는 Human클래스를 별도의 파일로 작성. 동일한 패키지에 정의되었다면 해당 클래스를 찾아 인스터스화 가능.
다른 패키지에 선언된 클래스라면 import 선언 필요
*/
public class E02HumanMain {
	public static void main(String[] args) {
//		1. 클래스를 통해 인스턴스 생성. 참조변수(인스턴스형변수)는 스택에, 인스턴스는 힙에 생성됨.
		Human human = new Human();

//		2. 인스턴스 초기화: 참조변수를 통해 . 으로 접근.
//			- 여기선 human의 멤버변수에 초기값을 할당했음
		human.name = "마이클";
		human.age = 28;
		human.energy = 4;
		
//		3. 멤버메서드 호출: human의 동작 실행
		human.showState();	//인스턴스 초기상태 확인
		human.eating();
		human.walking();
		human.thinking();
		human.showState();	//멤버메서드 호출 후 변화된 상태 확인
		
//		4.반복문을 통해 메서드를 여러 번 호출 : 시나리오의 조건이 정확히 구현되었는지 확인하기 위함.
		for(int i=1 ; i<=20 ; i++) {
			human.walking();
		}
		human.showState();
		
		
		for(int i=1 ; i<=20 ; i++) {
			human.eating();
		}
		human.showState();
		
	}
}
