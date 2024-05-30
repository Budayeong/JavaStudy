package ex06array;

public class E05TwoDimArray02 {
	public static void main(String[] args) {
		
		int[][] arr2Dim = new int[3][4];
		
//		각 행과 열의 크기만큼 반복하면서 배열 초기화
		for(int i=0 ;i<3 ; i++) {
			for(int j=0 ; j<4 ; j++) {
				arr2Dim[i][j] = i + j ;
			}
		}
		
//		배열명.length => 배열의 행 크기반환
//		배열명[인덱스].length => 열 크기 반환
		for(int n=0 ; n<arr2Dim.length ; n++) {
			for(int m=0 ; m<arr2Dim[n].length ; m++) {
				System.out.println(arr2Dim[n][m] +" ");
			}
			System.out.println();
		}
		/*
		[시나리오] 다음 절차에 따라 프로그램 작성
		1. 2차원 배열 선언 (세로 2, 가로 4)
		2. 난수를 이용해 배열 초기화
		3. 배열 전체요소를 매개변수로 전달된 정수만큼 증가시킨다
		4. 증가되기 전, 후 배열을 출력한다
		5. 메서드 명은 twoDimPlus()로
		*/
		int[][] twoArray = new int[2][4];
		for(int i=0 ; i<twoArray.length ; i++) {
			for(int j=0 ; j<twoArray[i].length ; j++) {
				twoArray[i][j] = (int)(Math.random() * 100);
			}
		}
		System.out.println("==초기화 후 =================");
//		초기화 전, 후 두번의 출력을 위해 출력용 메서드 사용
		showarray(twoArray);

		twoDimPlus(twoArray, 10);
		
		System.out.println("==메서드 호출 후 ==============");
		showarray(twoArray);
		
	}
	
	
//	출력용 메서드
	static void showarray(int[][] arr2) {
		for(int i=0 ;i<arr2.length ; i++) {
			for(int j=0 ; j<arr2[i].length ; j++) {
//				4자리 확보 후 좌측정렬 출력
				System.out.printf("%-4d", arr2[i][j]);
			}
			System.out.println();
		}
	}

//	배열 값 증가용 메서드
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for(int i=0 ; i<arr2.length ; i++) {
			for(int j=0 ; j<arr2[i].length ; j++) {
				arr2[i][j] += plusNum;
			}
		}
	}
	
	
}
