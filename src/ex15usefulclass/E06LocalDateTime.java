package ex15usefulclass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class E06LocalDateTime {
	public static void main(String[] args) {
		
//		LocalDate => 날짜표현
		LocalDate localDate = LocalDate.now();
		System.out.println("오늘날짜: " + localDate);
		
//		LocalTime => 시간 표현
		LocalTime localTime = LocalTime.now();
		System.out.println("현재시간: " + localTime);
		
//		LocalDateTime => 날짜,시간 동시 표현
		LocalDateTime moment = LocalDateTime.now();
		System.out.println("지금: "  + moment);
		
//		날짜와 시간의 서식 지정
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH시 mm분 ss초");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("오늘은 M월의 W번째 주, d번째 날, F번재 E요일");
		
//		앞에서 지정한 서식을 날짜에 적용해 출력
		System.out.println("서식1: " + moment.format(format1));
		System.out.println("서식2: " + moment.format(format2));
		System.out.println("서식3: " + moment.format(format3));
		
//		특정날짜 지정: LocalDate.of(년,월,일)
		LocalDate xMas = LocalDate.of(localDate.getYear(), 12, 25);
		System.out.println("크리스마스: " + xMas.format(format1));
		
//		Period클래스 : 두 날짜 사이의 간격을 나타냄. ?개월 ?일 남음으로 표시가능
		Period period = Period.between(localDate, xMas);
		System.out.println(period.getMonths() + "개월" + period.getDays() + "일 남음");
		
//		ChronoUnit클래스 : 특정 시간 단위로 날짜의 차이 계산
//		MONTHS(남은 개월수)
		System.out.println(ChronoUnit.MONTHS.between(localDate, xMas)+ "개월 남음");
//		DAYS(남은 일수)
		System.out.println(ChronoUnit.DAYS.between(localDate, xMas)+ "일 남음");
		
		System.out.println("5일전: " + moment.minusDays(5));
		System.out.println("3일후: " + moment.plusDays(3));
		System.out.println("2개월후: " + moment.plusMonths(2));
		System.out.println("1년후: " + moment.plusYears(1));
//		메서드체인 가능
		System.out.println("1년2개월3일후: " + moment.plusYears(1).plusMonths(2).plusDays(3));
		
		
	}
}
