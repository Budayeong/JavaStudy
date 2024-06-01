package ex05metod;

/*
다음과 같은 회전대칭 모양의 출력결과를 보이는 프로그램을 while문과 for문으로 작성하시오.
단, 메서드로 작성해야 한다.

메서드명 : rotationSymmetry()
0 0 0 1
0 0 1 0
0 1 0 0
1 0 0 0


*/
public class QuSymmetry {
	public static void main(String[] args) {
		
		rotationSymmetry();
		
	}
	
	
	public static void rotationSymmetry() {
		int i = 4;
		
		System.out.println("===== while문 =====");
		while(i>=1) {
			int j = 1;
			while(j<=4) {
				if(i==j) {
					System.out.print("1 ");
				}
				else 
					System.out.print("0 ");
				j++;
			}
			System.out.println();
			i--;
		}
		
		
		System.out.println("===== for문 =====");
		i = 4;
		for(i=4 ; i>=1 ; i--) {
			int j = 1;
			for(j=1 ; j<=4 ; j++) {
				if(i==j)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}

	}
	
	
}
