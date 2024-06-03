package ex08class;

/*
시나리오] 은행계좌를 추상화
	- 멤버변수: 예금주, 계좌번호, 잔고
	- 멤버메서드: 입금하다, 출금하다, 계좌잔고조회
	- 조건1: 입금은 무제한으로 가능
	- 조건2: 잔고 부족한 경우 출금 불능 처리
*/

//은행계좌 추상화한 클래스
class Account {
	
//	멤버변수
	String name;
//	계좌번호: 연산이 필요없으므로 String으로 선언
	String accountNumber;
	int balance;
	
	public Account() {
//		자동으로 생성되는 디폴트 생성자 메서드
	}
	
//	입금처리 메서드
	void deposit(int money) {
		balance += money;
		System.out.println(money + "원이 입금됨");
	}
	
//	출금처리 메서드
	void withdraw(int money) {
//		현재 잔고와 비교해 출금할 돈이 잔고보다 많을때만 출금
		if(balance >= money) {
			balance -= money;
			System.out.println("계좌에서 " + money + "원이 출금됨");
		}
		else {
			System.out.println("잔고부족으로 출금불능");
		}
	}
	
//	계좌조회 메서드: 계좌정보를 출력
	void showAccount() {
		System.out.println("계좌 주: "+name);
		System.out.println("계좌번호: " + accountNumber);
		System.out.println("잔고: " + balance);
	}
	
//	멤버변수 초기화를 위한 메서드
	void init(String n , String a, int b) {
		name = n;
		accountNumber = a;
		balance = b;
	}
	
}

public class E04AccountMain {
	public static void main(String[] args) {
		
//		첫번째 계좌 인스턴스 생성 (account)
		Account account = new Account();
//		init메서드(초기화기능) 호출해 인스턴스 초기화
		account.init("장동건", "111-21-8888", 1000);
//		입출금 진행 후 계좌정보 확인
		account.deposit(9000); 
		account.withdraw(5000); 
		account.showAccount(); 
		
		System.out.println();
		
//		두번째 계좌 인스턴스 생성
		Account account2 = new Account();
//		멤버변수에 직접 접근해 초기화 -> 초기화메서드에 비해 비효율적 
		account2.name = "정우성";
		account2.accountNumber = "123-45-67890";
		account2.balance = 900000;
		account2.showAccount();
		
		
	}
}	

