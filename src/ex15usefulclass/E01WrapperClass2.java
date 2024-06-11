package ex15usefulclass;

public class E01WrapperClass2 {
	public static void main(String[] args) {
		
//		parseInt(): 숫자로된 문자열을 정수로 변경함
//		parseDouble(): 실수로 변경
		
		String strNumber = "1000";
//		정수 + 문자열 => 문자열
		System.out.println("10+strNumber= " + (10+strNumber));
//		정수 + 정수의 연산이 됨 => 정수
		System.out.println("10+strNumber를 숫자로 변경: " + (10+Integer.parseInt(strNumber)));
		System.out.println("10 + strNumber를 숫자로 변경: " + (10 + Integer.valueOf(strNumber)));
		
//		문자열을 숫자로 변경할때 반드시 숫자형식만 기술 가능
		String money = "120원";
//		System.out.println("120원: " + Integer.parseInt(money)); //예외
		
//		실수형태의 문자열을 숫자로 변경할때
		String floatString = "3.14";
//		System.out.println(Integer.parseInt(floatString)); //예외
		System.out.println("실수형(float)형으로 변경: " + Float.parseFloat(floatString));
		System.out.println("실수형(Double)형으로 변경: " + Double.parseDouble(floatString));
		
//		Character 클래스의 주요메서드
//		codePointAt(): 문자열에서 특정 index에 해당하는 문자의 아스키코드 반환
		System.out.println("ABCD에서 3번째 인덱스 D의 아스키코드");
		System.out.println(Character.codePointAt("ABCD", 3));
		
//		isDigit(): 인자로 전달된 문자가 숫자형식인지 판단
		System.out.println("isDigit()를 통한 숫자판단");
		System.out.println(Character.isDigit('A')? "숫자임": "숫자아님");
		System.out.println(Character.isDigit(50)? "숫자임": "숫자아님");
		System.out.println(Character.isDigit('7')? "숫자임": "숫자아님");
		
//		isLetter(): 인자로 전달된 문자가 문자인지 여부 판단. 
		System.out.println("isLetter()메서드를 통한 문자판단");
		System.out.println(Character.isLetter('가'));
		System.out.println(Character.isLetter('A'));
		System.out.println(Character.isLetter('#'));
		System.out.println(Character.isLetter('9'));
		
//		isWhitespace(): 공백문자인지 판단. 공백이면 true반환
		System.out.println("isWhitespace() 메서드로 공백문자 판단");
		System.out.println(Character.isWhitespace('A'));
		System.out.println(Character.isWhitespace(' '));
		
//		isLowerCase(): 소문자인지 판단. 소문자면 true
//		isUpperCase(): 대문자인지 판단. 대문자면 true
		System.out.println("알파벳 대소문자 판단");
		System.out.println(Character.isLowerCase('A'));
		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('a'));
		System.out.println(Character.isUpperCase('Z'));
		System.out.println(Character.isUpperCase('가'));
		
		
		/*
		시나리오] 주어진 문자열안에 몇개의 공백문자(스페이스)가 있는지
		판단하는 프로그램을 작성하시오.
			참고) toCharArray() : 문자열을 char형 배열로 반환해주는
				String클래스에 정의된 메소드. 
		*/
		
		String whiteString = "h e l l o";
		
		char[] charArr = whiteString.toCharArray();
//		공백문자의 개수를 카운트할 변수
		int whiteSpace = 0;
		
		for(int i=0 ; i<charArr.length ; i++) {
			if(Character.isWhitespace(charArr[i])==true)
				whiteSpace++;
		}
		System.out.println("공백의 개수: " + whiteSpace);
		
		
		
	}
}
