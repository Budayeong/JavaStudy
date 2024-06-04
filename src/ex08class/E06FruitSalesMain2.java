package ex08class;

/*
두번째 Fruits 예제에서 멤버변수의 초기값을 모두 제거, 초기화를 위한 멤버메서드를 추가.
초기값이 미리 지정되어있으면 인스턴스 생성시 확장성이 떨어짐
*/
class Fruitseller2 {
	int numOfApple;
	int myMoney;
//	기존 멤버상수로 선언했던 부분을 일반멤버변수로 변경
//	상수는 선언과 초기화가 동시에 이루어져야함. 값을 받아서 사용하고싶다면 일반변수로 변경 필요.
	int apple_price;
	
//	멤버변수 초기화 메서드: 인스턴스 생성 후 다양한 형태로 초기화 가능
	public void initMembers(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		apple_price = price;
	}
	
//	사과 판매
	public int saleApple(int money) {
		int num = money / apple_price;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
//	현재상태 출력
	public void showSaleResult() {
		System.out.println("[판매자]남은사과개수: " + numOfApple);
		System.out.println("[판매자]판매수익:"+  myMoney);
	}
}

class FruitBuyer2 {
	int myMoney;
	int numOfApple;
	
//	멤버변수 초기화 메서드 추가
	public void initMembers(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
//	사과 구매
	public void buyApple(Fruitseller2 seller1, int money) {
		numOfApple += seller1.saleApple(money);
		myMoney -= money;
	}
	
//	현재상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple );
	}
}


//		클래스를 초기값이 없는 상태로 변경, 초기화 메서드 추가 -> 사앹가 다른 인스턴스 생성가능
public class E06FruitSalesMain2 {
	public static void main(String[] args) {
		
//		판매자1 : 사과 100개 보유, 단가 1000원
		Fruitseller2 seller1 = new Fruitseller2();
		seller1.initMembers(0, 100, 1000);
		
//		판매자2 : 사과 80개 보유, 단가 500원
		Fruitseller2 seller2 = new Fruitseller2();
		seller2.initMembers(0, 80, 500);
		
//		구매자 : 보유금액 10000원
		FruitBuyer2 buyer = new FruitBuyer2();
		buyer.initMembers(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
//		각각의 판매자에게 5000원씩 지불하고 사과 구매
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); //5개 판매
		seller2.showSaleResult(); //10개 판매
//		구매자는 10000원을 지불하고 15개의 사과를 구매
		buyer.showBuyResult();
		
		
	}
}
