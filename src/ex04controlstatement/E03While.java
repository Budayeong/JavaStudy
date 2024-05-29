package ex04controlstatement;

/*
while문 : 반복의 횟수가 명확하지 않은 경우
	- 초기값, 조건식, 증감식
	- [형식] 변수 초기값;
			while(반복조건){
				실행문장;
				증감식;  -> 반복문 탈출 조건
			}
*/
public class E03While {
	public static void main(String[] args) {
		
		/*
		[시나리오] 1~10까지의 합을 구하는 while
		*/

		//방법 1.
		int i = 1;
		while(i<=10) {
			System.out.println("변수i= " + i);
			i++;
		}
		
		//방법 2.
		int sum = 0;
		int j = 1;
		while(j<=10) {
			sum += j;
			j++;
		}
		System.out.println("1~10까지의합 sum= "+sum);
		
		/*
		[시나리오] 1~100까지의 정수 중 3의 배수이거나 4의 배수인 정수의 합
		*/
		
		int total = 0;
		int k = 1;
		while(k<=100) {
//			3의 배수 혹은 4의 배수 -> ||
			if(k%3==0 || k%4==0) {
				total += k;
//				k가 조건에 맞는지 확인하기위해
				System.out.println("k=" + k);
			}
//			if문과 상관없이 항상실행
			k++;
		}
		System.out.println("3또는 4의 배수의합 "+total);
		
		/*
		[시나리오] 구구단을 출력하는 프로그램
		*/
		int dan = 2;
		while(dan<=9) {
			int su =1;
			while(su<=9) {
				System.out.printf(" %-2dx%2d =%2d,", dan, su, (dan*su));
				System.out.printf(" ");
				su++;
			}
			System.out.println();
			dan++;
		}
		System.out.println("\n============================\n");
		
		/*
		[시나리오] 아래와 같은 모양을 출력하는 while문 작성
			1 0 0 0
			0 1 0 0
			0 0 1 0
			0 0 0 1
		*/
	
//		행/열을 반복하기 위해 두가지의 변수가 필요
		int x = 1;
		while(x<=4) {
//			행 고정, 열을 4번씩 반복
			int y = 1;
			while(y<=4) {
//				행과 열의 번호가 동일할때만 1출력
				if (x==y) System.out.print("1 ");
				else System.out.print("0 ");
				y++;
			}
			System.out.println();
			x++;
		}
		

	}
}
