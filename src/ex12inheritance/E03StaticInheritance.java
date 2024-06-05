package ex12inheritance;

//static 멤버의 상속 
class Adder {
//	static 멤버 -> 클래스 외부(Method)영역에 생성됨 -> 인스턴스 생성없이 사용가능
	public static int val=0;
	
	public void add(int num) {
		val += num;
		Adder.val += num;
	}
}

//부모의 멤버변수가 public이므로 접근제한없음 ->자식 클래스에 작성된 코드는 문제없이 작성
class AdderFriend extends Adder {
	public void friendAdd(int num) {
//		변수명만으로 접근가능
		val += num;
//		클래스명을 통해 접근 가능
		Adder.val += num; //권장
	}
	
	public void showVal() {
		System.out.println("val=" + val);
		System.out.println("val=" + Adder.val);
	}
}

public class E03StaticInheritance {
	public static void main(String[] args) {
		
		Adder ad = new Adder();
		AdderFriend adFriend = new AdderFriend();
		
		ad.add(1); //val=2
		adFriend.friendAdd(3); // val=8
		Adder.val += 5; // val=13
		AdderFriend.val += 7; // val=20
		
		adFriend.showVal();
		
	}
}
