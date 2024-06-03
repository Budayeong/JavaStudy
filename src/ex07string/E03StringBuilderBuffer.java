package ex07string;

/*
StringBuffer 클래스
: String 클래스는 기존 문자열에 새로운 문자열을 추가하면 새롭게 생성된 메모리에 저장함. 
기존 메모리가 소멸되고 새로운 메모리가 생성되는 낭비를 막기위해 문자열의 변경이 많은 경우 StringBuffer를 사용하는 것이 좋음.
기존의 메모리를 변경하고 부족한 경우 자동으로 확장함.
*/
public class E03StringBuilderBuffer {
	public static void main(String[] args) {
		
		/*
		append(값) : 문자열의 끝에 새로운 값을 연결
		insert(인덱스, 값) : 지정한 인덱스에 값 삽입
		*/
//		인스턴스 생성
		StringBuffer strBuf = new StringBuffer("AB");
//		정수 연결
		strBuf.append(25); //AB25
//		문자열, boolean값도 연결 가능
		strBuf.append("Y").append(true); //AB25Ytrue
		System.out.println("strBuf= " + strBuf);
		// strBuf= AB25Ytrue

//		인덱스 2에 false삽입
		strBuf.insert(2, false); //ABfalse25Ytrue
//		문자열의 길이를 통해 마지막 부분에 추가 -> append와 동일
		strBuf.insert(strBuf.length(), 'Z'); //ABfalse25YtrueZ
		System.out.println("strBuf= " + strBuf);
		
//		더블쿼테이션으로 동일한 문자열을 생성하므로 동일한 주소값을 가짐
		System.out.println("String 과 StringBuffer의 참조값 비교");
		String str1 = "Java&JSP";
		String str2 = "Java&JSP";
		if(str1==str2) System.out.println("연결 전: 주소값 동일");
		else System.out.println("연결 전: 주소값 다름");
		
//		버퍼를 사용하지 않고 문자열을 연결했을 때 -> 기존 메모리가 소멸되고 새로운 메모리 할당
		str1 = str1 + "&Spring";
		if(str1==str2) System.out.println("연결 후: 주소값 동일");
		else System.out.println("연결 후: 주소값 다름");
		
		/*
		StringBuffer는 문자열을 저장하기 위해 기본 메모리를 16으로 할당함
		차후 저장공간이 부족하면 자동으로 메모리 확장
		*/
		StringBuffer buf = new StringBuffer();
		System.out.println("buf= " + buf);
		System.out.println("저장된 문자열크기: "+ buf.length());
		System.out.println("기본버퍼크기: "+ buf.capacity());
		
		buf.append("Java 공부중...");
		System.out.println("buf= " +buf);
		System.out.println("저장된 문자열크기: "+buf.length());
		System.out.println("기본버퍼크기: " + buf.capacity());
		
		buf.append("금일은 StringBuffer 학습중..!!");
		System.out.println("buf= " + buf);
		System.out.println("저장된 문자열 크기: " + buf.length());
//		문자열의 크기가 16이상이면 자동으로 메모리 확장됨
		System.out.println("기본 버퍼 크기: " + buf.capacity());
		
		
	}
}
