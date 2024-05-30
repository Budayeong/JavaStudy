package ex07string;

public class E01StringBasic {
	public static void main(String[] args) {
		/*
		기본자료형의 경우 비교연산자 == 이 값을 비교
		- 변수 자체에 값이 할당되어 있기 때문
		*/
		int num1=10, num2=20;
		String numResult = (num1==num2) ? "데이터가 같다" : "데이터가 다르다" ;
		System.out.println("배교결과:" + numResult);
		
		
//		String 인스턴스 생성방법1. new 이용
//		- new 키워드를 사용하면 동일한 문자열이라도 항상 새로운 메모리를 할당
		String str1 = new String("Hello JAVA");
		String str2 = new String("Hello JAVA");
		
//		str1, str2 는 String 인스턴스의 참조값(주소)을 의미함. 참조값에 대한 비교가 됨
//		- new 키워드로 생성한 인스턴스는 새로운 메모리에 할당되므로 둘의 주소는 다르다
		if(str1==str2) {
			System.out.println("str1과 str2는 참조주소 같음");
		}
		else {
			System.out.println("str1과 str2는 참조주소 다름");
		}
		
//		equals(): Object 클래스로부터 상속받은 메서드로 실제 저장된 "문자열"을 비교
		if(str1.equals(str2)) {
			System.out.println("두 문자열은 동일하다");
		}
		else {
			System.out.println("두 문자열은 다르다");
		}
		
//		String 인스턴스 생성방법2. ""사용 (주로사용)
//		- 이 경우 내용이 동일하면 같은 주소를 할당함
//		- 즉, 새로운 메모리를 할당하지 않고 기존 객체의 위치값을 가져옴
		String str3 = "자바개발자";
		String str4 = "자바개발자";
		
		System.out.println("equals()메서드로 문자열비교:" + str3.equals(str4));
		
//		하나의 메모리를 공유 -> 참조값이 동일함
		if(str3==str4) { 
			System.out.println("주소가 같다");
		}
		else {
			System.out.println("주소가 다르다");
		}
		System.out.println("The End!!!><");
		
		
		
	}
}
