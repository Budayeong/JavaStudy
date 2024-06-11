package ex12inheritance;

class At {
	static int m=3;
}

class Bt extends At {
	static int m=4;
}

public class Test {
	public static void main(String[] args) {
		
		At a = new At();
		At a2 = new At();
		At ab = new Bt();
		Bt bb = new Bt();
		
		System.out.println(a.m);
		System.out.println(a2.m);
		System.out.println(ab.m);
		System.out.println(bb.m);
		
		ab.m = 5;
		
		System.out.println(a.m);
		System.out.println(a2.m);
		System.out.println(ab.m);
		System.out.println(bb.m);
		
	}
}
