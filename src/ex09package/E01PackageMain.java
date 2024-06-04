//패키지 선언부: 해당 클래스를 특정 패키지하위에 묶어 정의
package ex09package;

//임포트 선언부: 현재 작성중인 클래스에 다른 패키지에 선언된 클래스를 가져다 쓰기 위한 선언
import java.util.Date;
//import java.sql.Date;
//클래스명이 동일한 경우에는 하나의 클래스만 import 가능

import ex09package.study.util.CommonUtil;

//클래스 선언부 : 구현내용 작성
public class E01PackageMain {
	
	public static void main(String[] args) {
		/*
		하나의 클래스 안에서 패키지는 다르나 같은 이름의 클래스를 사용해야한다면
		방법1. 클래스명 앞에 풀 패키지 경로 기술
		방법2. 하나의 클래스는 impmort, 다른 하나는 풀패키지 경로 사용
		*/
		
//		import한 클래스
		Date utileDate = new Date();
		System.out.println("utilDate=" + utileDate);
		
		java.sql.Date sqlDate = new java.sql.Date(utileDate.getTime());
		System.out.println("sqlDate=" + sqlDate);
		
		String strValue = "987654321";
		
//		직접 정의한 클래스도 패키지가 다른 경우 import 필요
		
//		static으로 선언된 메서드는 인스턴스 생성없이 클래스명으로 메서드 호출 가능 (ex: Math클래스)
		boolean isNum = CommonUtil.isNumber(strValue);
		if(isNum==true) System.out.println("문자열은 숫자입니다.");
		else System.out.println("숫자가 아닙니다.");
		
//		메서드호출시 
		System.out.println(ex09package.study.util.CommonUtil.isNumber("백20"));
			
			
	}

}
