package ex06array;

import java.util.Scanner;

/*
길이가 10인 배열을 선언한 후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터
채워나간다.(두번째배열)

실행결과]
1번째 정수를 입력하세요:2
2번째 정수를 입력하세요:4
3번째 정수를 입력하세요:5
4번째 정수를 입력하세요:3
5번째 정수를 입력하세요:2
6번째 정수를 입력하세요:9
7번째 정수를 입력하세요:7
8번째 정수를 입력하세요:8
9번째 정수를 입력하세요:5
10번째 정수를 입력하세요:1
순서대로입력된결과
2 4 5 3 2 9 7 8 5 1
홀수/짝수 구분입력결과
5 3 9 7 5 1 8 2 4 2

*/

public class QuFillArray {
	public static void main(String[] args) {
		
//		길이가 10인 배열 선언 
		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		
		Scanner input = new Scanner(System.in);
		

//		10개의 정수를 입력받고 arr1 배열에 입력받은 순서대로 저장
		for(int i=1 ; i<=10 ; i++) {
			System.out.print( i +"번째 정수를 입력하세요: ");
			int num = input.nextInt();
			arr1[i-1]=num;
		}
		
//		arr1 배열 출력
		System.out.println("순서대로 입력된 결과:");
		for(int e : arr1) {
			System.out.print(e +" ");
		}
		System.out.println();
		
//		짝수를 저장할 배열의 인덱스를 표현할 변수
		int odd = 0;
//		홀수를 저장할 배열의 인덱스를 표현할 변수
		int even = 0;
//		입력받은 정수를 순서대로 저장한 배열 arr1의 요소가 짝수인지 홀수인지 판단
		for(int e : arr1) {
			if (e%2==0) {
//				요소가 짝수이면 arr2의 뒷부분부터 요소를 저장 (9가 인덱스의 끝)
				arr2[9-even]=e;
				even++;
			}
			else {
//				요소가 홀수이면 arr2의 앞부분부터 요소를 저장
				arr2[odd]=e;
				odd++;
			}
		}		
		
		System.out.println("홀수/짝수 구분입력결과:");
		for(int e : arr2) {
			System.out.print(e +" ");
		}
		
		
	}
}
