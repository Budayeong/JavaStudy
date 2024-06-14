package ex16ExceptionsBasic;

import java.io.IOException;

/*
예외처리방법3
: 예외발생 지점에서는 throws, 메서드를 호출한 지점에서 처리
*/

public class Ex03ExceptionCase3 {
	static void compileFunc() throws IOException {
			System.out.println("하나의 문자를 입력하세요: ");
			int userChr = System.in.read();
			System.out.println("입력한 문자는 : " + (char)userChr);
	}
	
	public static void main(String[] args) {
		try {
			compileFunc();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
