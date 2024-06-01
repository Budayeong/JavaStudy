package ex04controlstatement;

/*
문제2) 다음과 같은 모양을 출력하는 프로그램을 while문으로 작성하시오

*
* *
* * *
* * * *
* * * * *

*/
public class QuPyramid01 {	
	public static void main(String[] args) {
		
		int i = 1;
//		"*" 을 누적할 String 변수
		String sum = "";
		
		while(i<6) {
//		i의 값만큼 sum에 "*" 개수가 누적되어 출력되고 줄바꿈
			sum+= "* ";
			System.out.println(sum);
			i++;
		}
		
	}
}
