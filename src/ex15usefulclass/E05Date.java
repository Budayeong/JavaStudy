package ex15usefulclass;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class E05Date {
	
//	Calendar 클래스: 매개변수로 전달된 날짜서식으로 변경한 String 반환
	public static String myDateFormat(Calendar c, String formatStr) {
//		getTime() : 서버 표준 시 1070-01-01 부터 현재까지의 시간을 초 단위로 반환해줌 (=타임스테프)
		Date date = c.getTime();
		return new SimpleDateFormat(formatStr).format(date);
	}
	
	public static void main(String[] args) {
		
//		Calendear 클래스는 대표적인 싱글톤 클래스 -> new로 인스턴스 생성불가
		Calendar calendar = Calendar.getInstance();
//		월을 표현하는 Month, 분을 표현하는 Minute의 이니셜이 동일함므로 구분을 위해 월은 대문자, 분은 소문자 사용
		String nowStr1 = myDateFormat(calendar, "yyyy-MM-dd HH:mm:ss");
		System.out.println("현재1: " + nowStr1);
		String nowStr2 = myDateFormat(calendar, "오늘은 M월의 W번째 주, d번째 날, F번째 E요일");
		System.out.println("현재2: " + nowStr2);
		
//		현재 날짜를 기준으로 전/후를 구하기위해 add()메서드 사용
//		음수를 사용하면 과거의 날짜를 구할 수 있음.
		calendar.add(Calendar.DATE, 3); //3일후
		calendar.add(Calendar.MONTH, 2); //2개월후
		calendar.add(Calendar.YEAR, 1); //1년후
		
		String nowStr3 = myDateFormat(calendar, "yyyy년 MM월 dd일");
		System.out.println("1년 2개월 3일후: " + nowStr3);

//		두가지 서식의 날짜를 파싱해 구한 날짜 인스턴스를 통해 크리스마스까지 남은 날짜를 계산
//		오늘날짜: 0000-00-00, 크리스마스: 0000/00/00
		String today = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		String future = "2024/12/25";
		long reult = myDiffDate(today, future);
		System.out.println(today + "에서" + future + "까지 남은날짜: " + reult);
		
	}
	
	public static long myDiffDate(String today, String future) {
		long diffDays = 0;
		try {
			/*
			매개변수를 통해 전달된 2개의 문자열은 날짜의 서식이 다름 -> 서식을 명확히 지정해야만 날짜를 인식해 연산 가능
			String을 Date로 변환
			*/
			Date formatToday = new SimpleDateFormat("yyyy-MM-dd").parse(today);
			Date formatFuture = new SimpleDateFormat("yyyy/MM/dd").parse(future);
			System.out.println(formatToday + " <> " + formatFuture);
			
			/*
			getTime()으로 얻어오는 시간은 13자리인 정수값인데 10자리까지는 순수한 초(Sec)이고, 11~13자리는 밀리세컨즈 의미
			즉, 100으로 나눠서 뒤의 3자리를 제거하면 순수한 '초'가 됨
			또한 하루는 86400초이므로 아래와 같이 남은 날짜를 계산할 수 있음
  			*/
			diffDays = (formatFuture.getTime() - formatToday.getTime()) / (24*60*60*1000);
			
		}
		catch (Exception e) {}
		return diffDays;
	}

}
