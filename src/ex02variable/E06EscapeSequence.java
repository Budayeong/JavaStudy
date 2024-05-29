package ex02variable;

public class E06EscapeSequence {
	public static void main(String[] args) {
		
//		\t = tab(스페이스4칸)
		System.out.println("4월엔 벚꽃~~!");
		System.out.println("4월엔\t 벚꽃~~!");
		
//		\n = newLine(줄바꿈)
		System.out.println("Java World에 오신걸 환영합니다.\n");
		System.out.println("열심히\n해봅시다.\n");
		
//		더블 쿼테이션을 표현하고싶으면 \"
//		System.out.println("나는 "개발자"가 되고 싶어요");
		System.out.println("나는 \"개발자\"가 되고싶어요");
		
//		printf(): 문자열을 서식에 맞춰 출력
		int kor=81, eng=97, math=79;
//		같은 출력문장이지만 printf()가 더 간편
		System.out.printf("국어:%d, 영어:%d, 수학:%d%n", kor, eng, math);
		System.out.println("\n국어:"+kor+", 영어:"+eng+", 수학:"+ math);
		
//		실수는 %f, 정수와 실수의 연산이므로 결과는 실수이기때문에 double에 대입
		double avg = (kor+eng+math) / 3.0;
		System.out.printf("평균점수:%f%n", avg);
		
		/*
		자리 수 지정하기
			- %4d : 정수 출력 시 4칸을 확보한 후 표현한다.
			- %6.2f : 실수 출력시 전체자리수는 6자리, 소수 이하는 2자리로 표현
			- 양수는 우측정렬, 음수는 좌측정렬
		*/
		System.out.printf("국어:%d, 영어:%d, 수학:%d,"+" 평균:%f %n", kor, eng, math, avg);
		System.out.printf("국어:%6d, 영어:%6d, 수학:%6d,"+" 평균:%f %n", kor, eng, math, avg);
		System.out.printf("국어:%-6d, 영어:%-6d, 수학:%-6d,"+" 평균:%f %n", kor, eng, math, avg);
		
		
	}
}
