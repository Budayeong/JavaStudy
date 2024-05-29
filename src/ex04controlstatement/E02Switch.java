package ex04controlstatement;

import java.util.Scanner;
/*
switch문
: 조건식의 값과 동일한 부분을 찾아 실행
	- 조건에 산술식/정수식만 가능 (boolean 값을 반환하면 안됨)
*/
public class E02Switch {
	public static void main(String[] args) {
		
//		/*
//		Scanner클래스: 사용자로부터 입력값을 받기위한 클래스
//			Sanner클래스의 메서드가 실행되면 잠깐 실행이 중지되고 사용자 입력을 기다림
//		*/
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
////		nextInt()는 정수를 입력하기위한 메서드 -> 문자입력 시 예외발생 
//		int iNum = scanner.nextInt();
//		System.out.println("입력한 숫자는:" + iNum);
//		
////		정수를 3으로 나누면 나머지는 0,1,2
//		int remain = iNum % 3;
//		switch (remain) {
//		case 0: {
//			System.out.println("나머지는 0입니다.");
//			break;
//		}
//		case 1: {
//			System.out.println("나머지는 1입니다.");
//			break;
//		}
//		default:
//			System.out.println("나머지는 2입니다.");
//		}
//		
//		/*
//		switch문 사용 시 주의사항
//		- long 타입 변수는 사용할 수 없음
//		- byte, short, int, char, String 만 사용가능
//		- 논리식, 조건식도 사용불가
//		*/
//		long ln = 100;
////		switch (ln) {
////		case 100: {
////			System.out.println("long타입 사용");
////		}
////		default:
////			System.out.println("안된단");
////		}
////		
////		switch(iNum%3==0) {
////		System.out.println("논리식도 안된다");
////		}
//		
//		String title = "자바";
//		switch (title) {
//		case "자바": System.out.println("자바 좋아");
//			break;
//		case "JAVA" : System.out.println("JAVA GOOD");
//			break;
//		}
//		
//		int season = 3;
//		switch (season) {
//		case 3: case 4: case 5: 
//			System.out.println("봄입니다.");
//			break;
//		case 6: case 7: case 8: case 9:
//			System.out.println("여름입니다.");
//			break;
//		case 10:
//			System.out.println("가을입니다.");
//			break;
//		case 11: case 12: case 1: case 2:
//			System.out.println("겨울입니다");
//		}
		
		
		/*
		[시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력하는
			프로그램을 작성하시오. 90점이상은 A학점...
			60점 미만은 F학점을 출력하면 된다. 
			단, switch문으로 작성하시오. 
		 */
		
		int kor=65, eng=70, math=75;
		int avg =  (kor+eng+math) / 3;
		System.out.println(avg);
		
		switch(avg/10) {
		case 10: case 9: 
			System.out.println("A학점");
			break;
		case 8: 
			System.out.println("B학점");
			break;
		case 7: 
			System.out.println("C학점");
			break;
		case 6: 
			System.out.println("D학점");
			break;
		default:
			System.out.println("F학점");
		}	
		
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
