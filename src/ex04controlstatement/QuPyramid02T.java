package ex04controlstatement;

/*
문제3) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.

* * * * *
* * * *
* * *
* *
*

*/
public class QuPyramid02T {
	public static void main(String[] args) {
	
		int x = 5;
		do {
			int y = 1;
			do {
				System.out.print("* ");
				y++;
			}while(y<=x);
			x--;
			System.out.println();
		}while(x>=1);
	}
	
}
