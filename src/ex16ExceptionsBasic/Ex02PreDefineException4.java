package ex16ExceptionsBasic;

import java.util.Date;

public class Ex02PreDefineException4 {
	 
//	정적변수 선언 (인스턴스 생성은 되지 않음)
	static Date toDay;
	
	public static void main(String[] args)  {	
		
		System.out.println("### NullPointerException ###");
		
//		null인 객체를 출력하는 것은 예외가 발생하지않음
		System.out.println("toDay="+ toDay);
		try {			 
//			참조할 인스턴스가 없는 경우 메서드 호출불가 -> 예외발생
			System.out.println(toDay.getTime());
		}
		catch(NullPointerException e) {
			System.out.println("toDay 참조변수는 null입니다.");
			System.out.println("예외메세지:"+ e.getMessage());
		}
				 
	}////end of main	
	 
}

