package ex05metod;

import java.util.Scanner;

/*
- Java 에서 main 메서드는 public static void로 선언
- static으로 선언된 메서드는 static으로 선언된 메서드만 호출 가능
- 메서드는 호출 후 반환값은 호출한 위치로 반환됨. 이때 메서드는 메모리에서 소멸
- 반환값이 없는 void형 메서드도 실행이 완료되면 호출한 위치로 실행 흐ㅡㄻ이 돌아옴
*/
public class E01MethodBasic {
		
//		매개변수로 2개의 정수를 전달받아 두 정수의 합 결과를 반환. 반환값은 호출한 위치로 반한됨
		public static int simpleFun (int a, int b) {
			int sum = a +b;
			return sum;
		}
		
//		void - 반환값없음, 사용자에게 이름을 입력받은 후 namePrint()에게 전달
		public static void menuPrint() {
			System.out.println("당신의 이름은 무엇인가요?");
			Scanner sanner = new Scanner(System.in);
//			nextLine(): Scanner 클래스에서 문자열을 입력받을때 사용
			String name = sanner.nextLine();
			namePrint(name);
		}
		
//		문자열을 전달받아 단순 출력. 반환값이 없기때문에 메서드 동작 후 호출된 곳으로 실행흐름이 이동됨
		public static void namePrint(String n) {
			System.out.println("제 이름은 "+n+"입니다.");
		}
		
		/*
		main메서드는 Java에서 출발점 (Entry point)의 역할 
		- 직접 호출하지 않아도 자동으로 호출되어 프로그램이 실행됨
		*/
		public static void main(String[] args) {
			
//			메서드 호출 시 함수의 원형을 그대로 기술함 (매개변수 개수, 타입 등 틀리면 에러)
//			반환값이 있는 메서드는 우측항 혹은 print()의 일부로 사용됨
			int result = simpleFun(1, 2);
			System.out.println("1가 2를 전달한 결과:"+result);
			System.out.println("10가 20을 전달한 결과:" +simpleFun(10, 20));
			
//			반환값이 없는 메서드는 단독으로 사용됨
			menuPrint();
			
			
		}
//		main메서드의 종료는 해당프로그램의 종료
}
