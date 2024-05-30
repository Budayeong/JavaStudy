package ex06array;

public class E05TwoDimArray01 {
	public static void main(String[] args) {

//		1. 1차원 배열
		int[] arr2 = new int[5];
		arr2[0] = 1;
		
//		배열명을 출력하면 배열을 위치값
		System.out.println("arr2 배열명 출력:" + arr2);
		System.out.println("arr2[0] 원소 출력:" + arr2[0]);
//		초기화하지 않은 요소는 0이 나온다
		System.out.println("arr2[3] 원소 출력:" + arr2[3]);
		

//		2. 2차원 배열
//		3행 4열 배열 생성. 초기화할 원소가 없는 부분은 null로 채워짐
//		* null : 빈값. 스페이스/공백/0 이 아님!
		int[][] arr = {
				{1,2},
				{3,4,5},
				{6,7,8,9}
		};
		
//		2차원 배열에서 length는 행의 크기
		System.out.println("배열의 세로크기:" +arr.length); // 3
		System.out.println("배열명이 가진 값 출력(arr):" +arr); 
		
//		각행의 크기를 출력하기 위해 반복문
		for(int i=0 ; i<arr.length ; i++) {
//			2차원 배열에서 각 행의 크기는 배열명[인덱스]
			System.out.printf("%d행의 크기: %d\n", i, arr[i].length);
			System.out.printf("%d행의 출력: %s\n", i, arr[i]);
		}
		
		System.out.println("배열 출력하기");
		System.out.println("arr[0][1]=" + arr[0][1]);
//		2차원 배열에서 특정요소에 접근하기 위해서는 2개의 배열 기호 필요
//		null 부분을 출력하면 예외발생 -> 배열의 인덱스를 초과했기 때문
		System.out.println("arr[0][3]=" +arr[0][2]);
		
	}
}
