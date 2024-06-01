package ex04controlstatement;

/*
문제5) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오

*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/
public class QuPyramid04 {
	public static void main(String[] args) {
		
//		문자열 *을 누적할 변수
		String sum = "";
//		출력할 *의 최대 개수
		int end = 5;
		
//		end만큼 반복하며 *을 한개씩 누적해 출력
		for(int i=1 ; i<=end ; i++) {
			sum+="* ";
			System.out.println(sum);
		}

//		end-1 만큼 반복하며 *을 한개씩 줄여 출력
		for(int i=end-1 ; i>=1 ; i--) {
			System.out.println(sum.substring(0, i*2));
		}
		
		
		
	}
}
