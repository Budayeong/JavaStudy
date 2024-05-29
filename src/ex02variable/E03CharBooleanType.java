package ex02variable;

public class E03CharBooleanType {
public static void main(String[] args) {
	
	/*
	char: 하나의 문자를 저장할 수 있는 자료형 '' (single quotation)
		만약 "" 로 감싸면 문자열 인식하므로 String으로 선언해야함
	*/
	char ch1 = '가';
//	한글자이상-> 문자열이므로 char로 선언 불가
//	char chStr = '가나다라';
	String chStr = "가나다라";
	System.out.println("ch1=" + ch1); 
	System.out.println("chStr=" + chStr);

	
	/*
	아스키코드: 1byte로 표현할 수 있는 문자. 영문,숫자를 십진수로 정의한 것
		Ex) A => 65, a => 97
	유니코드: 1byte로 표현할 수 없는 문자. 영문 숫자 제외 모든 문자(한글, 한자 등)를 2byte로 표현. 
		보통 숫자가 크기 대문에 16진수로 표현함
	*/
	
//	ch2는 메모리에 65로 저장됨
	char ch2 = 'A';
	int num1 = 2;
//	문자열이 아닌 문자(char)는 아스키코드/유니코드로 저장되기 때문에 문자+정수 연산이 가능함
	int num2 = ch2 + num1;
	System.out.println("num2=" + num2); 
	System.out.println("(char)num2=" + (char)num2);
	
//	(char+int)=> int형 (char)(char+int) => char형으로 강제형변환
	char ch3 = (char)(ch2+num1);
	System.out.println("ch3(문자출력)=>" + ch3);
	System.out.println("ch3(아스키코드출력)=>" + (int)ch3);
	
//	싱글쿼테이션으로 감쌌으므로 ch4는 문자 '1'이 할당됨(=아스키코드49)
	char ch4 = '1';
//	연산결과는 50 (=문자'2')
	char ch4_1 = '1' + 1;
//	(int)ch4_1 은 ch4_1의 아스키코드가 반환됨
	System.out.println("ch4=" + ch4 + ", ch4_1=" + ch4_1 +", ch4_1=" + (int)ch4_1);
	
	/*
	boolean : true 혹은 false 두가지의 값을 가지는 자료형
		산술연산(+,-), 비교연산(<, >=)에서는 사용 불가 (ex: 1<true -> 말이되니!!)
		논리연산에서만 사용가능
	*/	
	boolean bn1 = true;
	boolean bn2 = false;
	System.out.println("bn1="+bn1 +", bn2="+bn2);
	
	/*	
	&&(논리AND): 양쪽 모두 참일때 참
	||(논리 OR): 둘중 하나만 참이어도 참 	
	*/	
	
	boolean bn3 = bn1 && bn2;
	System.out.println("bn3(And)=" + bn3);
	bn3 = bn1 || bn2;
	System.out.println("bn3(OR)=" + bn3);
	
//	'가'의 아스키코드: 44032
	bn3 = '가' > 30000;
	System.out.println("bn3=" + bn3);
	}
}
