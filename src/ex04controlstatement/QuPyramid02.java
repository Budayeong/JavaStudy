package ex04controlstatement;

/*
문제3) 다음과 같은 모양을 출력하는 프로그램을 do~while문으로 작성하시오.

* * * * *
* * * *
* * *
* *
*

*/
public class QuPyramid02 {
	public static void main(String[] args) {
	
//		while문을 반복할 횟수
		int i = 5;
		String sum = "* * * * * ";
		
		do {
			System.out.println(sum.substring(0, i*2));
			i--;
		} while (i>0);
		
		
	}
}
