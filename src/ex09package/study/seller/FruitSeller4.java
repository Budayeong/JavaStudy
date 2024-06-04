package ex09package.study.seller;

public class FruitSeller4 {
	int numOfApple;
	int myMoney;
//	멤버상수는 값의 변경이 불가능하고, 한번만 초기화됨 -> 선언/초기화 동시에 하거나 생성자이용
	final int APPLE_PRICE;
	
	public FruitSeller4(int money, int appleNum, int price) {
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