package ex08class;

//과일 판매자
class FruitSelelr {
//	판매자의 사과 보유수량, 수익금, 사과가격 정의
	int numOfApple = 100;
	int myMoney = 0;
//	멤버'변수' 인 경우 선언과 초기화 분리가능
//	멤버'상수'인 경우 선언과 초기화 분리 불가능 -> 동시에 해야함
	final int APPLE_PRICE = 1000;
	
//	매개변수로 받은 money원 만큼의 사과 개수 반환
	public int saleApple(int money) {
//		받은 금액을 단가로 나누어 개수 계산
		int num = money / APPLE_PRICE;
//		보유한 사과개수에서 판매할 개수만큼 차감
		numOfApple -= num;
//		판매한 금액 합산
		myMoney += money;
//		판매할 사과 개수 반환 -> 구매자에게 사과 전달
		return num;
	}
	
//	판매자의 현재상태를 출력
	public void showSaleResult() {
		System.out.println("[판매자]남은사과개수: " + numOfApple);
		System.out.println("[판매자]판매수익:"+  myMoney);
	}
}

//과일구매자
class FruitBuyer {
//	보유금액, 보유한 사과개수 정의
	int myMoney = 5000;
	int numOfApple = 0;
	
//	구매자가 판매자에게 사과를 구매하는 동작 표현
	public void buyApple(FruitSelelr seller, int money) {
//		판매자가 반환하는 사과의 개수를 합산
		numOfApple += seller.saleApple(money);
//		지불한 금액을 차감
		myMoney -= money;
	}
	
//	구매자의 상태 출력
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple );
	}
}


public class E06FruitSalesMain1 {
	public static void main(String[] args) {
		
//		판매자, 구매자 인스턴스 생성. 생성자를 생성한적없기때문에 기본 생성자를 통해 만들어짐.
		FruitSelelr seller = new FruitSelelr();
		FruitBuyer buyer = new FruitBuyer();
		
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
//		구매자가 판매자에게 5000원을 지불하고 사과를 구매
		buyer.buyApple(seller, 5000);
		
		System.out.println("구매행위가 일어난 후의 상태");
		seller.showSaleResult();
		buyer.showBuyResult();
		
		
	}
}
