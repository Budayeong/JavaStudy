package ex07string;

public class E02StringMethod4 {
	public static void main(String[] args) {
		
		
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/	
		String female = "190419-4000000";
		String male = "190419-3000000";
		
		if(female.charAt(7)=='4') {
			System.out.println("여성입니다");
		} else {
			System.out.println("남성입니다");
		}
	
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/

		String email ="hong@daum.net";
//		String email = "not@naver";
		
		if(email.contains(".")) 
			System.out.println("이메일 형식임");
		else 
			System.out.println("이메일 형식 아님");
		
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/
		String jumin = "190419-6000000";
		int genderIdx = jumin.indexOf("-") + 1;
		char genderChar = jumin.charAt(genderIdx);
		
		if(genderChar == '1' || genderChar =='3') 
			System.out.println("남성입니다");
		else if(genderChar == '2' || genderChar =='4')
			System.out.println("여성입니다");
		else if(genderChar == '5' || genderChar =='6')
			System.out.println("외국인입니다");
		else 
			System.out.println("주민번호를 잚소 입력하였습니다");
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/

		String file = "my.file.images.jpg";
		String fileType = file.substring(file.lastIndexOf(".")+1);
		String fileName = file.substring(0, file.lastIndexOf("."));
		System.out.println("파일명: "+fileName + ", 파잁확장자: "+fileType);
		
		
	}
}
