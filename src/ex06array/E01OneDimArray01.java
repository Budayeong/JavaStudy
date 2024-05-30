package ex06array;

/*
배열: 순차적인 메모리 공간이 할당되는 형태, 여러개의 변수가 필요한 경우 사용
- java에서는 배열을 인스턴스 형태로 생성함 -> new 사용
- 생성된 배열은 Heap에 저장, 할당된 메모리의 주소값을 반환
- 배열명(배열변수)는 주소값(참조값)을 할당받음
*/
public class E01OneDimArray01 {
	public static void main(String[] args) {
		
		int[] numArr = new int[3];
		numArr[0] = 10;
		numArr[1] = 20;
		numArr[2] = 30;
//		인덱스로 접근해 값 출력
		System.out.println("numArr의 0번방의 값:" + numArr[0]);
		System.out.println("numArr의 1번방의 값:" + numArr[1]);
		System.out.println("numArr의 2번방의 값:" + numArr[2]);
//		배열이 Heap영역에 생성된 후 numArr변수에 주소값이 저장됨
		System.out.println("numArr 배열명" + numArr);
		System.out.println("==============================");
		
		
		/*
		배열 선언 및 초기화: 초기화를 위해 for문 사용
		- 배열명.length: 해당 배열의 크기 반환 (배열 크기가 변경되는 경우에도 유연하게 대처 가능)
		*/
		int[] arrNumber = new int[40];
//		배열의 각 요소를 10부터 1씩 증가시키면서 초기화
		for(int i=0 ; i<arrNumber.length ; i++) {
			arrNumber[i] = i+10;
		}
		
//		배열의 길이가 변경되면 대처 필요
		for(int i=0 ; i<40 ; i++) {
			System.out.println(i+"번방의 값 =" + arrNumber[i]);
		}
		System.out.println("==================");
		
		
//		인스턴스배열: 기본자료형이 아닌 인스턴스 참조값을 저장할 목적으로 생성한 배열
		String[] strArr = new String[3];
		strArr[0] = "java";
		strArr[1] = "jsp";
		strArr[2] = "spring";
		for(int j=0 ; j<strArr.length ; j++) {
			System.out.println(strArr[j]);
		}
		System.out.println("==================");
		
		System.out.println("배열의 선언과 초기화");
		System.out.println("방법1: 배열의 선언 이후 초기화");
		int[] initArr = new int[1];
		initArr[0] = 100;
		System.out.println("initArr[0]=" + initArr[0]);
		
		System.out.println("방법2: 선언과 동시에 초기화 1");
//		배열을 선언과 동시에 초기화하는 경우 초기값의 배열을 통해 배열의 크기를 결정할 수 있기때문에 크기는 생략해야함
//		int[] initArr2 = new int[3] {1, 20, 300};
		int[] initArray2 = new int[] {1, 20, 300};
		
		System.out.println("방법3: 초기값만으로 선언");
//		배열 선언과 동시에 초기화하는 경우에는 new 생략 가능
		int[] initArr3 = {11, 13, 17, 19, 23};
		int arrSum = 0;
		for(int x=0 ; x<initArr3.length ; x++) {
			arrSum += initArr3[x];
		}
		System.out.println("배열요소의 합은=" + arrSum);
		
	}
}
