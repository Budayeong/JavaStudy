package ex05metod;

/*
[메서드 형태2] 매개변수 X 반환값 O
- 값을 자체적으로 생산함
*/
public class E03MethodType02_1 {
	
	static int sumlTo10 () {
		int sum = 0;
		for (int i=0 ; i<=10 ; i++) {
			sum += i;
		}
//		반환값은 호출한 지점으로 반환
		return sum;
	}
	
	public static void main(String[] args) {
//		반환값이 있는 메서드는 주로 print()문 일부, or 변수에 할당
		System.out.println("1~10까지의합:" + sumlTo10());
		
		int sum10 = sumlTo10();
		System.out.printf("1에서 10까지의 합은 %d입니다.", sum10);
	}
}
