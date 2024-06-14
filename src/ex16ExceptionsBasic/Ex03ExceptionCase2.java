package ex16ExceptionsBasic;

import java.io.IOException;

/*
예외처리방법2
: 예외 발생 지점에서 처리(try-catch). 예외가 발생하는 지점을 명시적으로 알 수 있음
*/

public class Ex03ExceptionCase2 {
	static void compileFunc() {
		try {
//			예외발생 코드와 관련있는 로직은 하나로 묶어주는 것이 좋음
			System.out.println("하나의 문자를 입력하세요: ");
			int userChr = System.in.read();
			System.out.println("입력한 문자는 : " + (char)userChr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		compileFunc();
	}
}
