package ex16ExceptionsBasic;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
개발자 정의 예외클래스

1. Exception 클래스를 상속한ㄷ
2. 생성자에서 예외발생시 출력할 메시지를 super()를 통해 입력한다.
3. 예외발생지점에서 if문으로 감지 후 예외 인스턴스 생성 및 throw
4. catch문에서 예외 인스턴스를 처리

*/

class AgeErrorException extends Exception {
	public AgeErrorException() {
		super("나이 입력이 잘못되었어요");
	}
}

public class Ex06DeveloperDefine {
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요: ");
		
		try {
//			아래 메서드에서 예외가 발생한 경우 -> AgeErrorException 예외 인스턴스를 throw하면 여기서 예외처리
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
		}
		catch (AgeErrorException e) {
			System.out.println("[예외발생]" + e.getMessage());
		}
	}
	
//	AgeErrorException 예외전가
	public static int readAge() throws AgeErrorException{
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
//			나이 입력시 문자를 입력하는 경우에 대해 예외처리 (자바 기본 예외클래스 사용)
			inputAge = sc.nextInt();
		}
		catch (InputMismatchException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
//		자바 기본 예외가 아닌 개발자 지정 예외의 경우 if문으로 직접 감지해야함
//		현재는 나이를 음수로 입력하는 경우를 감지
		if(inputAge<0) {
//			나이가 음수로 판단되면 예외객체를 생성해 던짐(throw)
			AgeErrorException ex = new AgeErrorException();
			throw ex;
			
//			예외 인스턴스를 throw 하는 순간 프로그램으로 객체가 던져지기때문에 예외발생 -> 프로그램에서도 throws를 하거나 처리해야함
		}
		return inputAge;
	}
}
