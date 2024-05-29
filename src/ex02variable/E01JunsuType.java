package ex02variable;

import java.awt.Window.Type;

public class E01JunsuType {
	public static void main(String[] args) {
		/*
		 정수자료형
		 - byte, short, int, long 타입(형)이 있다.
		 - 각 자료형의 표현범위는 교안을 참조
		 - 일반적으로 CPU(중앙처리장치)는 정수형 연산을 할 때 int형을 가장 빠르게 처리
		 - 즉, 정수형 변수를 사용할때는 대부분 int 형 사용
		 */
		
//		int형 변수 선언 후 초기값 할당
		int int1 = 100;
		int int2 = 200;
//		int1과 int2의 덧셈 연산 결과값을 result1 변수에 할당
		int result1 = int1 + int2;
		System.out.println("int1 + int2 =" + result1);
		/*
		 int형끼리의 연산은 int형의 결과가 반환됨
		 100/200 -> 0
		 실수 결과를 반환받고 싶으면 형변환(Type Casting) 필
		 */
		result1 = int1 / int2 ;
		System.out.println("int1 / int2 =" + result1); 
		
		/*
		 - 동일한 타입의 변수를 2개이상 선어할때는 컴마 사용 가능
		 - int형보다 작은 자료형을 연산하면 CPU는 int형으로 변환하여 계산 (정수의 연산이 int에 최적화되어있기 때문)
		 - byte, short형은 게임캐릭터의 움직임이나 음원파일 등을 표현할때 주로 사용
		*/
		byte byte1 = 50, byte2 =55;
		int result2 = byte1 + byte2; 
		System.out.println("byte1 + byte2 = " + result2);  
		
		short short1 = 60, short2 = 70;
		int result3 = short1 + short2;
		System.out.println("short1 + short2 =" + result3); 
		
		/*
		- 동일 자료형끼리의 연산은 동일자료형이 되는 것이 기본 원칙
		- 다른 자료형끼리의 연산: 큰 자료형으로 자동 형변환됨 -> 데이터의 손실(오차)가 있을 수 있기 때문
		*/
		long long1 = 1000, long2 = 2000;
		long result4 = int1 + long1;
		System.out.println("int1 + long1 = " + result4); 
		
		result4 = long1 + long2;
		System.out.println("long1 + long2 =" + result4); 
		/*
		자바 컴파일러는 정수형 상수를 기본적으로 int로 간주 -> 그래서 아래 정수를 메모리에 로드하는 순간 에러 발생
		이때 L or l 을 붙여서 int형 자료가 아닌 long형 자료임을 컴파일러에게 알림
		할당을 위해 입력되는 문자도 자료형을 기반으로 메모리에 로드됨 -> 리터럴(literal)
		*/
		
//		long long3 = 2200000000;
		long long4 = 2200000000L;
		long long5 = 2200000000l;
		
		System.out.println("long4=" + long4);
	}
}
