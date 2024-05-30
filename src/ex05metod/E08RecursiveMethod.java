package ex05metod;

/*
재귀메서드(Recursinve, 순환호출) : 하나의 메서드에서 자신을 재귀적으로 호출하여 작업을 수행하는 방식으로 정의 (마치 반복문과 같은형태로 동작)
*/
public class E08RecursiveMethod {
	
	static int factorial(int number) {
//		매개변수의 값이 1인경우 재귀호출을 할 필요 없음
		int result;
		if(number==1) {
			result = 1;
		}
		else {
			result = number * factorial(number-1);
		}
		System.out.println("계산과정:number="+number+", result="+result);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("재귀함수를 이용한 팩토리얼 구하기");
		System.out.println("4factorial: " + factorial(4));
		System.out.println("10factorial: "+ factorial(10));
	}
}