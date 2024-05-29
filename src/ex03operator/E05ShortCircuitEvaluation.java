package ex03operator;

public class E05ShortCircuitEvaluation {
	public static void main(String[] args) {
		
		/*
		SCE(Short-Circut Evaluation): 하나의 조건검사만으로 결과를 알 수 있는 경우 뒤의 조건을 검사하지 않음
			변수의 값이 변경되는 코드가 있다면 실행되지 않으므로 주의
		*/
		int num1=0, num2=0;
		boolean result;
		 
		
//		논리AND 둘다 true여야 true -> 앞이 false면 두번째는 검사 X
		result = (num1+=10)<0 && (num2+=10)>0;
		System.out.println("result=" + result);
		System.out.println("num1=" + num1 + ", num2=" + num2);
		// false
		// num1=10, num2=0
		
//		논리OR 둘다 fasle여야 false
		result = (num1+=10)>0 || (num2+=10)>0;
		System.out.println("result=" + result);
//		마찬가지로 뒤의 조건이 실행되지않기때문에 ()안에 num2의 변화는 일어나지않음
		System.out.println("num1=" + num1 + ", num2=" + num2);
		// true
		// num1=20, num2=0
	}
}
