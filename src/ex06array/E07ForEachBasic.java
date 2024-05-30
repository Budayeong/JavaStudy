package ex06array;

/*
foreach문
: 배열의 전체를 참조해야할 때 사용
- 배열의 요소를 참조의 형태로 가져와서 사용 -> 참조의 목적으로만 사용하고 값 변경은 허용되지 않음
[형식]
	for(자료형 참조변수 : 배열명) {
		실행문장;
		참조변수를 통해 사용가능;
	}
*/
public class E07ForEachBasic {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int sum =0;
		
//		일반 for문을 통해 index로 접근 후 요소의 합 계산
		for(int i=0 ; i<arr.length ; i++) {
			sum += arr[i];
		}
		System.out.println("기본 for문을 이용한 합계:" + sum);
		
//		배열 arr의 요소를 순서대로 하나씩 참조하여 출력하고, 더이상 참조할 요소가 없을 때 자동 종료
		sum=0;
		for(int e : arr) {
			System.out.print(e +" ");
			sum += e;
		}
		System.out.println("\nforeach문을 이용한 합계:"+sum);
		
		System.out.println("배열arr의 요소값 1 증가시키기");
		
//		참조형태로 각 원소를 읽어와서 변수 b에 할당하는 형식이므로 b의 값을 변경시켜도 실제 배열에 적용되지않음
		for(int b: arr) {
//			배열에서 꺼낸 후 b에 저장된 값이 증가한 것
			b++;
			System.out.print(b + " ");
		}
		System.out.println();
		System.out.println("배열 arr의 요소 재출력하기");
//		위에서 b++을 했어도 원본배열에 영향이 가지않음
		for(int c:arr) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		System.out.println("2차원 배열을 foreach문으로 출력");
		int[][] twoDim = {
				{1,2,3,4},
				{10,20,30,40},
				{100,200,300,400}
		};
		
//		2차원 배열에서 하나의 행씩 접근해 1차원 배열을 꺼내옴
		for(int[] a: twoDim) {
//			앞에서 꺼낸 배열의 각 원소에 접근해 출력
			for(int b: a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		

	
	}
}
