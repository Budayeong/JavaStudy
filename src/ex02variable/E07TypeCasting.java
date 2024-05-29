package ex02variable;

public class E07TypeCasting {
	public static void main(String[] args) {

		//		자동형변환 : 작은 자료형의 데이터를 큰 자료형에 대입할때 자동으로 형변환 발생.
		byte b1 = 65;
		short s1;
		s1 = b1;
		System.out.printf("b1은 %d, s1은 %d%n", b1, s1); //b1은 65, s1은 65
		/*
		 CPU는 int보다 작은 자료형을 연산할때 int로 간주하여 진행, 결과도 int로 반환 -> 자동형변환이 아님 
		 int형에 최적화된 CPU의 특성
		 */
		int num1 = b1 + s1;
		System.out.println("num1은"+num1); //num1은 130
		
		/*
		 char형(문자)에 byte형(정수)를 바로 대입할 수 없다 
		 특성이 다르므로 강제형변환 후 대입해야함
		 */
//		char ch1 = b1;
		char ch2 = (char)b1; //a
		System.out.println("b1=" + b1 + ", ch2=" + ch2); // b1=65, ch2=A
		
		/*
		명시적 형변환 : 큰 -> 작은 일때 사용
			- 자료의 손실이 있을 수 있으므로 필요한 경우에만 사용
		*/
		short s2 = 100; 
		byte b2 = (byte)s2;
		System.out.printf("데이터미손실:b2=%d, s2=%d\n" , b2, s2); // !!!
		
//		소수점 아래부분이 버려짐 -> "원 단위 절삭" 같은 경우에 사용
		int num3;
		double dl = 3.14;
		num3 = (int)dl;
		System.out.printf("데이터손실:num3=%d, dl=%.2f %n", num3, dl); //데이터손실: num3=3, dl=3.14
//		서식문자 사용시 %.2f는 정수부분 모두 출력, 소수 이하 2번째까지 표현
		
//		문자는 메모리에 저장시 아스키코드로 저장되므로 int와의 연산을 진행한 후 문자로 표현하고싶다면 char형으로 강제형변환
		char ch3 = 'A', ch4;
		int num4 = 2;
//		ch4 = ch3 + num4;
//		A+2 = C 할당
		ch4 = (char)(ch3+num4); 
		System.out.println("ch4="+ch4); // !!!!
		
		
	}
}
