package ex05metod;

/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로
변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다

메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

*/

public class QuTemperatureT {
	public static void main(String[] args) {
		System.out.println("섭씨 28도 => 화씨: " + celsiusToFahrenheit(28));
		System.out.printf("화씨 98도 => 섭씨: %.2f " , fahrenheitToCelsius(98));
	}
	
//	섭씨 -> 화씨
	public static double celsiusToFahrenheit(double cel) {
//		바로 계산결과를 반환
		return 1.8 * cel + 32;
	}
	
//	화씨 -> 섭씨
	public static double fahrenheitToCelsius(double fah) {
//		변수에 넣어서 반환
		double cel = (fah - 32) / 1.8;
		return cel;
	}
	
	
	
}
