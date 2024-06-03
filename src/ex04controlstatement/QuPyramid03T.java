package ex04controlstatement;

/*
문제4) 다음과 같은 모양을 출력하는 프로그램을 for문으로 작성하시오

      *
     * * *
    * * * * *
   * * * * * * *
  * * * * * * * * *

*/

public class QuPyramid03T {
	public static void main(String[] args) {

//		행의 개수 지정
		int num = 5;
		
		for(int i=0 ; i<num ;i++) {
//			공백출력하기
			for(int j=1 ; j<=num-i ; j++) {
//			i값이 커질수록 j(공백)출려 반복은 감소
				System.out.print(" ");
			}
			
//			* 출력하기. 조건에 의해 1,3,5,7... 생성됨
			for(int k=0 ; k<(i*2+1) ; k++) {
				System.out.print("* ");
			}
//			한행 출력 후 줄바꿈
			System.out.println();
		}
		
				
		
		
	}
}
