package ex04controlstatement;

public class E01If02 {
	public static void main(String[] args) {
		
		int num =120;
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다");
		}
		
		/*
		삼항연산자(조건연산자)
		: if-else 문과 동일하지만 짧은 코드로 표현이 가능하므로 실무에서 자주 사용됨
		변수 = (조건식) ? 참일때 : 거짓일때 ;
		*/
		String numberResult = (num%2==0) ? "짝수임" : "홀수임";
		System.out.println("숫자 "+num+"은 "+numberResult);
		
		int num2 = 120;
		if(num%2 == 0) {
			if(num2>100) {
				System.out.println("짝수이면서 100이상입니다.");
			}
			else {
				System.out.println("짝수이면서 100미만입니다.");
			}
		}
		else {
			if(num2>100) {
				System.out.println("홀수이면서 100이상입니다.");
			}
			else {
				System.out.println("홀수이면서 100미만입니다.");
			}
		}
		
	}
}
