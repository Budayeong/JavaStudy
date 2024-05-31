package ex07string;

public class Test {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
	
		while(i<=100) {
			if(i%3==0) {
			sum+=i;
			System.out.println("i="+i);
			}
			i++;
		}
		System.out.println(sum);
		
//		i=1;
//		sum=0;
//		while(i<=100) {
//			if(i%7==0) {
//			sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);
		
//		i=1;
//		sum=0;
//		while(i<=100) {
//			if(i%21==0) {
//			sum+=i;
//			System.out.println("i="+i);
//			}
//			i++;
//		}
//		System.out.println(sum);
			
		System.out.println(7+14+28+35+49+56+70+77+91+98);
		
	}
}	
