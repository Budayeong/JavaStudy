package ex16ExceptionsBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
finally절
: 예외발생과 상관없이 try문에 진입했을 때 반드시 실행되는 블럭

1. try-catch: 예외를 직접 처리할때
2. try-catch-finally: 예외 처리 후 실행할 문장이 있을때
3. try-finally: 예외는 외부로 던지고 예외발생과 상관없이 실행할 문장이 있을 때
*/

public class Ex05Finally {
	
//	예외를 던짐 (무시)
	static void runtime() throws NumberFormatException {
		Integer.parseInt("백");
	}
	
	static void tryCatchFinally() {
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요: ");
		int age = -1;
		try {
//			'10살'과 같이 숫자가 아닌 값이 들어오면 예외 발생
			age = scan.nextInt();
			System.out.println("당신은 5년 후 " + (age+5) + "살 입니다.");
//			예외가 발생하지 않더라도 return이 실행됨
//			일반적으로 return은 메서드의 종료를 의미하지만 try블럭에서 만나고 finally절이 있는 경우 finally절이 실행됨
			return;
		}
		catch (InputMismatchException e) {
			System.out.println("나이는 숫자만 쓰세요");
		}
		finally {
//			예외발생과 상관없이 try문에 진입했으면 실행됨
			System.out.println("항상 실행되는 finally절 입니다");
//			프로그램 실행 종료코드 = 콘솔 터미네이트 버튼과 동일한 동작
//			따라서 try절에서 해당 명령을 만나면 finally절도 실행되지않음 (프로그램 자체가 종료되니까)
//			System.exit(0);
		}

	}
	
	public static void main(String[] args) {
//		runtime()에서 던진 NumberFormatException이 전가되어 처리
//		NumberFormatException은 무시할 수 없다.
		try{
			runtime();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
		tryCatchFinally();
		
//		tryCatchFinally() 내에서 예외처리를 통해 해당 문장까지 프로그램이 실행됨. (System.exit(0) 가 주석인경우)
		System.out.println("메인 메서드 끝");
	}
	
	
}
