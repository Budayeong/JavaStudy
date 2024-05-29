package ex04controlstatement;

import java.io.IOException;
import java.util.Scanner;

/*
do-while : 반드시 한번은 실행해야 할 경우.
[형식] do {
	실행문;
	증감식;
	} while(조건식); <= 문장끝에 세미콜론
*/
public class E04DoWhile {
	public static void main(String[] args) throws IOException {
		/*		
		[시나리오] E03 예제의 1~10까지 더하는 수열문제를 do~while문을 변경하여 구현		
		*/		
		int sum = 0;
		int i =1;
		
//		do -> 조건 검사없이 무조건 진입
		do {
//			증가하는 변수 i를 누적해 sum에 더함
			sum += i;
			i++;
//			탈출조건을 위해 증가시킨후 조건 확인
		} while (i<=10);
		System.out.println("1~10까지의 누적합:" +sum);
		
		/*
		[시나리오] 1부터 1000까지의 정수중 4의 배수이거나 7의 배수인 수의 합을 do-while문 이용 구현
		*/
		int total = 0;
		int j = 1;
		do {
			if(j%4==0 || j%7==0) {
				total += j;	
			}
			j++;
		} while(j<=1000);
		System.out.println("1~1000사이 4or7의 배수합:"+ total);
		  
		/*
		[시나리오] 국어, 영어, 수학 점수를 사용자로부터 입력받은 후 평균을 구해 A~F학점을 판단하여 출력.
		사용자가 X,x(대소문자 구분없음)을 입력하면 프로그램이 종료되어야함.
		*/
//		사용자로부터 점수를 입력받기위해 scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		int kor, eng, math, avg;
		int exitCode;
		do {
			System.out.print("국어점수:");
			kor = scanner.nextInt();
			System.out.print("영어점수:");
			eng = scanner.nextInt();
			System.out.println("수학점수:");
			math = scanner.nextInt();
			
//			평균점수의 구간을 설정하기 위해 평균/30
//			switch문은 조건식을 사용할 수 없고 산술식만 사용할 수 있기 때문
			avg = (kor+eng+math) / (3 * 10);
			
			switch (avg) {
			case 10: case 9: 
				System.out.println("A학점");break;
			case 8:
				System.out.println("B학점");break;
			case 7:
				System.out.println("C학점");break;
			case 6:
				System.out.println("D학점");break;
			default:
				System.out.println("F학점");
			}
				System.out.println("종료하려면 x(X)를 입력하세요.");
				System.out.println("계속하려면 아무키나 입력하세요.");
				exitCode = System.in.read();
				
			} while(!(exitCode=='x'||exitCode=='X'));

			/*
			- X를 입력한 경우
				!(true || false) => !(true) => false
				따라서 while문 탈출
			- a를 입력한 경우
				!(false || false) => !(flase) => true
				반복문의 처음으로 돌아감
			*/  
	}
}
