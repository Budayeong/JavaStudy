package ex04controlstatement;

/*
문제4) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오

      *
     * * *
    * * * * *
   * * * * * * *
  * * * * * * * * *

*/

public class QuPyramid03 {
	public static void main(String[] args) {

		String sum = "*";
//		총 반복횟수(출력될 줄의 수)
		int end = 5;
//		공백 개수 
		int blank = end-1;
		
//		*이 출력되는 for문
		for(int i=1 ; i<=end ; i++) {
//			공백이 옆으로 출력되는 for문
			for (int j=blank ; j>=1 ; j--) {
				System.out.print(" ");
			}
			System.out.println(sum);
			
//			한줄이 넘어갈때마다 공백의 수도 1개씩 줄어들어야 함
			blank--;
//			한줄이 넘어갈때마다 sum에 저장되는 *의 개수가 2개씩 늘어남
			sum += " * *";
		}
				
		
		
	}
}
