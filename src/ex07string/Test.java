package ex07string;

public class Test {
	public static void main(String[] args) {
		
		System.out.println("    *");
		System.out.println("   * * *");
		System.out.println("  * * * * *");
		System.out.println(" * * * * * * *");
		System.out.println("* * * * * * * * *");
		
		
		
		
		System.out.println("======= 문제4 정렬 ======= ");
//		* 을 출력할 변수
		String sum = "*";
//		공백의 개수
		int blank = 8;
		
		for(int i=1 ; i<=5 ; i++) {
			
			for (int j=blank ; j>=1 ; j--) {
				System.out.print(" ");
			}
			System.out.println(sum);
			
			blank = blank -2;
			sum += " * *";
		}
		
		System.out.println();
		
		System.out.println("======= 문제4 정렬 + 대응 ======= ");
		sum ="*";
		//총 반복횟수(= 출력될 줄의 수)
		int end=5;
		for(int i=1 ; i<=end; i++) {
			//공백 개수 = (마지막 반복 때 (마지막 줄) sum의 길이 - 현재 sum의 길이) / 2 
			blank = ((1+4*(end-1)) - sum.length())/2;
			for (int j=blank ; j>=1 ; j--) {
				System.out.print(" ");
			}
			System.out.println(sum);
			
			blank = blank -2;
			sum += " * *";
		}
		
		
		
		
	}
}	
