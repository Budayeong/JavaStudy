package ex04controlstatement;

/*
break : 반복문, switch에서 주로 사용. 블럭 내에서 탈출
	중첩 반복문이라면 가장 가까운 반복문 하나만 탈출
	
continue : 반복문의 처음으로 돌아감. while문의 경우 조건 확인. for문의 경우 증감식 실행
	continue 아래 문장은 실행되지않음
*/
public class E06BreakContinue {
	public static void main(String[] args) {
		
		int i = 0;
//		무한루프 조건 
		while(true) {
			/*
			반복문 내에서 break, continue를 사용할때는 반드시 조건문과 같이 사용해야함 (break,continue아래에 unrechable코드 위험 존재)
			*/
			i++;
			System.out.printf("[i가 %d일때]\n", i);
			
			System.out.println("continue이전 출력문");
			if(i%2==0) continue;
			System.out.println("continue이후 출력문");
			
			System.out.println("break이전 출력문");
//			i가 3일때 while 탈출
			if(i==3) break;
			System.out.println("break이후 출력문");
			
		}
		
//			중첩된 반복문 안에서 break를 만나면 가장 가까운 반복문 한개를 탈출함 (모든 반복문 탈출이 아님)
			for(int x=1 ; x<=5 ; x++) {
				System.out.println("x=" + x);
				for(int y=1 ; y<=5 ;y++) {
					System.out.println("y=" +y);
					if(y==3)
						break;
				}
			}
		
		
	}
}
