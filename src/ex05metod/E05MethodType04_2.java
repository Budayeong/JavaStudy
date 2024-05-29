package ex05metod;

import java.util.Scanner;

/*
[시나리오] 여러개의 숫자를 입력받은 후 최대값을 구하는 메소드 정의
	단, 숫자의 개수는 매개변수로 전달받고 숫자의 개수만큼 Scanner클래스를 통해 입력받음
	입력받은 숫자중 최대값을 찾아 반환
*/
public class E05MethodType04_2 {
	
	public static void main(String[] args) {
		
		int maxValue1 = returnMaxNumber(4);
		System.out.println("최대값1:" + maxValue1);
		
		int maxValue2 = returnMaxNumber(6);
		System.out.println("최대값2:" + maxValue2);
	}
	
	static int returnMaxNumber (int numberCnt) {
		Scanner scanner = new Scanner(System.in);
//		최대값을 저장할 변수
		int maxVal = 0;
//		매개변수로 전달된 인수의 크기만큼 반복
		for(int i=1 ; i<numberCnt ; i++) {
			System.out.print("정수를 입력하세요:");
			int inputNum = scanner.nextInt();
			
			if(i==1) {
				
//				처음 입력받은 정수는 비교값이 없기때문에 무조건 최대값
				maxVal = inputNum;
			}
			else {
//				두번째 입력값부터는 기존의 최대갑소가 비교해서 더 큰 값을 maxVal에 저장 (교체)
				if(maxVal<inputNum) {
					maxVal = inputNum;
				}
			}
		}
//		즉 새로운 입력값이 기존보다 크다면 지속적으로 교체하여 가장 큰 값이 maxVal에 저장됨		
		return maxVal;
	}
	
	
	
}
