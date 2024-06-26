package ex10accessmodifier;

class Fruitseller5 {
	int numOfApple;
	int myMoney;
	final int APPLE_PRICE;
	
	public Fruitseller5(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
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

class FruitBuyer5 {
	int myMoney;
	int numOfApple;
	
//	생성자 정의
	public FruitBuyer5(int _myMoney, int _numOfApple) {
		myMoney = _myMoney;
		numOfApple = _numOfApple;
	}
	
	public void buyApple(Fruitseller5 seller1, int money) {
		numOfApple += seller1.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("[구매자]현재잔액: "+ myMoney);
		System.out.println("[구매자]사과갯수: " + numOfApple );
	}
}


public class E02FruitSalesMain5 {
	public static void main(String[] args) {
		
		Fruitseller5 seller1 = new Fruitseller5(0, 100, 1000);
		
		Fruitseller5 seller2 = new Fruitseller5(0, 80, 500);
		
		FruitBuyer5 buyer = new FruitBuyer5(10000, 0);
		
		System.out.println("구매행위가 일어나기 전의 상태");
		seller1.showSaleResult();
		seller2.showSaleResult();
		buyer.showBuyResult();
		
//		buyer.buyApple(seller1, 5000);
//		buyer.buyApple(seller2, 5000);
		////////////////////////////////////////////////

		
		/*
		지불금액과 구매한 사과 사이에 논리적 오류발생 -> 메서드로 규현한 규칙이 무너짐
		OOP에서는 이런 오류를 막기위해 "정보은닉" 권장
		멤버변수의 외부접근을 원천 차단하고 멤버메서드를 통해서만 접근하게 하는 것
		*/
		seller1.myMoney += 1000; //판매자1에게 1000원 지불
		buyer.myMoney -= 1000; //구매자의 금액 차감
		seller1.numOfApple -= 50; //사과 50개를 가져옴 
		buyer.numOfApple += 50; //구매자는 사과 50개 증가
		/*
		1000원을 지불하고 사과 50개를 구매한 상황이 됨
		*/
		
		
		
		////////////////////////////////////////////////
		System.out.println("구매행위가 일어난 후의 상태");
		seller1.showSaleResult(); 
		seller2.showSaleResult(); 
		buyer.showBuyResult();
		
		
	}
}
