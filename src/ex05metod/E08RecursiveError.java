package ex05metod;

public class E08RecursiveError {
	
	public static void showHi(int cnt) {
		System.out.println("Hi~!");
		System.out.println("cnt=" + cnt);
//		if문 상단에서 재귀호출 됨 -> if 블럭 영원히 실행 불가
//		showHi(--cnt);
		if(cnt==1) {
			return;
		}
		showHi(--cnt);
		
	}
	
	public static void main(String[] args) {
		showHi(3);
	}
	
}
