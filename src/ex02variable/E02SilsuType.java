package ex02variable;

public class E02SilsuType {
public static void main(String[] args) {
	
	/*
	실수자료형
	- 정수형보다 더 큰 자료형 (0~1 사이 무한대의 실수 존재)
	- 따라서 long(정수형)과 float(실수형)을 연산하면 float의 결과가 나옴
	*/
	long long1 = 100;
	float float1 = 200;
//	float float333 = 200.0;
	
//	실수형으로 자동형변환됨
	float result1 = long1 +float1;
	System.out.println("long1 + float1 = " + result1); 
	
	/*
	float(실수)와 long(정수)의 연산결과를 long으로 받고싶다면 
	방법1. float을 long으로 강제형변환 후 연산
	방법2. 계산결과 전체를 long으로 강제형변환
	*/
	long result2 = long1 + (long)float1;
	System.out.println("형변한 후 연산=" + result2);
	long result3 = (long)(long1 + float1);
	System.out.println("계산 후 형변환=" + result3);
	
	/*
	- 실수형의 기본은 double
	- 소수점이 있는 데이터를 컴파일러는 무조건 double로 인식
	- 소수점이 없는 데이터는 float에 대입할 수 있음
	- 소수점이 있는 데이터를 float에 대입하려면 접미사 F 혹은 f를 붙여야함
	- 형변환 후 대입이 가능하지만 권장하지않음
	*/
	float f3 = 100;
	
//	3.14를 double로 인식하므로 에러 발생
//	float f4 = 3.14; 
	
//	강제형변환 후 소수점 데이터 float에 대입 가능
	float f4 = (float)3.14;
	System.out.println("f4=" + f4);
	
//	접미사를 통해 float형 자료임을 명시(권장)
	float f5 = 3.14F;
	System.out.println("f5= " + f5);
	
//	float끼리의 연산 -> float
	float f6 = f3 + f4;
	System.out.println("f6=" + f6);
	
//	double, float 연산 -> double (더큰 자료형)
	double d1 = 3.14;
	double d2 = f6 + d1;
	System.out.println("d2=" +d2);
	/*
	CPU는 실수 계산에 기본적인 오차 존재 -> 정확한 계산을위해서는 약간의 보정을 필요로 함
	*/
}
}
