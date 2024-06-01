package ex05metod;

import java.util.Scanner;

/*
피보나치 수열은 첫항이 0, 두번째항이 1로 구성되어 이전 2개의 항을 더해서 다음 항을 만들어낸다.
입력한 정수의 갯수만큼 항목을 출력하도록 프로그램을 작성하시오.

메서드명 : fibonacciProgression()
형식]
첫번째 항 0 / 두번째항 1
세번째항 : 0 + 1 = 1
네번째항 : 1 + 1 = 2
다섯번째항 : 1 + 2 = 3

결과]
숫자를 입력하세요 : 10
0, 1, 1, 2, 3, 5, 8, 13, 21, 34

*/
public class QuFibonacci {
	public static void main(String[] args) {
		
		System.out.print("숫자를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		fibonacciProgression(num);
		
	}
	
//	피보나치 수열 출력 메서드
	public static void fibonacciProgression(int num) {
		int[] fibonacci = new int[num];
		
		for(int i=0 ; i<num ; i++) {
			
			if(i==0 || i==1) {
				fibonacci[0] = 0;
				fibonacci[1] = 1;
				System.out.print(fibonacci[i]+", ");
			}
			else { 
				fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
				System.out.print(fibonacci[i]+", ");
			}
		}
		
	}
	
	
	
}
