package ex15usefulclass;

/*
equals() 메서드
- 비교연산자(==)는 stack 값을 비교함 -> 실제 내용에 대한 비교가 아님
- 인스턴스 간의 내용 비교를 위해서는 equals()를 오버라이딩해 사용
- String 클래스의 equals()는 문자열의 내용이 같으면 true를 리턴하도록 오버라이딩 되어있음
*/
class IntNumber {
	int num;
	public IntNumber(int num) {
		this.num = num;
	}
	
	public boolean myEquals(IntNumber numObj) {
		if(this.num==numObj.num)
			return true;
		else 
			return false;
	}
}


public class E04Object2MyEquals {
	public static void main(String[] args) {
		
		String str1 = new String("Java개발자");
		String str2 = "Java개발자";
		if(str1.equals(str2)) {
			System.out.println("같은 문자열입니다."); //String 클래스의 equals는 문자열의 내용을 비교하기때문에 같은 문자열입니다 출력
		}
		else
			System.out.println("다른 문자열입니다.");
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
//		직접 정의한 myEquals로 인스턴스간 내용비교 - 인스턴스 간 비교를 할때는 내용에 대한 비교를 해야함
		if(num1.myEquals(num2))
			System.out.println("num1과 num2는 동일한 정수");
		else
			System.out.println("num1과 num2는 다른 정수");
		
		if(num1.myEquals(num3))
			System.out.println("num1과 num3는 동일한 정수");
		else
			System.out.println("num1과 num3는 다른 정수");
		
		
		
	}
}
