package ex15usefulclass;

import java.util.Random;

public class E07Random {
	public static void main(String[] args) {
		/*		
		Random클래스는 인스턴스 생성 시 전달되는 인수(=Seed)를 기반으로 난수 생성.
			- 동일한 Seed를 사용하면 항상 동일한 패턴의 난수가 생성됨 = 가짜난수(Pseudo-random number)
		*/		
		System.out.println("# 가짜난수 : 같은 패턴의 난수만 생성됨");
		Random random1 = new Random(32);
		for (int i=0 ; i<10 ; i++) 
			System.out.print(random1.nextInt(100)+ " ");
		
		/*
		Random 클래스 nextInt(N) 메서드
		: 0 ~ N-1 까지의 난수 생성
		*/
		System.out.println("\n# 난수생성1 : 씨드없음");
		Random random2 = new Random();
		for (int i=0 ; i<10; i++)
			System.out.print(random2.nextInt(100)+" ");
		
//		setSeed() 메서드 : 씨드부여
//		현재시간을 밀리세컨즈 단위로 반환하는 메서드를 사용하면 매번 새로운 Seed 생성 가능
		System.out.println("\n# 난수생성2 : 변화하는 시간으로 씨드지정");
		Random random3 = new Random();
		random3.setSeed(System.currentTimeMillis());
		for (int i=0 ; i<10; i++)
			System.out.print(random3.nextInt(100)+" ");
		
		/*
		nextInt()에 인수가 없는 경우 음수, 양수가 혼용된 난수 생성.
		Math.abs()를 통해 양수로 변환하고 특정수를 나누는 형태로 필요한 난수를 생성할 수 있음
		*/
		System.out.println("\n# 난수생성3 : nextInt() 인수없음");
		Random random4 = new Random();
		for (int i=0 ; i<10; i++)
			System.out.print(random4.nextInt()+" ");
		
		
	}
}
