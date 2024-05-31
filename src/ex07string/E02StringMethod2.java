package ex07string;

public class E02StringMethod2 {
	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메서드2");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
//		6) codePointAt() : 문자열의 특정 인덱스의 문자를 찾은 후 아스키코드(혹은 유니코드) 반환
		System.out.println("### 6 ###");
		System.out.println("str1 첫번째 문자의 아스키코드: " + str1.codePointAt(0));  //대문자 W: 7
		System.out.println("str2 세번째 문자의 아스키코드: " + str2.codePointAt(2)); //한글 '야': 50556
		
//		7) endWith() : 특정 문자열로 끝나면 true 반환
//		8) startWith() : 특정 문자열로 시작하면 true 반환
		System.out.println("### 7,8 ###");
		System.out.println("www.daum.net".endsWith("net"));
		System.out.println("naver.com".startsWith("http"));
		
//		9) format() : 출력형식을 지정하여 문자열로 반환할 때. 웹애플리케이션 제작에 사용됨
		System.out.println("### 9 ###");
		System.out.printf("국어: %d, 영어: %d, 수학: %d\n", 81, 92, 100);
		
//		웹 애플리케이션 제작에서 이와같이 처리해 웹 브라우저에서 출력
		String formatStr = String.format("국어:%d, 영어: %d, 수학: %d\n", 81, 92, 100);
		System.out.println(formatStr);
		
//		10) indexOf() : 문자열에서 특정 문자열의 시작 인덱스를 반환, 존재하지않으면 -1반환
		System.out.println("### 10 ###");
		String email1 = "hong@daum.net";
		System.out.println(str1.indexOf("ava"));
		System.out.println(str1.indexOf("J"));
		System.out.println((email1.indexOf("@")!= -1) ? "이메일형식맞음" : "이메일형식아님");
		
		
	}
}
