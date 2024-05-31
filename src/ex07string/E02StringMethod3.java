package ex07string;

public class E02StringMethod3 {
	public static void main(String[] args) {
		
		System.out.println("String 클래스의 주요 메서드3");
		
		String str1 = "Welcome to java";
		String str2 = "자바야 놀자!";
		
//		11) lastIndexOf() : 문자열에서 특정 문자열의 인덱스를 뒤에서부터 찾음
//			- 파일 확장자를 찾는 업무 등에서 사용
		System.out.println("### 11 ###");
		System.out.println(str1.lastIndexOf("ava"));
		System.out.println(str1.lastIndexOf("J"));
		System.out.println("indexOf:" + str1.lastIndexOf("a"));
		
//		12) replace : 특정 문자열을 찾아 지정된 문자열로 변경. 찾는 문자열이 없어도 에러는 발생하지 않는다.
		System.out.println("### 12 ###");
		System.out.println("j를 g로 변경하기");
		System.out.println(str1.replace("j", "g"));
		System.out.println("java를 Korea로 변경하기");
		System.out.println(str1.replace("java", "Korea"));
		
//		13) split() : 문자열을 구분자를 통해 분리해 String 배열로 반환. 해당 구분자가 없는 경우에는 문자열을 크기가 1인 배열로 반환
		System.out.println("### 13 ###");
		String phoneNumber = "010-1234-5678";
//		phoneNumber를 -로 분리해 배열로 반환
		String[] phoneArr = phoneNumber.split("-");
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.printf("phoneArr[%d]=%s\n", i, phoneArr[i]);
		}
//		구분자로 사용한 문자열이 없는 경우 문자열 전체가 통째로 반환됨 (크기가 1인 배열)
		phoneArr = phoneNumber.split("%");
		for(int i=0 ; i<phoneArr.length ; i++) {
			System.out.printf("phoneArr[%d]=%s\n", i, phoneArr[i]);
		}
		
//		14) substring() : 시작인덱스와 마지막인덱스 사이의 문자열을 잘라서 반환
//			방법1. 인덱스 하나만 사용 : 시작인덱스부터 끝까지
//			방법2. 2개의 인덱스 사용 : 시작인덱스부터 종료인덱스 전까지
		System.out.println("### 14 ###");
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,7));
		
	}
}
