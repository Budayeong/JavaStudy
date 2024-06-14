package ex16ExceptionsBasic;

import java.io.IOException;

/*
예외처리방법1
: 예외 발생 지점에서 무시, 예외발생 메서드를 호출한 지점에서도 무시
	- 예외를 내부에서 처리하지않고 무시하겠다는 의미
	- 외부자원 사용 시 기본적으로 발생되는 예외는 무시가 가능
	- throws: 예외던지기
*/

public class Ex03ExceptionCase1 {
	
	static void compileFunc() throws IOException {
		System.out.println("하나의 문자를 입력하세요: ");
		int userChr = System.in.read();
		System.out.println("입력한 문자는 : " + (char)userChr);
	}
	
	public static void main(String[] args) throws IOException {
		compileFunc();
	}
}
