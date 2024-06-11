package ex15usefulclass;

/*
Wrapper class : 기본자료형의 데이터를 인스턴스화 할 때 사용
	- Boxing/Unboxing을 통해 기본자료형의 데이터를 인스턴스화
	- 제네릭 클래스에서 필수적으로 사용됨
*/
public class E01WrapperClass1 {
	public static void main(String[] args) {
		
//		일반 정수의 연산
		int num1 = 10;
		int num2 = 20;
		int result = num1 + num2;
		System.out.println("result= " + result);
		
//		JDK1.4 이전의 코딩형식 - 언박싱을 위해 intValue() 와 같은 메서드 호출
//		현재 이같은 생성자는 Deparecated됨
		Integer n10obj = new Integer(10);
		Integer n20obj = new Integer(num2);
		int result2 = n10obj.intValue() + n20obj.intValue();
		System.out.println("result2= "+ result2);
		
		Integer resultObj = new Integer(result2);
		System.out.println("결과값을 byte형 값으로 변경: "+resultObj.byteValue());
		System.out.println("결과값을 이진수로 변경: "+  Integer.toBinaryString(result2));
		
//		JDK1.5 이후 코딩형식 - 오토박싱/오토언박싱 지원, 기본자료형 변수를 사용하는 것과 동일하게 사용
//		별도의 형변환이나 처리없이 기본자료형처럼 선언/초기화
		Integer numObj1 = 100;
		Integer numObj2 = 200;
		int num3 = numObj1;
//		객체이지만 정수처럼 연산이 가능. (Integer타입끼리 계산한 결과를 int에 담을 수 있음)
		int result3 = numObj1 - num2;
		System.out.println("오토언박싱 이후 연산결과: " + result3);
		
//		int형의 최대/최소 상수 값
		System.out.println();
		System.out.println("int형의 최대값: " + Integer.MAX_VALUE);
		System.out.println("int형의 최소값: " + Integer.MIN_VALUE);
//		진법변환을 위한 메서드도 제공
		System.out.println("10을 2진수로: " + Integer.toBinaryString(10));
		System.out.println("10을 8진수로: " + Integer.toOctalString(10));
		System.out.println("10을 16진수로: " + Integer.toHexString(10));
		
		
	}
}
