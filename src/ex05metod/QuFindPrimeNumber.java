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
public class QuFindPrimeNumber {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=100 ; i++) {
			if(isPrimeNumber(i))
				System.out.println(i);
		}
	
	}
	
	public static boolean isPrimeNumber(int num) {
		
//		0,1은 소수제외
		if(num<2)
			return false;
		
//		소수의 경우 자기자신보다 작은 수에 나누어지지 않음
		for(int i=2 ; i<num ; i++) {
			if(num%i==0)
				return false;
		}
		return true;
		
		
	}
	
}
