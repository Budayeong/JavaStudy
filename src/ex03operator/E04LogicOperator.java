package ex03operator;

public class E04LogicOperator {
	public static void main(String[] args) {
		
		/*		
		논리 연산자
			- && : 논리AND. 둘다 true일때만 true
			- || : 논리OR. 둘다 false일때만 false
			- ! : 논리NOT. 항상 반대의 논리 반환
		*/		
		int num1=10, num2=20;
		
		boolean result1 = (num1==100 && num2==20); //false
		boolean result2 = (num1<12 || num2>=30); //true
		
		System.out.println("result1의 결과:" + result1);
		System.out.println("result2의 결과:" + result2);
		
//		!(false) => true
		if(!(num1==num2)) {
			System.out.println("num1과 num2는 다르다");
		} else {
			System.out.println("num1과 num2는 같다");
		}
//		num1과 num2는 다르다
	}
}
