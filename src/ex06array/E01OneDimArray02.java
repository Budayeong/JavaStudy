package ex06array;

import java.util.Random;

public class E01OneDimArray02 {
	public static void main(String[] args) {
		
		/*
		난수생성방법1. Math 클래스의 random() 메서드는 0~1사이의 실수를 랜덤반환
			- 정수형태가 필요하면 *10, *100 등의 연산을 통해 필요한 데이터 생성
		*/
		double rndNumber = Math.random();
		System.out.println("생성된난수[실수]: " + rndNumber );
//		정수 실수 연산은 실수 반환 -> int로 강제 형변환 필요
		int intNumber = (int)Math.random()*100;
		System.out.println("생성된난수[정수]: "+intNumber);
		
		/*
		난수생성방법2. Random 클래스의 nextInt() 사용
		*/
		Random random = new Random();
		System.out.println("생성된 난수: " +random.nextInt());
		System.out.println("============================");
		
//		1~45 사이의 난수 생성방법
//		1. 0.xxx 형태의 난수 생성 후 정수로 변경하기 위해 *100
//		2. 45로 %연산 -> 0~44 사이의 값 획득
//		3. 0은 구간에 포함되지 않으므로 겨로가에 1을 더해줌
		System.out.println("1~45사이의 난수생성: " + (int)((Math.random()*100 % 45)+1));
		System.out.println("============================");
		
//		크기가 6인 배열을 생성해 난수 저장 후 출력 (중복된난수 존재가능/정렬X)
		System.out.println("크기가 6인 배열에 난수 입력");
		int[] lottoNum = new int[6];
//		난수 생성 후 배열에 순서대로 입력
		for(int i=0 ; i<lottoNum.length ; i++) {
			lottoNum[i] = (int)((Math.random()*100)%45) +1 ;
		}
		for(int i=0 ; i<lottoNum.length ; i++) {
			System.out.printf("%d ", lottoNum[i]);
		}
	}
}
