package ex17collection;

//과일을 추상화한 클래스 (Apple, Banana)
class Apple {
	int weight;
	
	public Apple(int w) {
		weight = w;
	}
	
	public void showInfo() {
		System.out.println("사과의 무게는 " + weight + "입니다");
	}
}

class Banana {
	int sugar;
	
	public Banana(int s) {
		sugar = s;
	}
	
	public void showInfo() {
		System.out.println("바나나의 당도는 " + sugar + "입니다");
	}
}

//class FruitBox{
//	Object item;
//	public FruitBox(Object item) {
//		this.item = item;
//	}
//	public void store(Object item) {
//		this.item = item;
//	}
//	
//	public Object pullOut() {
//		return item;
//	}
//	
//}
//	=> 기존 Object 기반의 FruitBox를 아래 제네릭 클래스로 변경

//제네릭 클래스 정의
class GenericFruitBox<T> {
	T item;
	public void store (T item) {
		this.item = item;
	}
	
	public T pullOut() {
		return item;
	}
}


public class Ex02GenericClass {
	public static void main(String[] args) {
		
//		Box 인스턴스를 생성할때 T부분이 결정됨 => 편의성
		GenericFruitBox<Apple> appleBox = new GenericFruitBox<Apple>();
		appleBox.store(new Apple(10));
		Apple apple = appleBox.pullOut();
		apple.showInfo();

		GenericFruitBox<Banana> bananaBox = new GenericFruitBox<Banana>();
		bananaBox.store(new Banana(20));
		Banana banana = bananaBox.pullOut();
		banana.showInfo();
		
//		Orange 클래스가 동일 패키지에 존재 -> 임포트없이 사용가능
		GenericFruitBox<Orange> orangeBox = new GenericFruitBox<Orange>();
//		orangeBox는 Orange 저장 용도로 생성 -> 다른 타입 인스턴스는 저장 불가 => 안정성
//		orangeBox.store("나는 오렌지");
//		orangeBox.store(apple);
//		orangeBox.store(banana);
		
		
	}
}
