package ex05metod;

/*
[메서드형식4] 매개변수 O, 반환값 O (가장 많이 사용됨)
*/
import java.util.Scanner;
				
public class E05MethodType04_1 {
	public static void main(String[] args) {
//		3명의 나이를 입력받은 후 합을 반환받아 출력
		int sumOfAge = getTotalAge(3);
		System.out.println("입력받은 나이의 합은?" +sumOfAge);
	}
	
	static int getTotalAge(int personCnt) {
		/*				
		[시나리오] 인원수를 매개변수로 전달받아 인원수만큼 나이를 입력받고 그 나이의 합을 반환하라
		*/
		Scanner scanner = new Scanner(System.in);
		int sumAge = 0;

//		main에서 전달한 인수 3을 매개변수로 받아 for문에 적용
		for(int i=1 ; i<=personCnt ; i++) {
			System.out.print(i + "번째 사람의 나이: ");
			int age = scanner.nextInt();
			sumAge += age;
		}
//		sumAge == getTotalAge(3)
		return sumAge;
		
	}

}
