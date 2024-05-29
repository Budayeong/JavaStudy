package ex02variable;

public class E04StringType {
	public static void main(String[] args) {
		
		/*
		String클래스 : 참조형 변수, 기본자료형이 아닌 클래스로 문자열을 저장/조작
			- 문자열을 표현할 때 "" 사용
			- 문자열 연결 시 + 사용
		*/
		int number;
		number = 99;
		
		/*
		클래스를 통해 생성한 참조형 변수형 기본자료형 변수 사이에서는 형변환 불가능
		서로 사용하는 메모리 공간이 다르기 때문
		- 기본자료형: Stack 영역
		- 참조형(클래스)뼌수: Heap 영역
		*/
//		int stringNumber1 = (int)"100";
//		String stringNumber2 = (String)100;
		
		String strNumber = "100";
		System.out.println(strNumber + number); //10099
		
//		String은 클래스이므로 new 키워드 사용해 변수 생성 가능
		String newString = new String("new 키워드 사용");
		System.out.println(newString); //new 키워드 사용
		
//		주로 사용하는 방법
		String stringsBasic = "클래스지만";
		String plusString = "기본자료형처럼 사용";
//		문자열에 + 사용 시 문자열 연결
		System.out.println(stringsBasic+" "+plusString);//클래스지만 기본자료형처럼 사용
		
		/*
		문자열 + 정수: 우선순위가 없다면 일반적으로 문자열 출력
			산술연산의 결과를 출력하고 싶다면 -> 우선순위에 대한 변화 주기 => () 사용
		*/
		int kor=100, eng=99, math=98;
		System.out.println("총점:"+kor+eng+math); //총점: 1009998
		System.out.println("총점:"+(kor+eng+math)); //총점: 297
	}
}
