package ex04controlstatement;

//else문에는 조건식이 들어가면 에러 발생
public class E01If03 {
	public static void main(String[] args) {
		
		/*
		[시나리오] 국,영,수 점수의 평균값을 구하여 학점을 출력.
			90점 이상은 A, 60점 미만은 F학점
		*/
		
		
		int kor=99, eng=70, math=64;
//		kor,eng,math가 int이기때문에 3으로 나누면 int값이 나옴 -> 소수점값도 얻기 위해 3.0으로 나눠줌
		double avg =  (kor+eng+math) / 3.0;
		System.out.println("평균점수는(그대로):" + avg);
		System.out.printf("평균점수는(소수2자리):%.2f\n", avg);
		
		System.out.println("----올바른 조건식의 if문----");
		if(avg>=90) {
			System.out.println("A학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=60) {
			System.out.println("D학점");
		}
		else {
			System.out.println("F학점. 학사경고!! 넌 바보야!");
		}
		
		System.out.println("----잘못된 조건식의 if문----");
		/*
		앞선 if문과 차이는 조건의 순서
		문법오류는 없으나 논리적 오류가 발생함 (주의필요)
		 */
		if(avg>=60) {
			System.out.println("D학점");
		}
		else if(avg>=70) {
			System.out.println("C학점");
		}
		else if(avg>=80) {
			System.out.println("B학점");
		}
		else if(avg>=90) {
			System.out.println("A학점");
		}
		else {
			System.out.println("F학점. 학사경고!! 넌 바보야!");
		}
	}
}
