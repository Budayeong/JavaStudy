package ex16ExceptionsBasic;

import java.util.Scanner;

public class Ex02PreDefineException2 {
	public static void main(String[] args) {
		System.out.println("### NumberFormatException ###");
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("나이를 입력하세요: ");
			String strAge = sc.nextLine();
//			parseInt의 경우 문자열에 오직 숫자만 있어야 정수로 변환 가능 -> 숫자가 아닌 문자열이 들어오면 변환이불가능해 예외가 발생
			int ageAfter10 = Integer.parseInt(strAge) + 10;
			System.out.println("당신의 10년 후 나이는: "+ ageAfter10); 
		}
		catch (NumberFormatException e) {
			System.out.println("나이는 숫자롬나 입력해야 합니다");
			System.out.println("예외메세지: " + e.getMessage());
			e.printStackTrace();
		}
		
	}
}
