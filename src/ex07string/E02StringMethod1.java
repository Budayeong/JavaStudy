package ex07string;

public class E02StringMethod1 {
	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메소드1");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
		
//		1) length() : 문자열의 길이 반환
		System.out.println("## 1 ##");
		System.out.println("str1의 길이:" + str1.length()); //15
		System.out.println("str2의 길이: " + str2.length()); //7
		
//		2) charAt(인덱스) : 문자열에서 (인덱스) 에 해당하는 문자 하나 반환
		System.out.println("### 2 ###");
		System.out.println("str1의 두번째 문자: " + str1.charAt(1)); //e
		System.out.println("str2의 두번째 문자: "+ str2.charAt(1)); //바
		
//		3) compareTo() : 문자열 비교
//			- 2개의 문자열 중 첫번째부터 순차 비교
//			- 앞문자의 아스키코드가 크면 양수 반환, 뒷문자의 아스키코드가 크면 음수 반환, 같으면 0 반환
		System.out.println("### 3 ###");
		String str3 ="A";
		String str4 = "B";
		System.out.println(str3.compareTo(str4)); //-1
		System.out.println(str4.compareTo(str3)); //1
		System.out.println("ABC".compareTo("ABC")==0 ? "문자열이 같다" : "문자열이다르다"); //문자열이 같다
		
//		4) concat() : 두개의 문자열을 연결. print()문에서 + 와 동일
		System.out.println("### 4 ###");
		System.out.println("JAVA".concat(" WORLD").concat(" GO")); //JAVA WORLD GO
		System.out.println("JAVA" + " WORLE" + " GO"); //JAVA WORLD GO
		
//		5) contains() : 문자열에 특정 문자열이 포함되어 있는지 판단 (true/false)
		System.out.println("### 5 ###");
		System.out.println(str1.contains("TO")); //false
		System.out.println(str1.contains("to")); //true
	}
}
