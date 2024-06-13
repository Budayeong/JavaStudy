package ex15usefulclass;

/*
JAVA 규칙: java.lang 패키지 하위의 모든 클래스는 자동으로 import 됨 (임포트문 작성 필요X)
	따라서 java.lang 패키지의 모든 클래스는 별도의 선언없이 사용할 수 있음
*/
import java.lang.*;

public class E03MathClass {
	public static void main(String[] args) {
		
		/*
		Math 클래스
		- java.lang 패키지에 정의된 클래스
		- 수학관련 작업 처리 메서드가 정의되어있음
		- 메서드는 static으로 선언되어 있어 클래스명으로 호출가능
		*/
		
		System.out.println("원주율: " + Math.PI);
		
		float f = -3.14f;
		double d=  -100.9;
		int num = -10;
		
		System.out.println("### 절대값 ###");
		System.out.println("Math.abs: " + Math.abs(f));
		System.out.println("Math.abs: " + Math.abs(d));
		System.out.println("Math.abs: " + Math.abs(num));
		
		System.out.println("### 올림 ###");
		System.out.println("Math.ceil: " + Math.ceil(3.4));
		System.out.println("Math.ceil: "  + Math.ceil(-3.4));
		System.out.println("Math.ceil: " + Math.ceil(3.9));
		
		System.out.println("### 내림 ###");
		System.out.println("Math.floor: " + Math.floor(3.4));
		System.out.println("Math.floor: " + Math.floor(-3.4));
		System.out.println("Math.floor: " + Math.floor(3.9));
		
//		가장 가까운 정수쪽으로 올림/버림 결정 (x.5 이상 -> 올림, 미만 -> 버림)
		System.out.println("### 반올림 ###");
		System.out.println("Math.round: " + Math.round(3.49999)); //버림 3
		System.out.println("Math.round: " + Math.round(3.54444)); //올림 4
		System.out.println("Math.round: " + Math.round(-1.4));
		System.out.println("Math.round: " + Math.round(-1.5));
		System.out.println("Math.round: " + Math.round(-3.51));
		
		System.out.println("### 최대/최소 ###");
		System.out.println("Math.max: " + Math.max(100, 99));
		System.out.println("Math.min: " + Math.min(100, 99));
		
//		0~1 사이 실수값 랜덤 반환
		System.out.println("### 난수 ####");
		System.out.println((int)(Math.random()*45)+1);
		
		System.out.println("### 거듭제곰 ###");
		System.out.println("2의 10승은? " + Math.pow(2, 10));
		
	}
}
