package ex17collection;

//오렌지 클래스
class Orange {
//	당도
	int sugar;
	public Orange(int sugar) {
		this.sugar = sugar;
	}
	
	public void showInfo() {
		System.out.println("오렌지의 당도는 "+ sugar + "입니다");
	}
}


//오렌지 박스 : Orange 인스턴스만 저장가능
class OrangeBox {
	Orange item;
	
//	setter
	public void store(Orange item) {
		this.item = item;
	}
	
//	getter
	public Orange pullOut() {
		return item;
	}
}


//과일상자
class FruitBox{
	Object item;
	public FruitBox(Object item) {
		this.item = item;
	}
	public void store(Object item) {
		this.item = item;
	}
	
	public Object pullOut() {
		return item;
	}
	
}


public class Ex01GenericBasic {
	public static void main(String[] args) {
		
//		상자1은 오렌지 전용박스이므로 다른과일을 저장할 수 없다 
//		=> 자료형에 안전, 다른 인스턴스 저장을 위해서는 다른 Box클래스 생성 필요
		OrangeBox oBox1 = new OrangeBox();
		Orange orange1 = new Orange(10);
		oBox1.store(orange1);
		orange1 = oBox1.pullOut();
		orange1.showInfo();
		
//		Orange가 아닌 인스턴스를 저장하면 즉시 컴파일에러 발생
//		oBox1.store("당도가 20인 오렌지");
//		Orange orange2 = oBox1.pullOut();
//		orange2.showInfo();
		
//		FruitBox는 Object 기반으로 생성되어 모든 객체를 받을 수 있지만 논리적인 오류 발생위험
		FruitBox fBox1 = new FruitBox(new Orange(20));
		Orange orange3 = (Orange)fBox1.pullOut();
		orange3.showInfo();
		
//		String 타입은 과일타입이 아님 -> 다운캐스팅 에러발생
		FruitBox fBox2 = new FruitBox("당도가 30인 오렌지");
//		Orange orange4 = (Orange) fBox2.pullOut(); //런타임 에러
//		orange4.showInfo();
		
	}
}
