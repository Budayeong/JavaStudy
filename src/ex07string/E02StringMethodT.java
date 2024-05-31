package ex07string;

public class E02StringMethodT {
	public static void main(String[] args) {
		
		
		/*
		시나리오1] 주민등록번호를 이용하여 성별을 판단하는
		프로그램을 charAt()을 이용해서 작성하시오.
		190419-3000000 => 남자
		190419-4000000 => 여자
		*/	
		System.out.println("### 시나리오 1 ###");
		String juminNum = "190419-4000000";
		System.out.println("7번째 문자추출 = " + juminNum.charAt(7));
		
		char gender = juminNum.charAt(7);
		
		if(gender=='1' || gender=='3') {
			System.out.println("남자입니다");
		} else if (gender=='2' || gender=='4') {
			System.out.println("여자입니다");
		} else if (gender=='5' || gender=='6') {
			System.out.println("외국인입니다");
		} else {
			System.out.println("주민번호를 잘못 입력하였습니다");
		}
		
		
		/*
		시나리오2] 해당 문자열이 이메일 형식인지 검사하는
		프로그램을 contains()를 이용해서 작성하시오.
		hong@daum.net => 이메일형식임
		not@naver => 이메일형식이아님
		*/

		System.out.println("=== 시나리오2 ===");

		String email ="hong@daum.net";
//		String email = "not@naver";
		
		System.out.println("포함된 문자 확인하기=" + email.contains("@"));
		
		if(email.contains(".") && email.contains("@")) 
			System.out.println("이메일 형식임");
		else 
			System.out.println("이메일 형식 아님");
		
		/*
		시나리오3]주민등록번호로 성별을 구분하는 프로그램을 indexOf()와 charAt()을 
		이용해서 작성하시오.
		*/
		System.out.println("=== 시나리오3 ===");
		String jumin = "190419-2000000";
		int genderIdx = jumin.indexOf("-") + 1;
		
		if(jumin.charAt(genderIdx) =='1' || jumin.charAt(genderIdx)=='3')
				System.out.println("남성");
		else if(jumin.charAt(genderIdx) =='2' || jumin.charAt(genderIdx)=='4')
				System.out.println("여성");
		
		/*
		시나리오4] 다음 파일명에서 확장자를 잘라내는 프로그램을
		작성하시오. 
		파일명 : my.file.images.jpg
		*/
		System.out.println("=== 시나리오4 ===");
		String fileName = "my.file.images.jpg";
		
//		파일명 마지막 .의 위치 검색
		int dotPoIdx = fileName.lastIndexOf(".");
//		.위치 다음의 문자열이 파일 확장자임
		String fileExt = fileName.substring(dotPoIdx+1);
		System.out.println("파일확장자: " + fileExt);
	}
}
