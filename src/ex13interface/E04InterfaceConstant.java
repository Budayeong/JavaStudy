package ex13interface;

import java.util.Scanner;

/*
인터페이스에 변수를 정의하면 public static final이 자동으로 붙기때문에 무조건 상수가됨. => 인터페이스형 상수
*/
//해당 인터페이스의 접근지정자는 default이므로 해당 패키지를 벗어나면 사용불가. 
//프로젝트 전체에서 사용하고 싶다면 별도의 파일로 생성해 public으로 만들어야함
//interface Game {
//	int SCISSORS=1, ROCK=2, PAPER=3;
//}

public class E04InterfaceConstant {
	public static void main(String[] args) {
		
		System.out.println("가위(1), 바위(2) 보(3) 게임입니다");
		System.out.print("선택하세요(정수입력): ");
		
		Scanner sc = new Scanner(System.in);
		int sel = sc.nextInt();
		
//		가위, 바위, 보 를 단순히 설정값 1, 2, 3으로 나타내면 가독성이 떨어짐 -> 상수를 통해 명시적인 단어로 의미표현
		switch (sel) {
		case Game.SCISSORS: 
			System.out.println("가위를 냈습니다");
			break;
		case Game.ROCK: 
			System.out.println("바위를 냈습니다");
			break;
		case Game.PAPER: 
			System.out.println("보자기를 냈습니다");
			break;
		default:
			System.out.println("잘못 냈습니다");
		}
		
	}
}
