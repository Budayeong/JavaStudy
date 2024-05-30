package ex06array;

public class test {
	public static void main(String[] args) {
		
				
		System.out.println("초기화 전");
		int[][] arr2 = new int[3][4];
		for(int[] a: arr2) {
			for(int b: a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		
		System.out.println("0행 배열 입력");
		arr2[0] = new int[] {1,2};
		for(int[] a: arr2) {
			for(int b: a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}

				
		
	}
}
