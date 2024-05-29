package ex03operator;

public class E06PrePostFixOperator {
	public static void main(String[] args) {
		
		/*
		증감연산자: 변수를 +1 or -1 한 결과, 주로 반복문에서 사용됨
		1. Prefix(전위): 연산자가 변수 앞에 있는 경우  ++a
			- 변수의 값이 먼저 변경 -> 값이 다른 코드에 반영
		2. Postfix(후위): 연산자가 변수 뒤에 있는 경우 a++
			- 변수의 값이 먼저 다른 코드에 반영 -> 그 후 값이 변경됨
		*/
		
//		1. 전위
		int num1 = 7;
		int num2, num3; // 현재상태: 0, 0
		num2 = ++num1; 
		// 1. num1의 값 먼저 변경 -> num1상태: 8
		// 2. 코드 실행 : 증가된 num1이 num2에 대입됨
		// num2 : 8
		
		num3 = --num1;
		// 1. num1의 값 먼저 변경 -> num1 값: 7
		// 2. 코드실행 : 감소된 num1이 num3에 대입됨 
		// num3: 7
		
		System.out.println("전위중가/막소시");
		System.out.printf("num1=%d, num2=%d, num3=%d %n%n", num1, num2, num3);
		// num1= 7, num2=8, num3=7
		
//		2. 후위
		num1= 7; //현재상태: 7,8,7
		num2 = num1++;
		// num2 = 7, num1 = 8
		
		num3 = num1--;
		// num3 = 8, num1 = 7
		System.out.println("후의증가/감소시");
		System.out.printf("num1=%d, num2=%d, num3=%d", num1, num2, num3);
		//num1 = 7, num2=7, num3=8
	}
}
