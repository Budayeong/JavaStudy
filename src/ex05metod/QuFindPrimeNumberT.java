package ex05metod;

/*
전달된 값이 소수인지 아닌지를 판단하여 소수인 경우 true를 아니면 false를 반환하는 메소드를 정의하고,
이를 이용해서 1부터 100사이의 소수를 전부 출력하는 main메소드를 정의하자.

메소드명 : isPrimeNumber()
소수란 : 특정 정수를 나눌수 있는것이 1과 자기 자신밖에 없는 수

2
3
5
……중략……
97

*/
public class QuFindPrimeNumberT {
	public static void main(String[] args) {
//		1~100까지의 정수 중 소수인지 판단하기 위해 반복호출
		for(int i=1 ; i<=100 ; i++) {
			boolean result = isPrimeNumber(i);
			if(result == true)
				System.out.printf("소수=%d \n", i);
		}
		
	}
	
	public static boolean isPrimeNumber(int n) {
		
		if(n==1)
			return false;
		
//		7이라면 1과 7로만 나누어져야함 -> 2~6까지만 나눠보면 됨
		for(int x=2 ; x<n ; x++) {
//			자기 자신보다 작은 값에서 나누어떨어지면 소수가 아님ㄴ
			if(n % x ==0)
				return false;
		}
		
//		위 반복문을 벗어났다면 소수이므로 true 반환
		return true;
	}
	
}
