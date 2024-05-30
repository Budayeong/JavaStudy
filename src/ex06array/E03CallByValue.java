package ex06array;

public class E03CallByValue {
	
	/*
	Call by value(값에 의한 호출)
	: 메서드 호출 관련 개념, 매개변수를 통해 값을 전달할 때 메모리 '복사'를 통해 값이 전달됨
	다른 지역에서 값의 변경이 있더라도 호출한 메서ㄷ의 값에는 영향이 미치지 않는다.
	메모리적 관점) 스택영역만 사용됨. main과 호출된 메서드는 서로 다른 지역이므로 영향을 미치지 않는 것
	*/
	public static void main(String[] args) {
		
//		main 지역에서 최초로 변수 생성
		int first=100, second=200;
		
		System.out.println("[main메서드 내부 - 호출전]" + "first=" + first+", second=" + second); 
		// 100, 200
		
		callByValue(first, second);
		
		// 매개변수로 전달된 값은 복사되어 다른 지역의 메서드 내에서만 변경됨 -> 원본 데이터의 값은 변경되지않음
		System.out.println("[main메서드 내부 - 호출 후]" + "first=" + first + ", second=" + second);
		
	}
	
//	매개변수로 전달된 값은 복사되어 해당 지역의 메서드에서 사용할 수 있게됨
//	즉, 매개변ㅅ의 전달은 메모리의 복사에 의해 이뤄짐
	public static void callByValue(int fNum, int sNum) {
		/*
		Swap(교환): 두개의 변수가 할당받은 값을 서로 교환하는 알고리즘
		- 교환시 임시변수(temp) 하나를 추가로 필요로 함
		*/
	
//		fNum의 값을 보관해두기 위해 temp 선언
		int temp;
		temp = fNum;
		fNum = sNum;
		sNum = temp;
		
		System.out.println("[callByValue메서드안]"+"first="+fNum+", second="+sNum);
	}
}
