package ex05metod;

import java.util.Scanner;

/*
[연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아 이에 해당하는 구구단을 출력하는 메서드를 작성하시오. 무조건 첫번째 입력받는수가 작아야한다.
입력예)
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메서드명 : inputGugudan(int sNum, int eNum)
 */

public class E04MethodType03_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자:");
		int dan = scanner.nextInt();
		
		System.out.println("두번째 숫자:");
		int dan2 = scanner.nextInt();
		
		if (dan<dan2) {
			inputGugudan(dan, dan2);
		} else {
			inputGugudan(dan2, dan);
		}
	}
	
	
	static void inputGugudan (int sNum, int eNum) {
		for(int dan=sNum ; dan<=eNum ; dan++) {
			for(int su=1 ; su<=9 ; su++) {
				System.out.printf("%-2d*%-2d=%2d", dan, su, dan*su);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	
	
}
