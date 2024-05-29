package ex03operator;

public class E01ArithOperator {
	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;
		
		System.out.println("덧셈:" + (num1+num2));
		System.out.println("뺄셈:"+(num1-num2));
		System.out.println("곱셈:"+(num1*num2));
//		정수와 정수 연산의 결과는 정수 (나눗셈 주의!!). 실수를 얻고싶으면 강제형변환
		System.out.println("나눗셈(몫):"+(num1/num2));
		System.out.println("나눗셈(나머지):"+(num1%num2));
		
//		우선순위: 곱셈/나눗셈 > 덧셈/뺄셈
		int result = 3 * 2 + 5 % 2 - 6 / 3 * 5;
		System.out.println("결과는?" + result);
	}
}
