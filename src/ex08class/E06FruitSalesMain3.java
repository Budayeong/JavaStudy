package ex08class;

/*
세번째 예제에서는 생성자 ㄷ입
*/
class Fruitseller3 {
	int numOfApple;
	int myMoney;
//	멤버상수는 값의 변경이 불가능하고, 한번만 초기화됨 -> 선언/초기화 동시에 하거나 생성자이용
	final int APPLE_PRICE;
	
	public Fruitseller3(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
//		상수를 초기화하지않았는데 생성자에서 초기화하는 코드가 사라지면 에러 발생
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("[판매자]남은사과개수: " + numOfApple);
		System.out.println("[판매자]판매수익:"+  myMoney);
	}
}

class FruitBuyer3 {
	int myMoney;
	int numOfApple;
	
//	생성자 정의
	public FruitBuyer3(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(Fruitseller3 seller1, int money) {
		numOfApple += seller1.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple );
	}
}


public class E06FruitSalesMain3 {
	public static void main(String[] args) {
		
//		생성자를 사용 해 인스턴스 생성과 동시에 초기화 가능
		Fruitseller3 seller1 = new Fruitseller3(0, 100, 1000);
		
		Fruitseller3 seller2 = new Fruitseller3(0, 80, 500);
		
		FruitBuyer3 buyer = new FruitBuyer3(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
		buyer.buyApple(seller1, 5000);
		buyer.buyApple(seller2, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); 
		seller2.showSaleResult(); 
		buyer.showBuyResult();
		
		
	}
}
