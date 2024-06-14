package ex16ExceptionsBasic;

import java.util.InputMismatchException;
import java.util.Scanner;


class AgeErrorException2 extends Exception {
	public AgeErrorException2() {
		super("나이 입력이 잘못되었어요");
	}
}

public class Ex06DeveloperDefine2 {
	
	public static void main(String[] args) {
		System.out.println("나이를 입력하세요: ");
		
			int age = readAge();
			System.out.println("당신의 나이는 " + age + "살 입니다.");
		}
		
	public static int readAge() {
		Scanner sc = new Scanner(System.in);
		int inputAge = 0;
		try {
			inputAge = sc.nextInt();
		}
		catch (InputMismatchException e) {
//			e.printStackTrace();
			System.out.println("숫자만 입력하세요");
			System.exit(0);
		}
		

//		개발자가 직접 예외상황을 if문으로 감지하고 예외 객체를 만들어 throw 
		try {
			if(inputAge<0) {
				AgeErrorException2 ex = new AgeErrorException2();
				throw ex;
			}
		}
		catch (AgeErrorException2 e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		
		return inputAge;
		
	}
	
	
}
