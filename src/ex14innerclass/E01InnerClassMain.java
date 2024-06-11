package ex14innerclass;

/*
내부 클래스 (Inner class)
: 클래스 내부에 정의된 클래스로 static 멤버가 없음
- 외부 클래스의 모든 멤버 사용가능
- static 멤버 가질 수 없음, 상수 가질 수 있음
- 컴파일시 외부클래스명$내부클래스명.class 파일 생성
- 이벤트 기반의 프로그래밍에서 많이 사용됨
*/
class Unit { 
	private String name;
	private int healthPoint;
	
	Marine marine;
	Medic medic;
	
	public Unit(String name, int healthPoint) {
		this.name = name;
		this.healthPoint = healthPoint;
//		인스턴스형 멤버변수 생성 및 초기화
		marine = new Marine();
//		이너클래스 인스턴스는 외부클래스 생성자에서도 가능하고 외부에서도 가능
//		medic = new Medic();
	}
	
	public String infoStr() {
		return "유닛정보 [이름:" + name + ", 체력: "+ healthPoint + "]";
	}

	class Marine {
//		내부 클래스도 일반클래스와 동일하게 멤버 정의 가능
		int attckPower;
		public void attack() {
			System.out.println(infoStr() + "\n마린이 공격한다");
		}
	}
	
	class Medic {
		int healPower;
		public void heal() {
			System.out.println(infoStr() + "\n메딕이 치료한다.");
		}
	}
}	

public class E01InnerClassMain {
	public static void main(String[] argsㅋ) {
		
		Unit unit = new Unit("커맨드센터", 1000);
		System.out.println(unit.infoStr());
		
//		외부클래스가 아닌 다른 클래스 -> 인스턴스 생성 불가
//		Margine m = new Margin();
		
		Unit.Marine marine = new Unit("마린", 50).marine;
		marine.attack();
		
//		Medic의 경우 Unit의 생성자에서 인스턴스 생성이 되지않았으므로 new 키워드를 통ㅎ애 생성
		Unit.Medic medic = new Unit("메딕", 30).new Medic();
		medic.heal();
	}
}
