package ex16ExceptionsBasic;

public class Ex02PreDefineException5 {
	
	public static void main(String[] args)  {	
	 
		System.out.println("### ArithmeticException ###");
		int result = 10;
		try {
//			숫자를 0으로 나눌 수 없음 (연산불능) -> 예외발생
			result = result / 0;
			System.out.println("결과는:"+ result);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
			System.out.println("예외메세지:"+ e.getMessage());
		}
				 
	}////end of main	
	 
}


