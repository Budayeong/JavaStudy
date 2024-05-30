package ex06array;

public class E02ArrayAndMethod {
	public static void main(String[] args) {
		/*
		배열 선언과 동시에 초기화 -> 초기값의 개수를 통해 크기가 결정
		*/
		int[] arr = {1, 2, 3, 4, 5};
		
//		배열변수만 선언해서 참조할 변수가 없는상태
		int[] ref;
		System.out.println("초기화 직후 출력");
		for(int i =0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
//		배열명 - 배열이 저장되어있는 Heap 메모리 주소값 출력
		System.out.println("arr변수:" + arr);
		//1 2 3 4 5
		
//		arr은 참조값, 7은 기본자료형 int 이기때문에 7이라는 값 자체가 전달됨
//		arr에는 배열의 주소값이 저장되어있음 -> 그것을 넘겼기때문에 ref도 arr과 같은 배열을 참조하고 있는 것
		ref = addAllArray(arr, 7);
		
//		arr 참조값을 매개변수로 넘기고 다시 반환받음 -> arr 과 동일한 배열을 참조하게됨
//		즉, ref와 arr는 같은 위치(배열)를 의미함
		System.out.println("메서드 호출 후 출력");
		for(int i=0 ; i<ref.length ; i++) {
			System.out.print(ref[i] + " ");
		}
		System.out.println();
		//8 9 10 11 12
		
		for(int i=0 ; i<arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
// int[] 배열을 ar로 받음 -> 참조값을 받게되므로 같은 배열을 참조하게됨
	static int[] addAllArray(int[] ar, int addVal) {
		for (int i =0 ; i<ar.length ; i++) {
			ar[i] += addVal;
		}
		return ar;
	}
}
