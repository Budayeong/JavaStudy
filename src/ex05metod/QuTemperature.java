package ex05metod;

/*
섭씨(Celsius)를 입력받아서 화씨(Fahrenheit)로 변환하여 리턴하는 함수와 화씨를 입력받아서 섭씨로
변환하여 리턴하는 함수를 만들어라. 공식은 아래와 같습니다

메소드명 : celsiusToFahrenheit() , fahrenheitToCelsius()
공식]
화씨 = 1.8 * 섭씨 + 32
섭씨 = (화씨 - 32) / 1.8

*/

public class QuTemperature {
	public static void main(String[] args) {
		
		System.out.printf("섭씨: %.2f°C = 화씨: %.2f°F \n", (double)0, celsiusToFahrenheit(0));
		System.out.printf("화씨: %.2f°F = 섭씨: %.2f°C", (double)0, fahrenheitToCelsius(0));
		
	}
	
//	°C -> °F
	public static double celsiusToFahrenheit(double celsius) {
		return 1.8 * celsius + 32;
	}
	
//	°F -> °C
	public static double fahrenheitToCelsius(double fahrenheit) {
		return (fahrenheit - 32) / 1.8 ;
	}
	
}
