package ex04controlstatement;

/*
for문
: while문과 같은 반복문으로 초기값, 조건식, 증감식이 한줄에 있어 반복의 횟수를 명확히 알 수 있음
=> 반복의 횟수가 정해져있는 경우 주로 사용
[형식]
	for(초기값 ; 조건식 ; 증감식) {
		실행문;
	}
*/
public class E05For {
	public static void main(String[] args) {
		
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i=" + i);
		}
//		
//		[시나리오] 1~100까지의 합을 구하는 프로그램 -for문
		int sum = 0;
		for(int j=1 ; j<=100 ; j++) {
			sum += j;
		}
		System.out.println("1~100까지의합: " + sum);
		
//		[시나리오] for문을 이용하여 1~10까지의 정수 중 2의배수의 합을 구하는 프로그램
//		방법 1. 1~10까지 10번 반복해서 if문을 통해 2의 배수를 찾은 후 누적해서 합
		int total = 0;
		for(int i=1 ; i<=10 ; i++) {
			if(i%2==0) {
				total += i;
			}
		}
		System.out.println("1~10사이 2의배수의 합 (방법1): " + total );
		
//		방법 2. if문 없이 초기값을 0부터 시작해 2씩 증가시켜 처음부터 i로 2의배수만 들어옴
//		total = 0;
//		for(int i=0 ; i<=10 ; i+=2) {
//			total += i;
//		}
//		System.out.println("1~10사이의 2의 배수의 합 (방법2): " + total);
		
//		for문으로 무한루프를 만들 때는 (;;)와 같이 표현
//		while(true)와 동일한 표현
//		int a = 1;
//		for(;;) {
//			System.out.println("나는 for문으로 만든 무한루프입니다" + a);
//			a++;
////			a가 1000이 되면 반복문을 탈출 (반복문에서 break를 만나면 즉시 탈출)
//			if(a==1000) break;
//		}
		
//		for문의 끝에 ;을 사용ㅎ면 반복할 문장이 없는것으로 간주됨 (잘못된 문장)
//		for(int j=0 ; j<=5 ; j++);
//		{
//			System.out.println("어랏... 나는 누구? 여긴 어디?");
//		}
		
//		for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간 메모리에서 소멸 (=지역변수)
//		for문의 블럭을 벗어나 j가 소멸되어 존재하지않음
//		System.out.println("위 for문에서 선언한 변수 j=" +j);
//		System.out.println("위 main함수 지역에서 선언한 변수 total=" + total);
		
		
//		for문의 초기값을 외부(여기선 main함수)에서 선언하면 해당변수는 for문 안쪽(좁은지역)에서 사용할 수 있음
//		아래 선언한 i는 main메서드의 지역변수	
//		int i = 0;
//		for( ; i<=5 ; i++) {
//			System.out.println("for문 안에서의 i값=" + i);
//		}
//		System.out.println("for문 밖에서의 i값=" +i);
		
		/*
		자바에서 중괄호 -> 지역
		if문, while문 등의 제어문도 하나의 지역을 형성하게 됨
		*/
		
		
//		[연습문제1] 구구단을 출력하는 프로그램을 for문으로 작성
//		for(i=2 ; i<=9 ; i++) {
//			int j = 1;
//			for(j=1 ; j<=9 ; j++) {
//				System.out.printf("%d x %d = %2d ,", i, j,(i*j));
//			}
//			System.out.println();
//		}
		
//		단에 해당하는 for문
//		for(int dan=2 ; dan<=9 ; dan++) {
////			곱할 수에 해당하는 for문
//			for(int su=1 ; su<=9 ; su++) {
////				System.out.print(dan + "x" + su + "=" + (dan*su));
//				System.out.printf("%d*%d=%2d", dan, su, dan*su);
////				각 항목을 구분하기 위해 띄어쓰기
//				System.out.print(" ");
//			}
////			하나의 단을 모두 출력한 후 줄바꿈 처리
//			System.out.println();
//		}
		
	}
}
