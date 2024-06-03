package ex06array;


/*
다음에 주어진 answer 배열에는 1~4까지의 정수가 여러개 저장되어 있다. 배열 전체의 데이터를 읽어서 각
정수가 몇개씩 있는지 카운트하여 counter 배열에 순서대로 저장하시오.

샘플코드]
int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
int[] counter = new int[4];

실행결과]
counter[0] => 3
counter[1] => 2
counter[2] => 2
counter[3] => 4

*/
public class QuNumberCounter {
	public static void main(String[] args) {
		
		int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
		int[] counter = new int[4];
		int count = 0;

//		answer 요소의 최소값부터 최대값까지 반복
		for(int i=1 ; i<=4 ; i++) {
//			answer 배열의 원소의 값과 i 가 같으면 count 1증가
//			answer 배열에 특정 원소의 개수를 count에 저장함
			for(int e: answer) {
				if(e==i)
					count++;
			}
//			배열의 앞부터 정수의 개수 값 저장
			counter[i-1]=count;
			count=0;
		}
		
		for(int i=0 ; i<=3 ; i++) {
			System.out.printf("counter[%d] => %d \n", i, counter[i]);
		}
		
		
	}
}
