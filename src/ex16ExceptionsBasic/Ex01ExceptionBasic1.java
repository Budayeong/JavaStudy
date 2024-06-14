package ex16ExceptionsBasic;

import java.io.IOException;

public class Ex01ExceptionBasic1 {
	public static void main(String[] args) throws IOException {
		
		/*
		Syntax에러(구문에러)
		: 실행자체가 되지않는 코드 -> 오류를 수정해야만 정상실행
		코드에 문법적인 오류가 발생되었음을 의미
		*/
		
//		Int number = 10;
//		if(true);
//		{}
//		else 
//		{}
		
//		위 코드를 정상적으로 수정한 코드
		int number =10;
		if (true) {
			System.out.println("참이다");
		}
		else {
			System.out.println("거짓이다");
		}
		
		/*
		외부자원을 사용할 때 발생되는 예외 처리
		방법1. 예외가 발생한 지점을 try-catch로 처리
		방법2. throws IOException으로 예외 던지기 (발생되는 예외를 프로그램 외부로 던지는 것)
			=> 예외를 처리하지않고 무시하겠다는 뜻
		*/
		System.out.println("문자하나를 입력하세요: ");
		try {
			int iChar = System.in.read();
		}
		catch (IOException	e) {
			e.printStackTrace();
		}
		
		
	}
}
