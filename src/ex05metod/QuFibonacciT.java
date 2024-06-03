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
public class QuFibonacciT {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int n = scanner.nextInt();
		
		fibonacciProgression1(n);
		fibonacciProgression2(n);
	}
	
//	배열로 구현
	public static void fibonacciProgression1(int n) {
		if(n<=2) {
			System.out.println("피보나치 수열은 0,1로 시작하므로 3부터 입력해주세요");
			return;
		}
		
//		출력항목의 크기로 배열 선언
		int[] fibo = new int[n];
		
//		피보나치수열은 0,1로 시작하므로 아래와 같이 초기ㅗ하 
		fibo[0] = 0;
		fibo[1] = 1;
		
//		나머지 수를 계산
		for(int i=2 ; i<n ; i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
//		피보나치수열 출력
		for(int i=0 ; i<n ; i++) {
			System.out.printf("%d ", fibo[i]);
		}
		System.out.println("\n==================");
	}
	
	
//	일반 변수로 구현
	public static void fibonacciProgression2(int n) {
		if(n<=2) {
			System.out.println("피보나치 수열은 0,1로 시작하므로 3부터 입력해주세요");
			return;
		}
		
		int f1=0, f2=1, f3;
		System.out.printf("%d %d ", f1, f2);
		
//		0과 1은 이미 위에서 출력되기때문에 제외(n-2)한 만큼 반복
		for(int i=1 ; i<=n-2 ; i++) {
//			첫번째수와 두번째수를 더한 후 즉시 출력
			f3 = f1 + f2;
			System.out.printf("%d ", f3);
			
//			각 변수에 새로운 값 (다음항목)을 할당
			f1 = f2;
			f2 = f3;
			
		}
		
		
	}
	
	
}
