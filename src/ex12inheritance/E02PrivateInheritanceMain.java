package ex12inheritance;

class Account {
//	private인 경우 -> 자식클래스에 상속되지않음(접근불가)
	private int money;
	
//	생성자를 직접 정의하면 컴파일러는 기본 생성자를 추가하지않는다. 어떤생성자도 정의하지않았을때만 기본생성자를 자동호출함.
	public Account(int init) {
		money =init;
	}
	
//	입금처리 메서드 : protected로 선언, 자식클래스의 패키지가 다르더라도 자식클래스에서 접근가능
	protected void depositMoney(int _money) {
//		마이너스금액 입금불가
		if(_money<0) {
			System.out.println("마이너스 금액은 입금처리 불가합니다");
			return;
		}
//		금액이 양수일때만 입금처리
		money += _money;
	}
	
//	현재는 부모와 자식 클래스가 동일한 패키지에 정의되어있어 default라도 접근가능
	protected int getAccMoney() {
		return money;
	}
}


class SavingAccount extends Account {
//	현재 부모 클래스에 매개변수가있는 생성자가 정의되어있음 -> 기본생성자는 만들어지지않음 
//	=> 매개변수가있는 생성자를 직접 호출해줘야함 
	public SavingAccount(int initVal) {
		super(initVal);
	}
	public void saveMoney(int money) {
		depositMoney(money);
//		부모클래스에 정의된 money는 private -> 자식에서 직접 접근불가. 
//		super.money + = money;
	}
	public void showAccountMoney() {
		System.out.println("지금까지의 누적금액:" + getAccMoney());
	}
	
}

public class E02PrivateInheritanceMain {
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(10000);
//		sa.money = 100000; //에러
		sa.saveMoney(5000);
		sa.showAccountMoney();
		
		sa.saveMoney(-1000);
		sa.showAccountMoney();
		
//		현재 Account 클래스의 money에 접근하려는 위치가 E02PrivateInheritanceMain이므로 Account>private money에는 접근불가
		Account account = new Account(1000);
//		account.money = 1000;
	}
}
