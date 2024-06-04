package ex08class;

//자동차를 추상화 한 클래스 정의
class Car {
//	멤버변수: 자동차 모델명, 소유주
	String carModel;
//	소유주를 표현한 멤버변수는 Human 타입
	Human owner;
//	직접 정의한 클래스는 객체를 표현하기 위한 용도로 Java에서는 하나의 자료형으로 사용됨
//	객체를 표현하는 또 하나의 자료형을 생성하는 것이 class를 정의하는 목적
	
//	초기화 메서드 1: 매개변수없음. 항상 고정된 값으로 멤버변수를 초기화함. (확장성X)
	void initialize() {
		carModel = "람보르기니";
//		자동차 소유주를 표현한 Human타입의 멤버변수 인스턴스 생성 후 초기화
		owner = new Human();
		owner.name = "스티브로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	
//	초기화 메서드 2: 오버로딩 된 메서드. 입력받은 값으로 초기화를 진행함.
	void initialize(String model, String name, int age, int energy) {
		carModel = model;
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	
//	운전 표현 메서드
	void drive() {
//		owner는 인스턴스이므로 이름을 출력하기위해 '변수명.name'과 같이 기술해야함
		System.out.println(owner.name + "이(가)" + carModel + "을 운전한다.");
	}
	
//	인스턴스의 현재 상태 출력 메서드
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
//		owner 인스턴스의 멤버메서드 호출을 통해 정보출력
		owner.showState();
	}
	
}

public class E03CarMain {
	public static void main(String[] args) {
		
//		car1 객체 - 매개변수가 없는 initialize메서드를 호출해 기본정보(람보르기니)로 초기화
		Car car1 = new Car();
		car1.initialize();
		car1.showCarInfo();
		
//		car2 객체 - 메서드를 사용하지않고 직접 멤버변수 owner에 접근해 초기화. 멤버변수를 초기화할때마다 아래 코드를 반복작성해야함.
		Car car2 = new Car();
		car2.carModel = "밴틀리";
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		car2.showCarInfo();
//		car3 객체 - 매개변수가 있는 initialize메서드를 사용해 값을 전달해 초기화
//		initialize메서드를 통해 쉽게 여러형태의 인스턴스 생성 가능
		Car car3 = new Car();
		car3.initialize("스포츠카", "성유겸", 8, 10);
		car3.showCarInfo();
		
//		car 4 객체 = 생성만 하고 초기화하지않은 상태로 출력시도 -> 예외발생
		Car car4 = new Car();
		car4.showCarInfo();
		
	}
}

