package ex05metod;

/*
지역변수(Local variable)
- 변수는 사용범위(Scope)를 가지고 있고, 해당 지역에서만 사용 가능
- 해당 지역을 벗어나면 즉시 메모리에서 소멸됨
- 기본자료형은 스택(Stack) 메모리 사용
- Stack(LIFO)은 CPU가 메모리의 생성 및 소멸 주관
*/
public class E06LocalVariable {
	public static void main(String[] args) {
		
		boolean scope = true;
//		main지역에서 num을 선언하면 그보다 좁은 지역인 if문에서는 같은이름의 num 변수를 선언할 수 없음
//		int num = 9 ;
		
		
//		if문과 else문은 서로 다른 지역 -> 동일 이름의 변수 선언 가능
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역:" + num);
		} else {
			int num =5;
			System.out.println("첫번째 if문의 else지역: " + num);
		}
		
//		if문에서 선언된 변수 num은 해당 블럭을 벗어나는 순간 소멸됨 -> if아래에서 새로운 num 선언 가능
		int num =100;
		System.out.println("main메서도 지역:" + num);
		
		simpleFunc();
		
		System.out.println("main메서드 끝");
	
	}
	
//	main지역에서 선언한 변수 num은 메모리에 아직 상주하고 있지만 해당 메서드는 크기가 동일한 다른 지역에 정의되었으므로 같은 이름의 변수를 선언가능
	static void simpleFunc() {
		int num =10000;
		System.out.println("simple메서드지역:" + num);
	}
}
