package ex18lambda;

import java.util.Random;

//매개변수 O 반환값 X
@FunctionalInterface
interface StringConcat {
	public void makeString(String s1, String s2);
}

//매개변수 X 반환값 O
@FunctionalInterface
interface RandomNumber {
	public int randomNum();
}

//매개변수 O 반환값 O
@FunctionalInterface
interface GugudanRange {
	public String[][] guguString(int n1, int n2);
}

//매개변수 X 반환값 X
@FunctionalInterface
interface MenuPrint {
	public void onlyPrint();
}


public class Ex05ParamNReturn {
	public static void main(String[] args) {
		
		System.out.println("### 람다식1");
		String s1 = "안녕하세요?";
		String s2 = "람다식입니다.";
		
//		람다식 정의 후 호출시에는 인터페이스에 정의된 추상메서드를 이용
		StringConcat sc = (a,b) -> {
			System.out.println(a + " " + b);
		};
		sc.makeString(s1, s2);
		
//		매개변수가 없는 경우 람다식 정의 시 빈 소괄호 사용
		System.out.println("\n### 람다식2");
		RandomNumber randomNumber = () -> {
			Random random = new Random();
			return random.nextInt(100);
		};
		
		int rNumber = randomNumber.randomNum();
		System.out.println("생성된 난수: "  + rNumber);
		
		System.out.println("\n### 람다식3");
		GugudanRange gugudanRange = (num1, num2) -> {
			String[][] gugudan = new String[9][9];
			for (int i=num1 ; i<=num2 ; i++) {
				for(int j=1 ; j<=9 ; j++) {
//					인덱스는 0부터 시작하니까 -1씩해줌
					gugudan[i-1][j-1] = i +"*" +j+"="+(i*j);
				}
			}
			return gugudan;
		};
		
		String[][] returnStr = gugudanRange.guguString(4, 6);
//		반환된 이차원 배열을 통해 4~6단 출력
		for (int i=4 ; i<=6 ; i++) {
			for (int j=1 ; j<=9 ; j++) {
				System.out.print(returnStr[i-1][j-1]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\n### 람다식4");
		MenuPrint menuPrint = () -> {
			System.out.println("메뉴를 출력합니다");
		};
		menuPrint.onlyPrint();
		
		
		
	}
}
