package ex08class;

/*
시나리오] 다음에 주어진 조건으로 '사람'을 추상화 하시오
- 속성: 이름, 나이, 에너지
- 행동: 걷는다, 생각한다, 먹는다, 현재상태표현
- 행동의 조건:
	먹으면 에너지 2 증가
	걸으면 에너지 1 감소
	생각하면 에너지 2 감소
	단, 에너지의 최대/최소 범위는 0~10
	무한히 먹을 수 없고, 에너지는 마이너스가 될수 없기 때문
*/
public class Human {
	
//	멤버변수: 객체의 속성 표현
//	- 산술연산이 필요치않다면 나이도 String으로 설정해도 됨
//	- 에너지의 경우 증감이 필요 -> 반드시 int로 설정
	String name;
	int age;
	int energy;
	
//	멤버 메서드: 객체의 동작 표현
	void walking() {
//		walking() : 걷기 표현 메서드, 호출될때마다 에너지 1 차감.
		energy--;
//		차감한 결과가 음수라면 해당 시나리오의 조건을 위배하므로 0으로 고정시킴
		if(energy<0) {
			energy = 0;
			System.out.println("[walk] 에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else System.out.println("[walk]에너지가 1 감소하였습니다");
	}
	
//	thinking() : 생각 표현 메서드
	void thinking() {
		energy -= 2;
		if(energy<0) {
			energy = 0;
			System.out.println("[thinking]에너지는 0이 최소입니다.");
			System.out.println("0으로 고정됩니다.");
		}
		else System.out.println("[thinking]에너지가 2 감소하였습니다.");
	}
	
//	eating() : 먹기 표현 메서드, 호출될때마다 2 증가 후 10을 초과한다면 10으로 고정
	void eating() {
		energy += 2;
		if(energy>10) {
			energy = 10;
			System.out.println("[eat]에너지는 10이 최대치입니다");
		}
		else System.out.println("[eat]에너지가 2 증가하였습니다");
	}
	
//	showState() : 인스턴스 상태 출력 메서드, 멤버변수 사용 가능
	void showState() {
		System.out.println("=== 님의 현재상태는 ===");
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("에너지: " + energy);
		System.out.println("==================");
	}
	
	
}
