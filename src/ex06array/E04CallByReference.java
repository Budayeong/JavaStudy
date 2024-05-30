package ex06array;

/*
Call by Refernece(참조에 의한 호출)
: 메서드를 호출할때 참조값(주소)을 전달함 -> 서로 다른 지역에서도 동일한 메모리(Heap)을 참조할 수 있게함
	참조값을 통해 인스턴스를 참조하므로 A지역에서의 값의 변경이 B지역에서도 그대로 참조됨
	참조값만 전달하므로 프로그램의 퍼포먼스(성능) 향상, 메모리 절약 가능
*/
public class E04CallByReference {
	public static void main(String[] args) {
		
		int[] arr = {100, 200};
		System.out.println("[메인메소드]-Swap 전 출력");
		for(int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		//100 200
		
		callByReference(arr);
		System.out.println();
		//200 100
		
//		지역이 달라도 참조값을 통해 동일한 메모리 위치를 참조하기 때문에 동일한 출력결과
		System.out.println("[메인메소드]- Swap이후 출력");
		for (int i=0 ; i<arr.length ; i++) {
			System.out.print(arr[i]+" ");
		}
		//200 100
		
	}
	
	
	static void callByReference(int[] ref) {
		
//		매개변수를 통해 전달받은 배열 인스턴스 참조값을 통해 0번 인자와 1번인자 교환 (Swap)
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
		
		System.out.println("[callByRefernece메서드]-Swap이후 출력");
		for(int i=0 ;i<ref.length ; i++) {
			System.out.print(ref[i]+" ");
		}
	}
	
	
	
}
