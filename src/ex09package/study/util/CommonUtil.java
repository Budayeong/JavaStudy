package ex09package.study.util;

public class CommonUtil {
//	매개변수로 전달된 문자열을 검사해 숫자가 아닌 문자가 포함된 경우에는 false반환,모두 숫자인 경우 true반환
	public static boolean isNumber(String strValue) {
		
//		전달된 문자열이 빈 문자열 -> 검사 필요 없음
		if(strValue.length()==0) return false;
		
//		문자열 길이만큼 바반복
		for( int i=0 ; i<strValue.length(); i++) {
//			각 인덱스에 해당하는 문자의 아스키코드 갑
			int acode = strValue.codePointAt(i);
//			0~9사이의 문자가 아니면 false반환
			if(!(acode>='0' && acode <='9')) return false;
		}
//		문자열 전체가 숫자로만 구성되었다면 true반환
		return true;
	}
}
