package ex04controlstatement;

/*
문제1) 1~100까지의 숫자중 3의배수 이거나 7의배수인 숫자의 합을 구하는 프로그램을 while, do~while, for문으로 각각 작성하시오. 단, 3과 7의 공배수인 경우 합에서 제외해야 한다. 출력의 결과는 누적되는 모든 수를 콘솔에 print한다. 
하나의 파일에 한꺼번에 작성하므로 동일한 결과가 3번 출력됩니다. 
*/

public class Qu3Or7Sum {
	public static void main(String[] args) {
		
		// 1. while문
		int i = 1;
		int sum = 0;
		
		System.out.println("======== while문 ===========");
		while(i<=100) {
			// 3의 배수이거나 7의 배수인 경우 실행
			if(i%3==0 || i%7==0) {
				// 3의 배수이거나 7의 배수이지만 21의 배수(3과 7의 공배수)가 아닌 경우에만 sum 에 값 누적
				if(!(i%21==0))
					sum += i;
				// 21의 배수인 경우 값 누적 안함
				else 		
					System.out.println(i+"는 3과 7의 공배수입니다. 계산에서 제외됩니다");
			}
			i++;
		}
        System.out.println("[3과 7의 배수의 합] (공배수제외): " + sum);
		System.out.println();
		
		
		
		// 2.do-while문
		i =  1;
		sum = 0;
		
		System.out.println("======== do-while문 ===========");
		do {
			if(i%3==0 || i%7==0) {
				if(!(i%21==0))
					sum += i;
				else 		
					System.out.println(i+"는 3과 7의 공배수입니다. 계산에서 제외됩니다");
			}
			i++;
		} while(i<=100);
		 System.out.println("[3과 7의 배수의 합] (공배수제외): " + sum);
		System.out.println();
		

		// 3. for문
		i = 1;
		sum = 0;
		
		System.out.println("======== for문 ===========");
		for(i=1 ; i<=100 ; i++) {
			if(i%3==0 || i%7==0) {
				if(!(i%21==0))
					sum += i;
				else 				
					System.out.println(i+"는 3과 7의 공배수입니다. 계산에서 제외됩니다");
			}
		}
		 System.out.println("[3과 7의 배수의 합] (공배수제외): " + sum);
		System.out.println();
		

	}
}
