package ex03operator;

public class E02BokhapOperator {
	public static void main(String[] args) {
		
		/*
		복합대입연산자: 산술연산자와 대입연산자(=)를 연결해놓은 형태로 좌우측의 값을 연산하여 좌측의 변수에 댕입하는 구조
			- 문법구조상 항상 현재의 타입을 유지하는 특성을 가짐 ***
		*/
		double e = 3.1;
		e += 2.1;
		e *= 2;
		e += e;
		System.out.println("e의 결과값: " + e);
		
		int n =5;
//		정수와 실수를 연산하면 실수의 결과가 나오므로 n에 대입할 수 없어 에러발생
//		n = n*2.7;
		n = (int)(n*2.7);
		n *= 2.7;
//		복합대입연산자의 특성상 기존 자료형을 유지하기때문에 연산의 결과는 정수
		System.out.println("n의 결과값: " +n);
	}
}
