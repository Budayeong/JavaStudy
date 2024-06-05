package ex12inheritance;

/*
Composition(구성)관계로 표현하기에 적합한 Has-A 관계
: X has a Y => X가 Y를 소유(포함)하다, 클래스의 멤버로 또 다른 클래스를 사용하는 것.

현재 .java파일에서는 권총을 소유한 경찰을 표현함.
소유의 관계를 상속으로 표현하면 클래스 간 강한 연결고리가 형성되어 권총이 없는 경찰을 표현하기 힘들어짐.
*/

//권총 추상화
class Gun {
	int bullet;
	public Gun(int bNum) {
		bullet = bNum;
	}
	
//	총 발사, 총알 감소
	public void shutGun() {
		System.out.println("빵야~~!");
		bullet --;
	}
}

//경찰 추상화
class Police {
//	권총과 수갑을 보유한 경찰 표현.
	int handCuffs;
//	인스턴스형 멤버변수
	Gun gun;
	
	public Police(int bNum, int hCuff) {
//		값으 전달받아 수갑 보유여부 설정
		handCuffs = hCuff;
//		값을 전달받아 권총의 보유여부 설정.
//		1. 총알이 없다면 권총을 사용할 수 없으므로 권총이 없는 것으로 간주 -> null할당
		if(bNum<=0) {
			gun = null;
		}
//		2. 총알을 전달받았다면 권총을 사용할 수 있으므로 권총이 있는 것으로 간주 -> 인스턴스생성 및 총알개수 설정
		else {
			gun = new Gun(bNum);
		}
	}
	
//	수갑채움 -> 보유 수갑개수 차감
	public void putHandcuff() {
		System.out.println("수갑채움~~");
		handCuffs--;
	}
	
//	권총발사 
	public void shut() {
//		보유한 총이 있을때만 총알 발사 가능
		if(gun==null) 
			System.out.println("보유한 권총없음.");
		else 
			gun.shutGun();
	}
}

public class E05HasAComposite {
	public static void main(String[] args) {
		
//		경찰1: 총알 5발, 수갑 3개 보유
		System.out.println("==경찰1==");
		Police police1 = new Police(5, 3);
		police1.shut();
		police1.putHandcuff();
		
//		경찰2: 총알 없음, 수갑 3개 보유
		System.out.println("==경찰2==");
		Police police2 = new Police(0, 3);
		police2.shut();
		police2.putHandcuff();
	}
}
